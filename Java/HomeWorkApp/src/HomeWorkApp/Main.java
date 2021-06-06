package HomeWorkApp;

public class Main {

    public static void main(String[] args) {
        cat cat = new cat("Barsik", 15);
        plate plate = new plate(14);
        plate.info();
        cat.eat(plate);
        plate.info();

    }
    //ublic void catArrayMethod() {

   // }
}
