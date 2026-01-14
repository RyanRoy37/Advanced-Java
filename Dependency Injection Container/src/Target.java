import utility.LogExecutionTime;

public class Target {
    @LogExecutionTime
    public void print(){
        for (int i=0;i<100000;i++){
            System.out.print(i);
        }
    }
    @LogExecutionTime
    public void pattern(){
        for (int i=0;i<999;i++){
            System.out.print(i%2 ==0 ? "@":"#");
        }
    }

}
