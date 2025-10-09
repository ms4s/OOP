package hw3;

public class Plate {
    protected int food;
    private int newFood;
    protected boolean positiveFood;
    private int eat;
    private int maxFood;
    public Plate (int food) {
        this.food = food;
        this.maxFood = food;
    }
    public void addFood (int newFood){
        if (newFood > maxFood){
            System.out.println("Тарелка не вмещает такое количество еды");
        }
        if (newFood + food <= maxFood) {
            food += newFood;
            System.out.println("В тарелку было добавлено: " + newFood + " еды");
        }
        if (newFood + food > maxFood){
            food = maxFood;
            System.out.println("Тарелка переполнена. Добавьте поменьше еды");
        }
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    @Override
    public String toString() {
        return "\n plate: \n  food=" + food;
    }

    public void info(){
        System.out.println(toString());
    }

}
