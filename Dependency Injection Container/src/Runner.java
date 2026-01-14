import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Runner {

    public static Object run(Object object) throws InvocationTargetException, IllegalAccessException {
        Method[] methods=MethodScanner.scan(object.getClass());
        ArrayList<Object> result=new ArrayList<>();
        for (Method m:methods){
            result.add(MethodInvoker.invoke(object, m, m.getParameterTypes()));

        }
     return result;
    }
}
