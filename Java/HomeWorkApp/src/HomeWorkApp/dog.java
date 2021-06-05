package HomeWorkApp;

public class dog extends Animals {


    @Override
    public void run(int length) {
        if (length <= 500 && length >= 0) {
            System.out.println("Dog run " + length);
        }
        else {
            System.out.println("Dog no run > 500");
        }

    }

    @Override
    public void swim(int length) {
        if (length <= 10 && length >= 0) {
            System.out.println("Dog swim " + length);
        }
        else {
            System.out.println("Dog no swim > 10");
        }

    }
}