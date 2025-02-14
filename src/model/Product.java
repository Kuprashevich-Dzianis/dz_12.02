package model;

public class Product implements Comparable<Product>{
    private String name;
    private double price;
    private double rating;
    private int stock;

    public Product(String name, double price, double rating, int stock) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return String.format("%n%s, Price: %.2f, Rating: %.1f, Stock: %d", name,price,rating,stock);
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(this.price, o.price);
    }
}

