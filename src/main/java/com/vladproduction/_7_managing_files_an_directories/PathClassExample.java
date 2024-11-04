package com.vladproduction._7_managing_files_an_directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClassExample {
    public static void main(String[] args) {
        Path path = Paths.get("Hello World.txt");
        try {
            boolean deleted = Files.deleteIfExists(path);
            System.out.println(deleted);
        } catch (IOException ex) {

        }

        Path path2 = Paths.get("C:\\Users\\admin\\Desktop\\myFiles\\example.txt");
        System.out.println(path2.getParent());
        System.out.println(path2.getRoot());
        System.out.println(path2.getFileName());
    }
}
