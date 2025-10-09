package Project.OOP.hw2;

public class Dog extends Project.OOP.hw2.Animal {
    public Dog (String name, int runSpeed, int swimSpeed, int stamina) {
        super(name,runSpeed,swimSpeed,stamina);
    }

    @Override
    public void swim(int distance){
        double time = (double) distance / getSwimSpeed();
        System.out.println(getName() + " на прохождение " + distance + "м плавания затратил " + time + "с.");
        for (int i = 0; i < distance; i++) {
            setStamina(getStamina() - 2);
        }
        if (getStamina() <= 0){
            System.out.println(getName() + " устал");
        }
    }
}
