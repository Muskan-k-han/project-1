package data;

import details.Book;

import java.util.List;


public interface IBookStore {
Book findBookId(String id);
Book updateBookcost(String id,double cost);
void addBook(Book book);
void removeBook(String id);
List<Book>showBooks();
}
