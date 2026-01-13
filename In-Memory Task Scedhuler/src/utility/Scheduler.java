package utility;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import static utility.StatusType.RUNNING;
import static utility.StatusType.SCHEDULED;
import static utility.ResultType.SUCCESS;
import static utility.ResultType.FAILURE;

public class Scheduler {

    private static final TaskStore taskStore = new TaskStore();
    private static final Executor executor = new Executor();
   // public Scheduler(TaskStore taskStore) {
     //   this.taskStore = taskStore;
    //}
    public static void schedule(Task task) throws InvalidStateException{
        if (task == null) return;
        if (task.getTaskType().getDelay() <= 0) {
                throw new InvalidStateException("Delay must not be 0");
        }
        if (task.getTaskStatus().equals(SCHEDULED.name()))
        {
            throw new InvalidStateException("Status is already SCHEDULED");
        }
        task.setStatus(SCHEDULED.name());
         taskStore.put(task.getId(), task);
    }

    public static void getTasks() throws InvalidStateException{
        ArrayList<Task> tasks = new ArrayList<>();
        for (Map.Entry<AtomicInteger, Task> entry: taskStore.entrySet()){
                System.out.println(entry.getValue().getId()+" Type: "+ entry.getValue().getTaskType()+ " Status: "+ entry.getValue().getTaskStatus());
        }

    }
    public static Task getTask(AtomicInteger id) throws InvalidStateException {
        if (id == null) return null;
        return taskStore.get(id);
    }

    public ArrayList<Task> getTask(StatusType status){
        if (status == null) return null;
        ArrayList<Task> tasks = new ArrayList<>();
        for (Map.Entry<AtomicInteger, Task> entry: taskStore.entrySet()){
            if (entry.getValue().getTaskStatus().equals(status.name()))
            {
                tasks.add(entry.getValue());
            }
        }
        return tasks;
    }

    public ArrayList<Task> getTask(TaskType taskType){
        if (taskType == null) return null;
        ArrayList<Task> tasks = new ArrayList<>();
        for (Map.Entry<AtomicInteger, Task> entry: taskStore.entrySet()){
            if (entry.getValue()  .getTaskType().name()   .equals(taskType.name()))
            {
                tasks.add(entry.getValue());
            }
        }
        return tasks;
    }
    public static  void  execute(){
        ArrayList<Task> tasks = new ArrayList<>();
        for (Map.Entry<AtomicInteger, Task> entry: taskStore.entrySet()){
            if (entry.getValue()  .getTaskStatus()   .equals(SCHEDULED.name()))
            {new Thread(()-> {
                try {
                    entry.getValue().setStatus(RUNNING.name());
                    Thread.sleep(entry.getValue().getTaskType().getDelay());
                    Result result=executor.submit(entry.getValue());
                    System.out.println("The task is a "+ result.getResultType().name());
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }).start();


            }
            else {
                System.out.println(entry.getValue().getId() +" of type" +entry.getValue().getTaskType()+ " is already executed");
            }
        }
    }

    public  void  cancel(Map.Entry<Integer, Task> entry){
        new Thread(()->{
            try {
                entry.getValue().setStatus(RUNNING.name());
                Thread.sleep(entry.getValue().getTaskType().getDelay());
                executor.submit(entry.getValue());
            }
            catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        });
    }


}
