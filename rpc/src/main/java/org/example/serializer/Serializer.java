package org.example.serializer;

import java.io.IOException;

/**
 * Classname: Serializer
 * Package: org.example.serializer
 * Decription:序列化接口
 *
 * @Author: 爱可尼科
 * @Create: 2025/6/24 - 14:18
 * @Version: v1.0
 */
public interface Serializer {
    /**
     * 序列化对象为字节数组
     * @param object 需要被序列化的对象
     * @return 返回对象的二进制表示的字节数组
     */
    <T> byte[] serialize(T object) throws IOException;

    /**
     * 将字节数组反序列化为指定类型的对象
     * @param bytes 二进制数据
     * @param type 目标类型
     * @return 返回反序列化后的对象
     */
    <T> T deserialize(byte[] bytes, Class<T> type) throws IOException;
}
