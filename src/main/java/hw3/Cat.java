package hw3;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    @Override
    public String toString() {
        return "\n  Name = " + name + "\n  Appetite = " + appetite;
    }

    public void info() {
        System.out.println(toString());
        if (satiety == true){
            System.out.println(name + " наелся");
        }
        else {
            System.out.println(name + " голоден");
        }
    }

    public void eat(Plate plate){
        if (plate.food > 0){
            plate.positiveFood = true;
        }
        else {
            plate.positiveFood = false;
        }
        if (plate.positiveFood == true && plate.food > appetite){
            System.out.println(name + " поел");
            plate.setFood(plate.getFood() - appetite);
            satiety = true;
        }
        else {
            System.out.println(name + ": Мне не хватит еды. Насыпь ещё");
        }
    }
}
