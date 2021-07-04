package HomeWorkApp;

public class Cat implements Entity{
    String name;
    int range;

    public Cat(String name, int range) {
        this.name = name;
        this.range = range;
    }

    @Override
    public void run(Obstacles[] obstacles) {
        System.out.println("Cat run!!!");
    }

    @Override
    public void jump(Obstacles[] obstacles) {
        System.out.println("Cat jump!!!");
    }


}
