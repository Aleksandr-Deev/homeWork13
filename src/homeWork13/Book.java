package homeWork13;

import java.util.Objects;

public class Book {
    private final String titleOfTheBook;
    private final Author author;
    private int yearOfPublication;
    public Book(String titleOfTheBook, Author author, int yearOfPublication) {
        this.titleOfTheBook = titleOfTheBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitleOfTheBook() {
        return this.titleOfTheBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Книга " + this.titleOfTheBook + " Автор " + this.author + " год публикации" + this.yearOfPublication;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return yearOfPublication == book.yearOfPublication && titleOfTheBook.equals(book.titleOfTheBook) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleOfTheBook, author, yearOfPublication);
    }
}
