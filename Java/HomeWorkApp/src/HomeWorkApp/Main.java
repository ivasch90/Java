package HomeWorkApp;

public class Main {

    public static void main(String[] args) {
        doTask1();
        doTask2();
        doTask3();
        doTask4();
        doTask5(5, 20);
        //doTask6();
        //doTask7(new int[]{1, 2, 3});
        //doTask8(new int[]{1, 2, 3}, 1);
    }

    static void doTask1() {
        int arr[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                arr[i] = 1;
            else if (arr[i] == 1) arr[i] = 0;

        }
    }

    static void doTask2() {
        int arr[] = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;

        }
    }

    static void doTask3() {
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] *= 2;

        }
    }

    static void doTask4() {
        int [][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                    if (i == j || (i + j) == arr.length - 1)
                    arr[i][j] = 1;

                    System.out.print(arr[i][j] + "   ");

            }
            System.out.println();
        }
    }

    static int[] doTask5(int len, int initialValue) {
        int array[] = new int[len];
        for (int i = 0; i < array.length; i++)
            array[i] = initialValue;
        return array;
    }
/*
    static void doTask6() {
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[i] - arr[i]) {
                System.out.println("Самый маленький элемент в массиве " + arr[i]);
            } else if (arr[i] > arr[i]) {
                System.out.println("Самый большой элемент в массиве " + arr[i]);
            }
        }
    }

    static boolean doTask7(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr.length - 1 == arr[i] + arr[i]) {

            }
        }
        return true;
    }


    static void doTask8(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            if (n == 0) {

            } else if (n == 1) {
                for (i = 0; i < arr.length - 1; i++)
                    arr[i] = i + n;
                System.out.print(arr[i]);
            }
            System.out.println(arr[i]);
        }
    } */
}