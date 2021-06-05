package HomeWorkApp;

public class cat {
    private String name;
    private int appetite;

    public cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(plate p) {
        p.decreaseFood(appetite);


    }
}
