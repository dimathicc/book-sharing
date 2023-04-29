package ru.dmitryshvalev.library.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {
    private int id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String title;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String author;

    @Min(value = 1500)
    private int production;

    public Book() {}

    public Book(int id, String title, String author, int production) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.production = production;
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
