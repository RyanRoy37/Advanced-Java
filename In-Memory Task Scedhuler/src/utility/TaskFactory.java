package utility;

public class TaskFactory {

    public static Task getTask(TaskType taskType){
        return new Task(taskType);
    }

}
