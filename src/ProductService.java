package service;

import model.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductService {
    private final List<Product> products;

    public ProductService(List<Product> products) {
        if (products == null) {
            this.products = new ArrayList<>();
        } else {
            this.products = new ArrayList<>(products);
        }
    }

    public List<Product> getSortedProductList(Comparator<Product> comparator){
        ArrayList<Product> result = new ArrayList<>(products);
        result.sort(comparator);
        return result;
    }


    public ProductService() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    @Override
    public String toString() {
        return "ProductsService{" +
                "products=" + products +
                '}';
    }


}