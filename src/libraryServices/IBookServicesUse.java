package libraryServices;

import java.util.List;


import details.*;
public interface IBookServicesUse {
	Book findBookId(String id);
    Book updateBookcost(String id,double cost);
    void removeBook(String id);
    void addBook(Book book);
    List<Book> showBooks();
}
