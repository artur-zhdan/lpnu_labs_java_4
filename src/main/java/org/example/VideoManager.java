package org.example;

import java.util.ArrayList;
import java.util.List;

public class VideoManager {
    public static void main(String[] args) {
        Film theGodfather = new Film("The Godfather", "Francis Ford Coppola", 1972, 9, 175);
        Clip despacito = new Clip("Despacito", "Carlos Perez", "Lalola", 21312, 32312);

        List<org.example.VideoManager> mediaList = new ArrayList<>();
        mediaList.add(theGodfather);
        mediaList.add(despacito);

        // Виведення на екран за допомогою циклу for-each
        for (org.example.VideoManager media : mediaList) {
            System.out.println(media.toString());
        }

        // Виведення на екран за допомогою потоку Stream
        mediaList.stream().forEach(System.out::println);
    }
}
