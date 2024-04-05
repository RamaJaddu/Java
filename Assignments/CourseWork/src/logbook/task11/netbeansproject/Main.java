package logbook.task11.netbeansproject;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Create objects of type Book
        Date date = new Date();
        Book book1 = new Book("1408855658", 4.50, true, 500, date,
                "Harry Potter and the Philosepher's Stone", " J. K. Rowling", 352, "Bloomsbury Children's Books ",
                " 1 September 2014 ");

        // Display information about the products
        displayBookInfo(book1);

    }

    // Method to display book information
    public static void displayBookInfo(Book book) {
        System.out.println("Printing details for book :  ");
        System.out.println("Product ID: " + book.getProductID());
        System.out.println("Price: £" + book.getPrice());
        System.out.println("This product is eligible for Amazon Prime : " + book.isPrimeEligible());
        System.out.println("Number of this product currently in stock : " + book.getNumberInStock());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Number of Pages: " + book.getNumPages());
        System.out.println("Publisher: " + book.getPublisher());
        System.out.println("Date of publication : " + book.getPublicationDate());

    }
}
