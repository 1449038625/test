package org.example.server.vertximpl;


import io.vertx.core.Vertx;
import org.example.server.HttpServer;

/**
 * Classname: VertxHttpServer
 * Package: com.zbz.rpc.server
 * Decription:监听端口并才处理请求
 *
 * @Author: 爱可尼科
 * @Create: 2025/2/4 - 11:20
 * @Version: v1.0
 */
public class VertxHttpServer implements HttpServer {
    @Override
    public void doStart(int port) {
        Vertx vertx = Vertx.vertx();
        io.vertx.core.http.HttpServer httpServer = vertx.createHttpServer();
        httpServer.requestHandler(new HttpServerHandler());
        httpServer.listen(port,result -> {
            if(result.succeeded()){
                System.out.println("Server started on port "+port);
            }else {
                System.err.println("Failed to start server"+result.cause());
            }
        });
    }
}
