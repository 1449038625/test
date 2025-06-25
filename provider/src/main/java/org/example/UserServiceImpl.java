package org.example;

import org.example.model.User;
import org.example.service.UserService;

/**
 * Classname: UserService
 * Package: org.example
 * Decription:
 *
 * @Author: 爱可尼科
 * @Create: 2025/6/25 - 14:42
 * @Version: v1.0
 */
public class UserServiceImpl implements UserService {
    @Override
    public User getUser(User user) {
        System.out.println("getUser方法被调用");
        user.setUsername("xiaohong");
        return user;
    }
}
