package org.example;

import org.example.registry.LocalRegistry;
import org.example.server.HttpServer;
import org.example.server.vertximpl.VertxHttpServer;
import org.example.service.UserService;

/**
 * Classname: EasyProviderExample
 * Package: org.example
 * Decription:
 *
 * @Author: 爱可尼科
 * @Create: 2025/6/25 - 15:02
 * @Version: v1.0
 */
public class EasyProviderExample {
    public static void main(String[] args) {
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);
        // 启动 web 服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
