package org.example.server;

/**
 * Classname: HttpServer
 * Package: org.example.server
 * Decription:服务器接口
 *
 * @Author: 爱可尼科
 * @Create: 2025/6/25 - 13:20
 * @Version: v1.0
 */
public interface HttpServer {

    /**
     * 启动服务
     * @param port
     */
    void doStart(int port);
}
