package Project.OOP.hw1;

public class Box {
    public static void main(String[] args) {
        BoxClass box = new BoxClass(20);
        box.setColor("Красный");
        box.doorUse(true);
        box.putItems("Карандаш");
        box.info();
        box.dropItems("Карандаш");
        box.info();
    }
}