package HomeWorkApp;

public class cat {
    private String name;
    private int appetite;
    private boolean satiety;


    public cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(plate p) {
        p.decreaseFood(appetite);
        if (appetite == p.getFood() || appetite < p.getFood()) {
            satiety = true;
        }
        System.out.println("Cat eat...and satiety: " + satiety);


    }
}
