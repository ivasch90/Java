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


        //Box box1 = new Box(8);
       // box1.addToBox(new Apple(), 8);
        //Box box2 = new Box( 7);
        //box2.addToBox(new Orange(), 7);

        Apple apple = new Apple();
        Orange orange = new Orange();
        List<Apple> appleList = new ArrayList<>();
        appleList.add(apple);
        Box box3 = new Box(5, appleList);
        //List<Apple> appleList = new ArrayList<>();
        //box3.addToBox;
        box3.addToBox(apple);
        box3.addToBox(apple);
        box3.addToBox(apple);
        //box3.addToBox(apple);

        box3.addToBox(box3);
        box3.getWeight();
        System.out.println(apple.getWeight());
        //box3.addToBox(orange);
        //box3.addToBox(orange);
        //box3.addToBox(orange);


        //System.out.println(box1);
        //System.out.println(box2);
        System.out.println(box3);
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
