package HomeWorkApp.task3;


import java.util.ArrayList;
import java.util.List;

public class Box <T>{

    private final int capacity;
    private float weight = 0.0f;
    private float fullness = 0.0f;
    private List<T> arrayList;


    public Box(int capacity, List<T> arrayList) {
        this.capacity = capacity;
        this.arrayList = arrayList;
        fullness = arrayList.size();
    }

    public Box addToBox (T fruit) {
        if (fullness < capacity) {
            arrayList.add((int) fullness, fruit);
            fullness++;
        } else {
            System.out.println("Error!!! The Box " + fruit.getClass() + " capacity: " + capacity);
        }
        return this;
    }

    public float getWeight () {
        this.weight = fullness;
        return weight;
    }

    public boolean compare (Box another) {
        return false;
    }

    @Override
    public String toString() {
        return "Box{" +
                "capacity=" + capacity +
                ", weight=" + weight +
                ", fullness=" + fullness +
                '}';
    }
}
