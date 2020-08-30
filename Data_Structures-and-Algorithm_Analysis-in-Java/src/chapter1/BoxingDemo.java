package chapter1;

/**
 * @author java6b
 * @date 2020-8-28
 * @deprecated  测试自动装箱/拆箱
 */
public class BoxingDemo {
    public static void main(String[ ] args)
    {
        GenericMemoryCell<Integer> m = new GenericMemoryCell<>();

        //自动装箱
        m.write(37);
        //自动拆箱
        int val = m.read();
        System.out.println( "Contents are: "+ val );
    }
}
