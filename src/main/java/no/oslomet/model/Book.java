package no.oslomet.model;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public long ISBN;
    public String title;
    public String releaseYear;
    public String author;

    public Book(long ISBN, String title,String releaseYear, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
    }

    public Book(String title, String releaseYear, String author) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public Book() {
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
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
        author = author;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", releaseYear='" + releaseYear + '\'' +
                '}';
    }
}
