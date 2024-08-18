package Lesson_5.Task_1;

import java.util.HashMap;
import java.util.Map;

public class WordArray {
    public static void main(String[] args) {
        String[] words = {
                "apple", "banana", "apple", "orange", "banana", "apple",
                "mango", "grape", "orange", "grape", "banana", "kiwi",
                "melon", "peach", "kiwi", "mango", "peach", "apple"
        };

        HashMap<String, Integer> mapWords = new HashMap<>();

        for (String o : words) {
            mapWords.put(o, mapWords.getOrDefault(o, 0) + 1);
        }

        System.out.println("Уникальные слова и их количество:");
        for (Map.Entry<String, Integer> o : mapWords.entrySet()) {
            System.out.println(o.getKey() + " : " + o.getValue());
        }
    }
}