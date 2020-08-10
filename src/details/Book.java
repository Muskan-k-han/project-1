package details;

import details.Author;

public class Book {
    private String id;
    private String name;
    private Author author;
    private boolean checkout;

    public Book(String name, double cost,Author author) {
        this.name = name;
        
        this.author=author;
    }
    public boolean isCheckout() {
        return checkout;
    }

    public void setChekout(boolean checkout) {
        this.checkout = checkout;
    }    
    
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
   
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
