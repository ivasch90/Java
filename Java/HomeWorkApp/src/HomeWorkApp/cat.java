package HomeWorkApp;

public class cat extends Animals {


    @Override
    public void run(int length) {
        if (length <= 200) {
            System.out.printf("Cat run %s%n", length);
        }
        else {
            System.out.println("Cats no run > 200");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("Cats do not like swim");
    }
}