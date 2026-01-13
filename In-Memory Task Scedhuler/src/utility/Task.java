package utility;

import java.util.concurrent.atomic.AtomicInteger;

public class Task {
  //  private int id=0;
    private AtomicInteger id=new AtomicInteger(0);
    private final TaskType taskType;
    private String TaskStatus;

    protected Task( TaskType taskType) {
        id.getAndIncrement();
        this.taskType = taskType;
    }
    public AtomicInteger getId() {
        return id;
    }
    public TaskType getTaskType() {
        return taskType;
    }
    public String getTaskStatus() {
        return TaskStatus;
    }
    public void setStatus(String status) {
        TaskStatus=status;
    }
}

