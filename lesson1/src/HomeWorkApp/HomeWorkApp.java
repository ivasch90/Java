package HomeWorkApp;

public class HomeWorkApp { // 1 задание;
    public static void main(String [] args) {
        // 6 задание;
     printThreeWords();
     checkSumSign(1,-2);
     printColor(1);
     compareNumbers(10,9);
        }
    static void printThreeWords() { // 2 задание;
        System.out.println("Orange\nBanana\nApple");
    }
    static void checkSumSign(int a, int b) { // 3 задание;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }
        else
            System.out.println("Сумма отрицательная");
    }
    static void printColor(int value) { // 4 задание;
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        else
            System.out.println("Зеленый");

    }
    static void compareNumbers(int a, int b) { // 5 задание;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else
            System.out.println("a < b");
    }

}
