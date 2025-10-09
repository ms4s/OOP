package Project.OOP.hw1;

public class MainApplication {
    public static void main(String[] args) {
        User[] users = {
                new User("Иванов", "Иван", "Иванович", 1990, "ышщпу@mail.ru"),
                new User("Путин", "Владимир", "Владимирович", 2000, "ыквпу@mail.ru"),
                new User("Мутабеков", "Муратбек", "Муратбекович", 2010, "ышщпу@mail.ru"),
                new User("Старк", "Тони", "Железнович", 1960, "ышщпу@mail.ru"),
                new User("Акрешкин", "Добби", "Потерович", 1900, "ышщпу@mail.ru"),
                new User("Джобс", "Стив", "Кайратович", 2001, "ышщпу@mail.ru"),
                new User("Исин", "Рахат", "Асхатович", 1430, "ышщпу@mail.ru"),
                new User("Ахметов", "Нурасыл", "Аскарович", 1950, "ышщпу@mail.ru"),
                new User("Байсенова", "Улболсын", "Балгабаевна", 2020, "ышщпу@mail.ru"),
                new User("Великий", "Артур", "Римский", 1890, "ышщпу@mail.ru"),
                        };

        for (int i = 0; i < users.length; i++) {
            if (users[i].age() > 40){
                users[i].info();
                System.out.println(" ");
            }
        }
    }
}
