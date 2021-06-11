package HomeWorkApp;

public class Main {

    public static void main(String[] args) {
        catArrayMethod(); //Task #5
        System.out.println("=============================");
        cat cat = new cat("Barsik", 15);
        plate plate = new plate(14);
        plate.info();
        cat.eat(plate);
        plate.info();
        System.out.println("=============================");
        plate.addPlate(); //Task #6
        plate.info();


    }

    public static void catArrayMethod() {    //Task #5
        cat[] catArray = new cat[5];
        catArray[0] = new cat("kisa", 10);
        catArray[1] = new cat("murzik", 5);
        catArray[2] = new cat("john", 7);
        catArray[3] = new cat("lisa", 6);
        catArray[4] = new cat("yellow", 9);

        plate plate = new plate(29);
        plate.info();
        for (int i = 0; i < catArray.length; i++) {
            catArray[i].eat(plate);
            plate.info();
        }

    }
}
