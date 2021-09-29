package HomeWorkApp;

import HomeWorkApp.task3.Apple;
import HomeWorkApp.task3.Box;
import HomeWorkApp.task3.Fruit;
import HomeWorkApp.task3.Orange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        printArray(changeArraySlot(createStringArray(), 0,2));
        printArray(changeArraySlot(createIntegerArray(), 0, 1));
        System.out.println(convertArrToList(createStringArray()));
        System.out.println(convertArrToList(createIntegerArray()));

        System.out.println("============================================");

        Apple apple = new Apple();
        Orange orange = new Orange();
        List<Orange> orangeList = new ArrayList<>();
        orangeList.add(orange);
        Box<Orange> orangeBox = new Box<>(4);
        orangeBox.addToBox(orangeList);                             //add to Box List
        System.out.println(orangeBox);
        Box<Apple> appleBox = new Box<>(5);
        appleBox.addToBox(apple);                                   // add to Box one
        appleBox.addToBox(apple);
        appleBox.addToBox(apple);
        appleBox.addToBox(apple);
        System.out.println(appleBox);
        Box<Orange> orangeBoxOther = new Box<>(10);
        orangeBoxOther.addToBox(orangeList);
        System.out.println(orangeBoxOther);
        System.out.println(orangeBox.compare(orangeBoxOther));          // compare Box (true / false)
        orangeBoxOther.addToBox(orange);
        orangeBox.merge(orangeBoxOther);                                //merge Box
        System.out.println(orangeBoxOther);                             //Print new merge Box

    }


    // 1) Task
    private static Object[] changeArraySlot(Object[] arr, int index1, int index2) {
            Object tmp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = tmp;

        return arr;
    }
    private static String[] createStringArray() {
        return new String[]{"Hello","Java","World","Lesson"};
    }

    private static void printArray(Object[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    private static Integer[] createIntegerArray() {
        return new Integer[] {1, 2, 3, 4, 5};
    }

    // 2) Task
    private static ArrayList<Object> convertArrToList (Object[] arr) {
        ArrayList<Object> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(i, arr[i]);
        }
        return arrayList;
    }

}
