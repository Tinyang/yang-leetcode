package juc;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author: Yangx
 * @Date: 7/25/2022
 */
public class learn {
    private static final int COUNT_BITS = Integer.SIZE - 3;
    private static final int COUNT_MASK = (1 << COUNT_BITS) - 1;

    // runState is stored in the high-order bits
    private static final int RUNNING    = -1 << COUNT_BITS;
    private static final int RUNNING2   = 3 << COUNT_BITS;

    public static void main(String[] args) {
        /*Integer a = 1;
        String b = "test" + a.toString();
        StringBuilder c = new StringBuilder("testCCCC").append(a);
        System.out.println(b);
        System.out.println(c);
        a += 1;
        System.out.println(b);
        System.out.println(c);*/

        Student student = new Student();
        String b = new String("test" + student);
        StringBuilder c = new StringBuilder("testCCCC").append(new String(student.toString()));
        System.out.println(b);
        System.out.println(c);
        student.setName("6666");
        System.out.println(b);
        System.out.println(c);
    }
}
