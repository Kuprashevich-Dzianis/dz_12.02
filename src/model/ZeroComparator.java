package model;

import java.util.Comparator;

public class ZeroComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return 0;
    }
}

