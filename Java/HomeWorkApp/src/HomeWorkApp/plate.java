package HomeWorkApp;

public class plate {
    private int food;

    public plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void info() {
        System.out.println("Plate: " + food);
    }
    public void decreaseFood(int n) {
        if (food >= 0 || food < 0)
        food -= n;
        else {
            System.out.println("Error");
        }
    }
}
