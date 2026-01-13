import java.util.*;
import utility.*;

import static utility.TaskType.*;

public class Main{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //Task task;
        TaskType[] tasks={COMPUTATION, IO, NOTIFICATION, MAINTENANCE, USER_DEFINED };
        for (int i=0; i<20; i++)
        {
            new Thread(() -> {
                Random random = new Random();
                int index = random.nextInt(tasks.length);
                Task task = TaskFactory.getTask(tasks[index]);
                Scheduler.schedule(task);
                 }).start();
         }
        int choice = 0;
        while(true) {
            System.out.println("Tasks have been created");
            System.out.println("TASK SCHEDULER");
            System.out.println("1 to execute tasks");
            System.out.println("2 to fetch tasks");
            System.out.println("3 to exit");
            choice = input.nextInt();
            if (choice==1){
                new Thread(Scheduler::execute).start();
            }
            else if (choice==2){
                new Thread(Scheduler::getTasks).start();
            }
            else if (choice==3){
                break;
            }


        }
        input.close();
        System.exit(1);

    }
}