package HomeWorkApp;

public class Main {

    public static void main(String[] args) {
    summa(1,17);
    positiveOrNegative(-90);
    negativeOrPositive(5);
    stringNumber("Примерная строка",5);

    }

    public static boolean summa (int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void positiveOrNegative (int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " является положительным");
        }
        else {
            System.out.println("Число " + a + " является отрицательным");
        }

    }
    public static boolean negativeOrPositive (int a) {
        if (a >= 0) {
            System.out.println("false");
            return false;

        }
        else {
            System.out.println("true");
            return true;
        }

    }
    public static void stringNumber (String st, int num) {
        int i;
        for (i = 0; i < num; i++)
            System.out.println(st);

    }
/*
    public static boolean god() {
        int a = 2020;
        final int b = 4;
        int i;
           for (i = 0; i <= a; i += b)
            System.out.println("Високосный год " + i);
           if (true) {
               System.out.println("true");
           }
           else {
               System.out.println("false");
           }

        return true;

    }
*/
}
