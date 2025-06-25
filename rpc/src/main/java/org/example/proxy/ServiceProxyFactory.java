package org.example.proxy;

import java.lang.reflect.Proxy;

/**
 * Classname: ServiceProxyFactory
 * Package: org.example.proxy
 * Decription:
 *
 * @Author: 爱可尼科
 * @Create: 2025/6/24 - 17:20
 * @Version: v1.0
 */
public class ServiceProxyFactory {
    public static <T> T getProxy(Class<T> serviceClass) {
        return (T) Proxy.newProxyInstance(
                serviceClass.getClassLoader(),
                new Class<?>[]{serviceClass},
                new ServiceProxy());
    }
}
