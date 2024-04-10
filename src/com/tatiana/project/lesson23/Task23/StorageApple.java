package com.tatiana.project.lesson23.Task23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class StorageApple implements IStorage<Apple, Long> {

    @Override
    public List<Apple> getAll() throws IOException {
        List<Apple> apples = new ArrayList<>();
        List<String> stringList =
                Files.readAllLines(Paths.get("filename.txt"));

        for (String string : stringList) {
            String[] str = string.split(";");
            apples.add(
                    new Apple(Long.parseLong(str[0]),
                    str[1],
                    Double.parseDouble(str[2]))
            );
        }
        return Files.lines(Paths.get("filename.txt"))
                .map(string -> {
                    String[] str = string.split(";");
                    return new Apple(Long.parseLong(str[0]),
                            str[1],
                            Double.parseDouble(str[2]));
                }).toList();
    }

    @Override
    public Apple getById(Long Id) {
        return null;
    }

    @Override
    public void add(Apple apple) {
        String appleString = apple.id() + ";" +
                apple.color();

    }

    @Override
    public void remove(Apple apple) {

    }


}
