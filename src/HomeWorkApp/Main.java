package HomeWorkApp;


import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    private static final byte NUMBER_TRUE = 4;


    public static void main(String[] args) {


        String[][] array = new String[NUMBER_TRUE][NUMBER_TRUE];
        array[0][0] = "bro";
        array[0][1] = "java";
        array[0][2] = "lesson";
        array[0][3] = "good";
        array[1][0] = "lose";
        array[1][1] = String.valueOf(5);
        array[1][2] = "weather";
        array[1][3] = "fly";
        array[2][0] = String.valueOf(10);
        array[2][1] = "senior";
        array[2][2] = "middle";
        array[2][3] = "junior";
        array[3][0] = "ghost";
        array[3][1] = String.valueOf(2);
        array[3][2] = "super";
        array[3][3] = "slim";

        String[][] qwerty = new String[5][5];
        String[][] mount = new String[2][3];

        try {
            //arraySumException(mount);
            //arraySumException(qwerty);
            arraySumException(array);

        } catch (MyArraySizeException  | MyArrayDataException e) {
            e.printStackTrace();

        }


    }

    public static void arraySumException(String[][] array) throws MyArrayDataException {

        if (array.length == NUMBER_TRUE) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    int sum = 0;
                    try {
                        sum =+ Integer.parseInt(array[i][j]);

                    } catch (MyArrayDataException e) {
                        e.printStackTrace();
                    } catch (NumberFormatException e) {
                        System.out.println("NumberFormatException in array " + "[" + i + "]" + "[" + j + "]");
                    }

                }
            }
        } else if (array.length > NUMBER_TRUE) {
            try {
                throw new MyArraySizeException();
            } catch (MyArraySizeException e) {
                System.out.println("Array size " + array.length + " > " + NUMBER_TRUE);
            }
        } else
            try {
                throw new MyArraySizeException();
            } catch (MyArraySizeException e) {
                System.out.println("Array size " + array.length + " < " + NUMBER_TRUE);
            }
    }
}
