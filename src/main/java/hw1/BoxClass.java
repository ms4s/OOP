package Project.OOP.hw1;

public class BoxClass {
    private String color;
    private int size;
    private boolean door;
    private String items;
    private int fill = 0;
    private String inventory;
    public BoxClass(int size){
        this.size = size;
    }

    public void info() {
        System.out.println("Цвет коробки: " + color);
        System.out.println("Размер коробки: " + size +"m3");
        if (fill == 1) {
            System.out.println("В коробке лежит: " + inventory);
        }
        if (fill < 1){
            System.out.println("В коробке ничего нет");
        }
        System.out.println(" ");
    }

    public void doorUse(boolean door){
        this.door = door;
        if (door == true){
            System.out.println("Коробка открыта");
        }
        else{
            System.out.println("Коробка закрыта");
        }
    }

    public void putItems(String items){
        this.items = items;
        if (door == true){
            fill += 1;
            inventory = items;
            System.out.println("Вы положили: " + items);
        }
        if (door == false){
            System.out.println("Коробка закрыта. Чтобы положить предмет, нужно её открыть");
        }
        if (fill > 1){
            System.out.println("Коробка заполнена");
        }
    }

    public void dropItems(String items){
        this.items = items;
        if (door == true){
            if (fill == 1){
                fill -= 1;
                System.out.println("Вы выкинули: " + items);
            }
        }
        if (door == false){
            System.out.println("Коробка закрыта. Откройте её, чтобы выкинуть предмет");
        }
    }

    public void setColor(String color){
        this.color = color;
    }
}
