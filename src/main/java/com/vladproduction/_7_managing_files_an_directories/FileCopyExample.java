package com.vladproduction._7_managing_files_an_directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class FileCopyExample {
    public static void main(String[] args) {
        //create folder and files as source and dest first;
        Path source = Paths.get("C:\\Users\\admin\\Desktop\\myFiles\\example.txt");
        Path dest = Paths.get("C:\\Users\\admin\\Desktop\\myFiles\\new.txt");
        try {
            Files.copy(source, dest, REPLACE_EXISTING);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
