package hw3;

public class CatPlateApp {
    public static void main(String[] args) {
        Plate plate = new Plate(40);
        Cat[] cat = {
                new Cat("Барсик", 20),
                new Cat("Космо", 10),
                new Cat("Евгений", 30),
        };
        plate.info();
        for (int i = 0; i < 3; i++) {
            cat[i].info();
            cat[i].eat(plate);
            cat[i].info();
        }
        plate.info();
        plate.addFood(31);
        plate.info();
    }
}
