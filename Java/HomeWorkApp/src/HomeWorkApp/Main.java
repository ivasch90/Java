package HomeWorkApp;

public class Main {

    public static void main(String[] args) {
        cat cat = new cat("Barsik", 5);
        plate plate = new plate(100);
        plate.info();
        cat.eat(plate);
        plate.info();


    }
}
