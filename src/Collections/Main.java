package Collections;

import java.util.ArrayList;
//        Создайте класс User с полями id, name, age и phoneNumbers.
//        Поле phoneNumbers должно быть списком. Сделайте конструктор с параметрами для
//        заполнения всех полей объектов при их создании.
//        Создайте два объектаполученного класса.
public class Main {
    public static void main(String[] args) {

        ArrayList<String> phone1 = new ArrayList<String>();
        phone1.add("79111111111");
        phone1.add("79555555555");
        phone1.add("79777777777");
        User user1 = new User(101, "Roger Waters", 79, phone1);

        ArrayList<String> phone2 = new ArrayList<String>();
        phone2.add("79222222222");
        phone2.add("79333333333");
        User user2 = new User(210, "Grace Slick", 83, phone2);

        System.out.println("Данные о пользователе: " + "\n" +
                "ID пользователя: " + user1.getId() + "\n" +
                "Имя в системе: " + user1.getName() + "\n" +
                "Возраст: " + user1.getAge() + "\n" +
                "Номер телефона: " + phone1 + "\n");

        System.out.println("Данные о пользователе: " + "\n" +
                "ID пользователя: " + user2.getId() + "\n" +
                "Имя в системе: " + user2.getName() + "\n" +
                "Возраст: " + user2.getAge() + "\n" +
                "Номер телефона: " + phone2 + "\n");
    }
}
