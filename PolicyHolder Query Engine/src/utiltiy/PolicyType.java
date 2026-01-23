package utiltiy;

public enum PolicyType {
    LIFE("LIFE"),
    HEALTH("HEALTH"),
    MOTOR("MOTOR"),
    HOME("HOME"),
TRAVEL("TRAVEL"),
    COMMERCIAL("COMMERCIAL"),
    DEFAULT("DEFAULT");
    private String name;
    PolicyType(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }

}
