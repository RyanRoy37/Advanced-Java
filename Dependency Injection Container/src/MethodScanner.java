import utility.LogExecutionTime;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class MethodScanner
{
    private Class<?> c;

   /* public MethodScanner(Class<?> c)
    {
        this.c=c;
    }*/

    public static Method[] scan(Class<?> c)
    {

        Method[] lists=c.getDeclaredMethods();

    return lists;
    }
}
