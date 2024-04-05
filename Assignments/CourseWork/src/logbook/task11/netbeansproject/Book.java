package logbook.task11.netbeansproject;

import java.util.Date;

public class Book extends Product{
    private String title;
    private String author;
    private int numPages;
    private String publisher;
    private String publicationDate;

    // Parameterized constructor
    public Book(String productID, double price, boolean primeEligible, int numberInStock, Date dateAdded,
                String title, String author, int numPages, String publisher, String publicationDate) {
        super(productID, price, primeEligible, numberInStock, dateAdded);
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
    }

    // Setter methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumPages() {
        return numPages;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

}
