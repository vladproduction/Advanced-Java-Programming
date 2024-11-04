package com.vladproduction._4_functional_programming.streams;

import java.util.ArrayList;

import static com.vladproduction._4_functional_programming.streams.Library.populateLibrary;

/**
 * It is possible to employ multiple computer cores to filter a list. Which statement will filter with increased performance?
 * Answer: parallelStream();
 * */
public class MainParallelStream {
    public static void main(String[] args) {
        ArrayList<Book> books = populateLibrary();
        books.parallelStream().filter(book -> {
            return book.getAuthor().startsWith("J");
        }).forEach(System.out::println);
    }
}
