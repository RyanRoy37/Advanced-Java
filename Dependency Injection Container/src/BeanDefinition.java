import java.lang.reflect.Constructor;

public class BeanDefinition
{

    private final Class<?> beanClass;
    private final boolean lazy;
    private Object bean;
    private boolean created;
    private Constructor<?> constructor;
    public BeanDefinition(Class<?> beanClass, boolean lazy)
    {
        this.beanClass = beanClass;
        this.lazy = lazy;
    }
    public Object  setbean(Object obj, boolean created)
    {
        this.bean = obj;
        this.created = created;
        return bean;
    }
    public Constructor<?> setConstructor(Constructor<?> constructor)
    {
        this.constructor = constructor;
        return constructor;
    }
    public Class<?> getBeanClass()
    {
        return beanClass;
    }
    public boolean isLazy()
    {
        return lazy;
    }
    public Object getBean(){
        return bean;
    }
    public Constructor<?> getConstructor(){
        return constructor;
    }
    public boolean isCreated(){
        return created;
    }
}





