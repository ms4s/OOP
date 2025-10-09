package Project.OOP.hw2;

public class MainApplication {
    public static void main(String[] args) {
        Cat cat = new Cat("Вася", 6, 0, 50);
        Dog dog = new Dog("Боря", 5, 3, 40);
        Horse horse = new Horse("Искра", 8, 2, 70);
        cat.swim(17);
        cat.info();
        dog.swim(5);
        dog.info();
        horse.run(52);
        horse.info();
    }
}