package Project.OOP.hw2;

public class Cat extends Animal {
    public Cat (String name, int runSpeed, int swimSpeed, int stamina) {
    super(name,runSpeed,swimSpeed,stamina);
    }
    public void swim(int distance){
        System.out.println(name + " утонул");
    }
}
