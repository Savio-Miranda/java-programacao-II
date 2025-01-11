package listaControle.library;

import java.util.ArrayList;

/*
 * Crie uma classe Biblioteca com métodos sobrecarregados adicionarLivro para:
 * a) Adicionar um livro com título.
 * b) Adicionar um livro com título e autor.
 * c) Adicionar um livro com título, autor e ano de publicação.
 * Crie uma lista de livros e implemente um método para listar todos os livros cadastrados
 */

public class Library {
    ArrayList<Book> books = new ArrayList<Book>();
    public Library(){

    }

    public void addBook(String title){
        Book book = new Book(title);
        books.add(book);
    }

    public void addBook(String title, String author){
        Book book = new Book(title, author);
        books.add(book);
    }

    public void addBook(String title, String author, int year){
        Book book = new Book(title, author, year);
        books.add(book);
    }

    public void showCollection(){
        for (Book book : books) {
            System.out.println("Título: " + book.getTitle() + " Autor(a): " + book.getAuthor() + " Ano: " + book.getYear());
        }
    }
}
