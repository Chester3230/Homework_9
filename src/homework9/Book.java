package homework9;

import homework9.author.Author;

import java.util.Objects;

public class Book {
    private String name;
    private int yearOfPublication;
    private Author author;

    public Book(String name, int yearOfPublication, Author author){
        this.name = name;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYearOfPublication(int yearOfPublication){
        this.yearOfPublication = yearOfPublication;
    }

    public String toString() {
        return "name: " + name +
                ", yearOfPublication: " + yearOfPublication +
                ", author: " + author;
    }

    public boolean equals(Book book) {
        if (book == null) return false;

        if (yearOfPublication != book.yearOfPublication) return false;
        if (!Objects.equals(name, book.name)) return false;
        return author.equals(book.author);
    }

    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + yearOfPublication;
        result = 31 * result + author.hashCode();
        return result;
    }
}
