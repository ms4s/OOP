package Project.OOP.hw1;

public class User {
    private String name;
    private String surname;
    private String secondName;
    private int birthday;
    private String email;
    public User(String surname, String name, String secondName, int birthday, String email){
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.birthday = birthday;
        this.email = email;
    }
    public void info() {
        System.out.println("ФИО: " + surname + " " + name + " " + secondName);
        System.out.println("Год рождения: " + birthday);
        System.out.println("email: " + email);
    }

    public int age(){
        int age = 2025 - birthday;
        return 2025 - birthday;
    }
}
