package logbook.task11.netbeansproject;

import java.util.Date;
public class Product {

    private String productID;
    private double price;
    private boolean primeEligible;
    private int numberInStock;
    private Date dateAdded;

    // Parameterized constructor
    public Product(String productID, double price, boolean primeEligible, int numberInStock, Date dateAdded) {
        this.productID = productID;
        this.price = price;
        this.primeEligible = primeEligible;
        this.numberInStock = numberInStock;
        this.dateAdded = dateAdded;
    }

    // Setter methods
    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPrimeEligible(boolean primeEligible) {
        this.primeEligible = primeEligible;
    }

    public void setNumberInStock(int numberInStock) {
        this.numberInStock = numberInStock;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    // Getter methods
    public String getProductID() {
        return productID;
    }

    public double getPrice() {
        return price;
    }

    public boolean isPrimeEligible() {
        return primeEligible;
    }

    public int getNumberInStock() {
        return numberInStock;
    }

    public Date getDateAdded() {
        return dateAdded;
    }
}
