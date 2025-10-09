package Project.OOP.hw2;

public class Cat extends Project.OOP.hw2.Animal {
    public Cat (String name, int runSpeed, int swimSpeed, int stamina) {
    super(name,runSpeed,swimSpeed,stamina);
    }
    @Override
    public void swim(int distance){
        System.out.println("Кошка утонула");
    }
}
