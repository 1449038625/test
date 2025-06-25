package org.example.registry;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Classname: LocalRegistry
 * Package: org.example.registry
 * Decription:局部注册器
 *
 * @Author: 爱可尼科
 * @Create: 2025/6/24 - 14:32
 * @Version: v1.0
 */
public class LocalRegistry {

    private static final ConcurrentHashMap<String, Class<?>> serviceRegistry = new ConcurrentHashMap<>();
    /**
     * 注册服务
     *
     * @param serviceName 服务名称
     * @param implClass   服务实现类
     */
    public static void register(String serviceName, Class<?> implClass) {
        // 实现注册逻辑
        serviceRegistry.put(serviceName, implClass);
    }

    /**
     * 根据服务名称获取对应的实现类
     *
     * @param serviceName 服务名称
     * @return 实现类Class对象，若未找到则返回null
     */
    public static Class<?> get(String serviceName) {
        // 返回实现类
        return serviceRegistry.get(serviceName);
    }

    /**
     * 从服务注册表中移除指定名称的服务
     *
     * @param serviceName 服务名称
     */
    public static void remove(String serviceName) {
        // 实现移除逻辑
        serviceRegistry.remove(serviceName);
    }
}
