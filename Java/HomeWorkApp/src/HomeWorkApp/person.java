package HomeWorkApp;

public class person {
    private String FIO;
    private String position;
    private String Email;
    private String tel;
    private int salary;
    private int age;

    public person(String FIO, String position, String email, String tel, int salary, int age) {
        this.FIO = FIO;
        this.position = position;
        Email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }



    public int getAge() {
        return age;
    }

     public void printConsole() {
        System.out.println("This is " + FIO + " " + position + " " + Email + " " + tel + " " + salary + " " + age);
    }


}
