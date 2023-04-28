package ru.dmitryshvalev.library.models;

public class Book {
    private int id;

    private String title;
    private String author;
    private int production;

    public Book(int id, String title, String author, int production) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.production = production;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getProduction() {
        return production;
    }

    public void setProduction(int production) {
        this.production = production;
    }
}
