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

    public boolean eat(plate p) {
        p.decreaseFood(appetite);
        if (p.isEatFood())
            this.satiety = true; // Task #3

        System.out.println("Cat eat...and satiety: " + satiety);
        return false;
    }

}
