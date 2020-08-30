package chapter1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 李祖龙
 * @date 2020-8-29
 * @deprecated  求斐波那契数列第n项的值：f(1)=1；f(2)=1；f(n)=f(n-1)+f(n-2)，n>2
 */
public class Fibonacci {


    public static long fib_rec(int n){

        if(n<=2){
            return 1;
        }

        return fib_rec(n-1)+fib_rec(n-2);
    }

    public static long fib_for(int n){
        if(n <= 2){
           return 1;
        }
        long first,sencond,res;
        first=1;
        sencond=1;
        res=0;
        for (int i=2;i<n;i++){
            res = first + sencond;
            first = sencond;
            sencond = res;
        }
        return res;
    }

    public static void testFib_rec(int n){
        long start, end, res;
        start = System.currentTimeMillis();
        res = fib_rec(n);
        end = System.currentTimeMillis();
        System.out.println(res);
        System.out.println(end-start);
    }

    public static void testFib_for(int n) {
        long start, end, res;
        start = System.currentTimeMillis();
        res = fib_for(n);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("报错了");
        }
        end = System.currentTimeMillis();
        System.out.println(res);
        System.out.println(end-start);
    }

    public static void main(String[] args){
//        testFib_rec(50);
        testFib_for(5000);
    }
}
