package homework9;

import homework9.author.Author;

public class Homework9 {
    public static void main(String[] args) {
        Author authorOne = new Author("Валерий", "Сюткин");
        Author authorTwo = new Author("Юрий", "Гагарин");

        Book bookOne = new Book("Вася", 1991, authorOne);
        Book bookTwo = new Book("Поехали", 1961, authorTwo);

        bookOne.setYearOfPublication(1999);
        System.out.println(bookOne);

    }
}
