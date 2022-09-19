package juc;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.HashMap;

public class StringToNumber {
    {
        System.out.println("normal code block");
    }
    static {
        System.out.println("static code block");
    }
    public static void test() {
        System.out.println("static test method");
    }

    public void test2() {
        System.out.println("non-static test method");
    }

    public static void main(String[] args) {
        /*String str = "abc";
        char[] chars = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            sum+= chars[i];
        }
        System.out.println(sum);*/
       /* double a = 0.0000446;
        System.out.println(a);*/

       /* BigDecimal bigDecimal = new BigDecimal(50);
        HashMap map = new HashMap();
        map.put("test", bigDecimal);

        bigDecimal = bigDecimal.add(new BigDecimal(40));*/
        //new StringToNumber().test2();
        //test();

        /*Class<?> clazz = null;
        try {
            clazz = Class.forName("juc.StringToNumber");
            Constructor<?> ctor = clazz.getConstructor();
            //Object object = ctor.newInstance(new Object[] { });

        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/
    }

}
