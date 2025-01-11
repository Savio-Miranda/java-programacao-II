package listaControle.library;

public class Book {
    String title;
    String author;
    int year;

    public Book(String title){
        this.title = title;
        this.author = "Unknown";
        this.year = -1;
    }

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.year = -1;
    }

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle(){ return title; }

    public String getAuthor(){ return author; }

    public int getYear(){ return year; }
}
