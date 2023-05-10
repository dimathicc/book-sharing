package ru.dmitryshvalev.libraryspringboot.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "person")
public class Person { // НАСТРОИТЬ ОТНОШЕНИЕ ОДИН КО МНОГИМ
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    @NotEmpty
    @Size(min = 2, max = 100, message = "size 2 - 100 chars")
    private String name;

    @Column(name = "birth_date")
    @Min(value = 1900, message = "min age is 1900")
    private int birthDate;

    @OneToMany(mappedBy = "owner")
    private List<Book> books;

    public Person() {}

    public Person(String name, int birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", books=" + books +
                '}';
    }
}
