package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        zadacha();
    }

    public static void zadacha() {
        List<String> names = new ArrayList<>(List.of("Анна", "Иван", "Ольга"));
        System.out.println(names.stream().map(s -> s.substring(1)).sorted().toList());
    }
}

