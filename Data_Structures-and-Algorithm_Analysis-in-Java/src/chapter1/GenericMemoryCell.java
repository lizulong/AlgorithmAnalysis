package chapter1;

import java.util.Collection;

/**
 * @author lzl
 * @date 2020-8-28
 * @deprecated 泛型在类中的使用
 */
public class GenericMemoryCell<AnyType>//声明一个泛型类
{
    /**
     * 指定泛型类型的作用域——私有
     */
    private AnyType storedValue;

    public AnyType read() {//泛型方法——使用泛型类型作为返回类型
        return storedValue;
    }
    public void write( AnyType x ) {//泛型方法——使用泛型类型作为方法参数
        storedValue = x;
    }

    /**
     * 泛型方法——通配符
     * @param arr
     * @return
     */
    public static double total_Area( Collection<? extends Shape> arr ) {
        double total = 0;

        for( Shape s : arr ){
            if( s != null ){
                total += s.area();
            }
        }
        return total;
    }

    /**
     * 泛型static方法
     * 1.该类型用在多于一个的参数类型中；
     * 2.该类型用于声明一个局部变量。
     * @param arr
     * @param x
     * @param <AnyType>
     * @return boolean
     */
    public static <AnyType> boolean contains( AnyType [ ] arr, AnyType x ){
        for( AnyType val : arr ) {
            if (x.equals(val)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 泛型方法的类型限界
     * @param arr
     * @param <AnyType>
     * @return AnyType
     */
    public static <AnyType extends Comparable<? super AnyType>>
        AnyType findMax( AnyType [ ] arr )
    {
        int maxindex = 0;

        for( int i = 1; i < arr.length; i++ ) {
            if (arr[i].compareTo(arr[maxindex]) > 0 ){
                maxindex = i;
            }
        }
        return arr[ maxindex ];
    }

    /**
     * 自动装箱/拆箱
     * 自动装箱：若int型变量被传递到需要一个 Integer 对象的地方，编译器将自动调用 Integer 构造方法。
     * 自动拆箱：若 Integer 对象被放到需要int型变量的地方，则编译器自动调用 intValue 方法。
     * 对于其他 7 种基本类型包装类型，同样会发生类似的情形。
     */
    public void boxing(){
        GenericMemoryCell<Integer> m1 = new GenericMemoryCell<Integer>();
        //使用Java7中的菱形运算符
        GenericMemoryCell<Integer> m2 = new GenericMemoryCell<>();

        //自动装箱
        m1.write(37);
        m2.write(5);
        //自动拆箱
        int val1 = m1.read();
        int val2 = m2.read();
        System.out.println( "Contents are: "+ val1 );
        System.out.println( "Contents are: "+ val2 );
    }

}
