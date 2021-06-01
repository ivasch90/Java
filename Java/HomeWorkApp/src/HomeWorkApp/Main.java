package HomeWorkApp;

public class Main {
    public static void main(String[] args) {

            Сотрудник[] persArray = new Сотрудник[5];
            persArray[0] = new Сотрудник("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
            persArray[1] = new Сотрудник("Petrov Petr", "Director", "petrovpetr@mailbox.com", "892367291", 130000, 41);
            persArray[2] = new Сотрудник("Alekseev Aleksey", "IT Java", "alekseeval@mailbox.com", "89234527", 123000, 42);
            persArray[3] = new Сотрудник("Ekaterina Ekatova", "Secretary", "ekatekatova@mailbox.com", "892329173", 50000, 25);
            persArray[4] = new Сотрудник("Boris Borisov", "Security", "borisovboris@mailbox.com", "892638238", 35000, 60);



            for (int i = 0; i < persArray.length; i++) {
                if (persArray[i].getAge() >= 40) {

                    persArray[i].printConsole();

                }

            }
        }

    }