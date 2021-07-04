package HomeWorkApp;

public class Robot implements Entity{
    String name;
    int range;

    public Robot(String name, int range) {
        this.name = name;
        this.range = range;
    }

    @Override
    public void run(Obstacles[] obstacles) {
        System.out.println("Robot run...");
    }

    @Override
    public void jump(Obstacles[] obstacles) {
        System.out.println("Robot jump...");
    }


}
