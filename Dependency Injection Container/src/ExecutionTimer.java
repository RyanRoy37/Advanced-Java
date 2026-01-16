import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ExecutionTimer {
    public static Object log(Object o, Method m, Class[] args) throws InvocationTargetException, IllegalAccessException {
        double start_time=System.nanoTime();
        Object result=m.invoke(o, args);
        double end_time=System.nanoTime();
        double time=(end_time-start_time)/1000000.0;
        System.out.println("Execution time of "+ m.getName()+" : "+time);
        return result;
    }

    public static Object runWithoutLogs(Object o, Method m, Class[] args) throws InvocationTargetException, IllegalAccessException {
        return m.invoke(o, args);
    }
}
