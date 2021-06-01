package HomeWorkApp;

public class Сотрудник {
    private String ФИО;
    private String Должность;
    private String Email;
    private String Телефон;
    private int Зарплата;
    private int Возраст;

    public Сотрудник(String ФИО, String должность, String email, String телефон, int зарплата, int возраст) {
        this.ФИО = ФИО;
        Должность = должность;
        Email = email;
        Телефон = телефон;
        Зарплата = зарплата;
        Возраст = возраст;
    }

    public int getAge() {
        return Возраст;
    }

     public void printConsole() {
        System.out.println("This is " + ФИО + " " + Должность + " " + Email + " " + Телефон + " " + Зарплата + " " + Возраст);
    }


}
