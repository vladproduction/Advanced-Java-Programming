package com.vladproduction._4_functional_programming.streams;

public class Book {

    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("Book '%s', author: %s", title, author);
    }
}
