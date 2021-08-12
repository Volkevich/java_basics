package ru.skillbox;

public class Book {

    private  final String name;
    private final String author;
    private final int page;
    private final int ISBN;

    public Book(String name, String author, int page, int ISBN) {
        this.name = name;
        this.author = author;
        this.page = page;
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPage() {
        return page;
    }

    public int getISBN() {
        return ISBN;
    }







}
