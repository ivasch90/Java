package HomeWorkApp;

public class Main {
    static final byte NUMBER_TRUE = 4;
    public static void main(String[] args) {


        String[][] array = new String[NUMBER_TRUE][NUMBER_TRUE];
        array[0][0] = "bro";
        array[0][1] = "java";
        array[0][2] = "lesson";
        array[0][3] = "good";
        array[1][0] = "lose";
        array[1][1] = "io";
        array[1][2] = "weather";
        array[1][3] = "fly";
        array[2][0] = "pop";
        array[2][1] = "senior";
        array[2][2] = "middle";
        array[2][3] = "junior";
        array[3][0] = "ghost";
        array[3][1] = "react";
        array[3][2] = "super";
        array[3][3] = "slim";

        String[][] qwerty = new String[5][5];
        String[][] mount = new String[2][3];

        try {
            arraySumException(mount);
            arraySumException(qwerty);
            arraySumException(array);

        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();

        }
        finally {
            System.out.println("Array size " + mount.length + " is not " + NUMBER_TRUE);
            System.out.println("Array size " + qwerty.length + " is not " + NUMBER_TRUE);

        }


    }

    public static void arraySumException(String[][] array) throws MyArraySizeException, MyArrayDataException {

        if (array.length == NUMBER_TRUE) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    int sum = 0;
                    try {
                        sum = +Integer.parseInt(array[i][j]);
                        System.out.println(sum);
                    } catch (NumberFormatException e) {
                        //e.printStackTrace();
                        System.out.println("NumberFormatException " + array + "[" + i + "]" + "[" + j + "]");
                    }

                }
            }
        }

        }
}