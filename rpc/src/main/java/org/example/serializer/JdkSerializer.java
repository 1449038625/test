package org.example.serializer;

import java.io.*;

/**
 * Classname: JdkSerializer
 * Package: org.example.serializer
 * Decription:
 *
 * @Author: 爱可尼科
 * @Create: 2025/6/24 - 14:19
 * @Version: v1.0
 */
public class JdkSerializer implements Serializer {
    /**
     * 将对象序列化为字节数组。
     *
     * @param <T> 泛型类型，表示要序列化的对象的类型。
     * @param object 要序列化的对象。
     * @return 序列化后的字节数组。
     * @throws IOException 如果序列化过程中发生I/O错误，抛出IOException异常。
     */
    @Override
    public <T> byte[] serialize(T object) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(object);
        objectOutputStream.close();
        return outputStream.toByteArray();
    }

    /**
     * 将字节数组反序列化为指定类型的对象。
     *
     * @param bytes 需要反序列化的字节数组
     * @param type  反序列化后对象的类型
     * @param <T>   反序列化后对象的类型
     * @return 反序列化后的对象
     * @throws IOException 如果在反序列化过程中发生I/O错误，则抛出此异常
     */
    @Override
    public <T> T deserialize(byte[] bytes, Class<T> type) throws IOException {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        try {
            return (T)objectInputStream.readObject();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
