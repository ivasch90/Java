package HomeWorkApp;

import java.util.Scanner;

public class plate {
    private int food;
    boolean eatFood = false;

    public plate(int food) {
        this.food = food;
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
        else eatFood = false;
    }

    public boolean isEatFood() {
        return eatFood;
    }

    public void addPlate() { // Task #6
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add food to plate [1...] ");
        food += scanner.nextInt();
        scanner.close();
    }
}
