package org.example.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Classname: User
 * Package: org.example.model
 * Decription:用户类
 *
 * @Author: 爱可尼科
 * @Create: 2025/6/24 - 14:13
 * @Version: v1.0
 */
@Data
public class User implements Serializable {
    String username="xiaoming";
    String password="123456";
    String email="123456@qq.com";
}
