package utility;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import static utility.StatusType.COMPLETED;
import static utility.ResultType.*;
public class Executor {
    private final ExecutorService executor= Executors.newFixedThreadPool(5);
    public Result submit (Task task)
    {
        executor.execute(()->
        {
            System.out.println(task.getId() + " of Type:" + task.getTaskType()+ " has been executed");
            task.setStatus(COMPLETED.name());

        });
        if(Math.random()%5==0)
        {
            return new Result(FAILURE);
        }
        return new Result(SUCCESS);
    }
}
