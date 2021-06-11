package HomeWorkApp;

import java.util.Scanner;

public class plate {
    private int food;

    public plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Plate: " + food);
    }
    public boolean decreaseFood(int n) {

        if (food > 0 && food >= n) {
            food -= n;
            return true;
        }
        else if (food < 0){
            System.out.println("Error");
        }
        return false;
    }


    public void addPlate() { // Task #6
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add food to plate [1...] ");
        food += scanner.nextInt();
        scanner.close();
    }
}
