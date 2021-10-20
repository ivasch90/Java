package HomeWorkApp;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;


public class TestClassRun {

    public static void main(String[] args) {
        Class<?> testClass = TestClass.class;
        start(testClass);
    }

    public static void start(Class testClass) {
        int before = 0;
        int after = 0;


        for (Method method : testClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(BeforeSuite.class)) {
                try {
                    method.invoke(null);
                    before++;
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
                if (before > 1) {
                    throw new RuntimeException("BeforeSuite annotation must be 1");
                }
            }
        }

        Method [] methods = testClass.getDeclaredMethods();
        int testMed = 0;
        for (Method method: methods) {
            if (method.isAnnotationPresent(Test.class)) {
                testMed++;
            }
        }

        int [] arr = new int[testMed];
        for (int i = 0; i < arr.length; i++) {
            for (Method method : methods) {
                if (method.isAnnotationPresent(Test.class)) {
                    arr[i] = method.getAnnotation(Test.class).value();
                    i++;
                }
            }
        }

        Arrays.sort(arr);
            for (int i = arr.length - 1; i >= 0; i--) {
                for (Method method : methods) {
                    if (method.isAnnotationPresent(Test.class))

                        if (arr[i] == method.getAnnotation(Test.class).value()) {
                            try {
                                method.invoke(null);
                                break;
                            } catch (IllegalAccessException | InvocationTargetException e) {
                                e.printStackTrace();
                            }

                        }
                }
            }
        for (Method method : testClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(AfterSuite.class)) {
                try {
                    method.invoke(null);
                    after++;
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
                if (after > 1) {
                    throw new RuntimeException("AfterSuite annotation must be 1");
                }
            }
        }
    }
}