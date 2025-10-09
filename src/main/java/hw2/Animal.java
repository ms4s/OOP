package Project.OOP.hw2;

public abstract class Animal {
    private String name;
    private int runSpeed;
    private int swimSpeed;
    private int stamina;
    private int distance;
    public Animal(String name, int runSpeed, int swimSpeed, int stamina){
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.stamina = stamina;
    }

    public String getName(){
        return name;
    }

    public int getRunSpeed(){
        return runSpeed;
    }

    public int getSwimSpeed(){
        return swimSpeed;
    }

    public int getStamina(){
        return stamina;
    }

    public void setStamina(int stamins) {
        this.stamina = stamina;
    }

    public void info(){
        System.out.println("Кличка: " + name);
        System.out.println("Скорость бега: " + runSpeed);
        System.out.println("Скорость плавания: " + swimSpeed);
        System.out.println("Выностивость: " + stamina);
        System.out.println(" ");
    }
    public void run(int distance){
        this.distance = distance;
        double time = (double) distance / runSpeed;
        System.out.println(name + " на прохождение " + distance + "м бега затратил " + time + "с.");
        for (int i = 0; i <= distance - 1; i++) {
            stamina -= 1;
        }
        if (stamina <= 0){
            System.out.println(name + " устал");
        }
    }
    public abstract void swim(int distance);
}
