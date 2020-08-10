package libraryServices;

import java.util.List;
import data.*;
import details.Book;
import exception.BookcostException;
import exception.InvalidArgumentException;
import libraryServices.*;

public class BookServicesUse implements IBookServicesUse {
private IBookStore bookDao=new BookStore();
    @Override
    public Book findBookId(String id) {
        validateId(id);
        Book book=bookDao.findBookId(id);
        return book;
    }

    private void validateId(String id) {
        if(id==null || id.isEmpty())
        {
            throw new InvalidArgumentException("Id can't be null or empty");
        }
    }

    @Override
    public Book updateBookcost(String id, double cost) {
        validateId(id);
        validatecost(cost);
        Book book=bookDao.updateBookcost(id,cost);
        return book;
    }

    private void validatecost(double cost) {
        if(cost<0)
        {
            throw new BookcostException("The cost can't be negative");
        }
    }

    @Override
    public void removeBook(String id) {
        validateId(id);
        bookDao.removeBook(id);

    }

    @Override
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    @Override
    public List<Book> showBooks() {
       List<Book>list=bookDao.showBooks();
       return list;
    }
}
