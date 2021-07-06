package HomeWorkApp;

public class Human implements Entity{
    String name;
    int range;

    public Human(String name, int range) {
        this.name = name;
        this.range = range;
    }

    @Override
    public boolean run(int length) {
        System.out.println("Human is running...");
    }

    @Override
    public boolean jump(int height) {
        System.out.println("Human is jumping...");
    }


}
