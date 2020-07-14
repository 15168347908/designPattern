package proxy.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * 代理对象工厂
 *
 * @author jiangzy
 */
public class ProxyFactory {

    private final Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("代理开始");
                    Object returnVal = method.invoke(target, args);
                    System.out.println("代理结束");
                    return proxy;
                }
        );
    }
}
