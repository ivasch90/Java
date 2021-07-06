package HomeWorkApp;

public class Main {

    public static void main(String[] args) {
        Entity [] entities = {
                new Cat("Kuzya", 5),
                new Human("Ivan", 10),
                new Robot("T1000",20),
        };
        Obstacles [] obstacles = {
                new Wall(1),
                new Treadmill(2),
        };

        for (int i = 0; i < entities.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
            if (obstacles[j].passing(entities[i]) == false)
                break;
            }
            System.out.println();

        }
        }
    }


