package org.example;


import org.example.model.User;
import org.example.proxy.ServiceProxyFactory;
import org.example.service.UserService;

/**
 * Classname: EasyConsumerExample
 * Package: org.example
 * Decription:
 *
 * @Author: 爱可尼科
 * @Create: 2025/6/25 - 15:14
 * @Version: v1.0
 */
public class EasyConsumerExample {
    public static void main(String[] args) {
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        User user1 = userService.getUser(new User());
        System.out.println(user1);
    }
}

