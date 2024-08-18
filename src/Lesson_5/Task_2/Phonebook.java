package Lesson_5.Task_2;

import java.util.HashMap;
import java.util.HashSet;

public class Phonebook {

    protected HashMap<String, HashSet<String>> directory;

    public Phonebook() {
        directory = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        if (!directory.containsKey(surname)) {
            directory.put(surname, new HashSet<>());
        }
        directory.get(surname).add(phoneNumber);
    }

    public HashSet<String> get(String surname) {
        return directory.getOrDefault(surname, new HashSet<>());
    }

    public static void main(String[] args) {
        Phonebook directory = new Phonebook();
        directory.add("Хашаев", "+79821404041");
        directory.add("Хашаев", "+79021314152");
        directory.add("Иванов", "+79002204022");

        System.out.println("Номера Хашаева: " + directory.get("Хашаев"));
        System.out.println("Номера Иванова: " + directory.get("Иванов"));
        System.out.println("Номера Кузьмина: " + directory.get("Кузьмин"));
    }
}
