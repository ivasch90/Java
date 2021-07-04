package HomeWorkApp;

public class Main {

    public static void main(String[] args) {
        Entity [] entities = {
                new Cat("Kuzya", 5),
                new Human("Ivan", 10),
                new Robot("T1000",20),
        };
        Obstacles [] obstacles = {
                new Wall(),
                new Treadmill(),
        };

        for (Entity entity : entities) {
            entity.run(obstacles);
            entity.jump(obstacles);
        }
    }

}
