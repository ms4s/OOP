package Project.OOP.hw2;

public class Horse extends Animal {
    public Horse (String name, int runSpeed, int swimSpeed, int stamina) {
        super(name,runSpeed,swimSpeed,stamina);
    }

    public void swim(int distance){
        this.distance = distance;
        double time = (double) distance / swimSpeed;
        System.out.println(name + " на прохождение " + distance + "м плавания затратил " + time + "с.");
        for (int i = 0; i <= distance - 1; i++) {
            stamina -= 4;
        }
        if (stamina <= 0){
            System.out.println(name + " устал");
        }
    }
}
