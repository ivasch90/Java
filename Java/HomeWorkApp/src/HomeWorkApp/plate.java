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
        food -= n;
    }
}
