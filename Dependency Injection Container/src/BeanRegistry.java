import java.util.concurrent.ConcurrentHashMap;

public class BeanRegistry   {
    ConcurrentHashMap<Class<?>,BeanDefinition> map=new ConcurrentHashMap<>();
    private static final BeanRegistry INSTANCE = new BeanRegistry();
    public static BeanRegistry getBeanRegistry(){
        return INSTANCE;
    }
    public void register(Class<?> beanClass, BeanDefinition beanDefinition) {
        if (map.containsKey(beanClass)) {
            System.out.println("BeanDefinition already exists");
        } else {
            map.put(beanClass, beanDefinition);
        }
    }
    public BeanDefinition get(Class<?> beanClass){
        return map.get(beanClass);
    }

}
