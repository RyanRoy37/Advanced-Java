package utility;

public enum TaskType {
    COMPUTATION("HIGH", 1),
    IO("LOW", 3),
    NOTIFICATION("LOW", 5),
    MAINTENANCE("LOW", 6),
    USER_DEFINED("MEDIUM", 2);

    private String priority;
    private int delay;
    TaskType( String priority, int delay ){
        this.priority=priority;
        this.delay=delay;
    }
    public String getPriority() {
        return this.priority;
    }
    public int getDelay() {
        return this.delay;
    }
}

