package HomeWorkApp;

public class Human implements Entity{
    String name;
    int range;

    public Human(String name, int range) {
        this.name = name;
        this.range = range;
    }

    @Override
    public void run(Obstacles[] obstacles) {
        System.out.println("Human is running...");
    }

    @Override
    public void jump(Obstacles[] obstacles) {
        System.out.println("Human is jumping...");
    }


}
