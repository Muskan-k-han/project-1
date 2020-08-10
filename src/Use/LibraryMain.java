package Use;

import java.util.List;

import data.*;
import details.*;
import libraryServices.BookServicesUse;
import libraryServices.IBookServicesUse;

public class LibraryMain {
    private IBookServicesUse bookservice=new BookServicesUse();
    public static void main(String args[])
    {
        LibraryMain libapp=new LibraryMain();
        libapp.run();
    }

    private void run() {
        Author author1 = new Author("1", "Arpit Ji");
        Author author2 = new Author("2", "Muskan Ji");
        Book book1 = new Book("animalfarm", 64.42, author1);
        Book book2 = new Book("gullivers travels",100, author2);
        Book book3 = new Book("panchathantra",64.42, author1);
        Book book4 = new Book("volume",188, author2);
        bookservice.addBook(book1);
        bookservice.addBook(book2);
        bookservice.addBook(book3);
        bookservice.addBook(book4);
        Showbooks();
    }

    private void Showbooks() {
        List<Book> list=bookservice.showBooks();
        for(Book book:list)
        {
            display(book);
        }

    }

    private void display(Book book) {
        System.out.println("display the books details");
        Author author=book.getAuthor();
        System.out.println("The author is "+author.getName()+" Name of the book "+book.getName());
    }


}
