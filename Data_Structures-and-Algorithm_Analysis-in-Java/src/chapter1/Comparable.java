package chapter1;
/**
 * @author lzl
 * @date 2020-8-28
 * @deprecated  泛型在接口中的使用
 */
public interface Comparable<AnyType> {
    /**
     * 声明一个泛型方法——使用泛型类型作为方法参数
     * @param other
     * @return int
     */
    public  int compareTo( AnyType other );

    /**
     * 泛型方法——使用泛型类型作为返回类型
     * @return AnyType
     */
    public AnyType wuzl6b();
}
