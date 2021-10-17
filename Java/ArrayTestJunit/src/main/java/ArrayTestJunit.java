import java.util.Arrays;


public class ArrayTestJunit {


    public static int[] arrayLastElementsFour(int[] arr) {
            int[] arrayFour = new int[arr.length];
            if (arr.length > 0) {
                int[] arrSorted = new int[arr.length];
                System.arraycopy(arr, 0, arrSorted, 0, arr.length);
                Arrays.sort(arrSorted);
                int y = Arrays.binarySearch(arrSorted, 4);
                if (y >= -1) {
                    for (int i = arr.length - 1; i >= 0; i--) {
                        if (arr[i] == 4) {
                            int newArrayLength = arr.length - 1 - i;
                            arrayFour = new int[newArrayLength];
                            System.arraycopy(arr, i + 1, arrayFour, 0, newArrayLength);
                            break;
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        return arrayFour;
    }

    public static boolean isArrayOneAndFour(int[] arr) {
        boolean isTrue = true;
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] == 1 || arr[i] == 4)) {
                isTrue = false;
                break;
            }
        }
        return isTrue;
    }
}