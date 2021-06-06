package HomeWorkApp;

public class plate {
    private int food;
    boolean eatFood = false;

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

        if (food > 0 && food >= n) {
            food -= n;
            eatFood = true;
        }
        else if (food < 0){
            System.out.println("Error");
        }
    }

    public boolean isEatFood() {
        return eatFood;
    }
}
