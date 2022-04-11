import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflection {
    private String s;

    public Reflection(String s) {
        this.s = s;
    }

    public void method1() {
        s = s + "kire";
        System.out.println("The string is " + s);
    }

    private void method2() {
        s = s + "kire";
        System.out.println("The string is " + s);

    }
}

class Demo {
    public static void main(String[] args) throws Exception {
        Reflection test = new Reflection("Hello");
        Class cls = test.getClass();
        System.out.println("The name of class is " +
                cls.getName());
        Method[] methods = cls.getMethods();

        for (Method mmethod : methods) {
            System.out.println("The name of method is " +
                    mmethod.getName());
        }
        Method methodcall1 = cls.getDeclaredMethod("method2",
                int.class);// get desired method
        methodcall1.invoke(test, 1);// invoke method at runtime

        Method methodcall3 = cls.getDeclaredMethod("method3");
        methodcall3.setAccessible(true);
    }
}