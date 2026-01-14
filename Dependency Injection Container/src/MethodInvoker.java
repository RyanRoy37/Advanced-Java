import utility.LogExecutionTime;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class MethodInvoker
{
    private Object object;
    private Method method;
    private Object[] arguments;

    public static Object invoke(Object object, Method method, Class[] arguments) throws InvocationTargetException, IllegalAccessException
    {
        /*ArrayList<Method> final_list=new ArrayList<>();
        for (Method m : lists){
            if (m.getAnnotation(LogExecutionTime.class)!=null)
            {
                final_list.add(m);
            }
        }*/
        Object result = null;
        if (method.getAnnotation(LogExecutionTime.class)!=null)
        {
            result=ExecutionTimer.log(object, method, arguments);
             }
        else {
            result=ExecutionTimer.runWithoutLogs(object, method, arguments);
        }
        return result;
    }
}
