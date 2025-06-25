package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.serializer.Serializer;

import java.io.Serializable;

/**
 * Classname: RpcResponse
 * Package: org.example.model
 * Decription:rpc响应类
 *
 * @Author: 爱可尼科
 * @Create: 2025/6/24 - 20:15
 * @Version: v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RpcResponse implements Serializable {
    /**
     * 响应数据
     */
    private Object data;
    /**
     * 响应数据类型
     */
    private Class<?> dataType;
    /**
     * 响应信息
     */
    private String message;
    /**
     * 异常信息
     */
    private Exception exception;
}

