package juc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * author: Yang
 * Date: 8/19/2022
 */
public class Student {
    String name = "name";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Class<?> clazz = null;
        try {
            clazz = Class.forName("juc.StringToNumber");
            Constructor<?> ctor = clazz.getConstructor();
            Object object = ctor.newInstance(new Object[] { });
            ((StringToNumber)object).test2();

            Method method = clazz.getMethod("test");
            method.invoke(null);

            Method method2 = clazz.getMethod("test2");
            method2.invoke(object);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
