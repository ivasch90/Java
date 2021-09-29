package HomeWorkApp.task3;


import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>{

    private final int capacity;
    private float weight = 0.0f;
    private int fullness = 0;
    private List<T> arrayList = new ArrayList<>();


    public Box(int capacity) {
        this.capacity = capacity;
    }

    public void addToBox (T fruit) {
        if (fullness < capacity) {
            arrayList.add(fruit);
            fullness++;
        } else {
            System.out.println("Error!!! The Box " + fruit.getClass() + " capacity: " + capacity);
        }
    }
    public void addToBox (List<T> arrayList) {
        if (fullness < capacity) {
            this.arrayList.addAll(arrayList);
            fullness += arrayList.size();
        }
    }

    public float getWeight () {
        if (fullness > 0) {
            return arrayList.get(0).getWeight() * fullness;
        }
        return 0.0f;
    }

    public boolean compare (Box<? extends Fruit> another) {
        return Math.abs(getWeight() - another.getWeight()) == 0;            // if > 0.0001 result false
    }

    public void merge (Box<T> box) {

        if (box.capacity > (box.fullness + fullness)) {
            box.getArrayList().addAll(arrayList);
            box.fullness += arrayList.size();
            arrayList.clear();
            System.out.println("Great! You are merge Fruits ");
        }
        else {
            System.out.println("Error! few capacity " + capacity);
        }
    }

    public List<T> getArrayList() {
        return arrayList;
    }

    @Override
    public String toString() {
        return "Box{" +
                "capacity=" + capacity +
                ", weight=" + getWeight() +
                ", fullness=" + fullness +
                '}';
    }
}
