import model.*;
import service.ProductService;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = List.of(new Product("Laptop", 1320.0, 4.6, 19),
                new Product("Smartphone", 950, 4.8, 23),
                new Product("Headphones", 99.50, 3.7, 36),
                new Product("TV set", 2500, 4.5, 12),
                new Product("Fridge", 745.60, 4.9, 28))
                ;
        ProductService productsService = new ProductService(products);

        System.out.println("Введите тип сортировки:" );
        System.out.println("0. без сортировки");
        System.out.println("1. По цене");
        System.out.println("2. По имени");
        System.out.println("3. По рейтингу");
        System.out.println("4. По остатку на складе");
        int select = scanner.nextInt();

        Comparator<Product> comparator;
        switch (select){
            case 0: comparator = new ZeroComparator(); break;
            case 1: comparator = new ComparatorProductByPrice(); break;
            case 2: comparator = new ComparatorProductByName(); break;
            case 3: comparator = new ComparatorProductByRating(); break;
            case 4: comparator = new ComparatorProductByStock(); break;
            default: comparator = new ZeroComparator();break;
        }

        System.out.println("1. по возрастанию; 2. по убыванию ");
        select=scanner.nextInt();
        if(select==2){
            comparator = comparator.reversed();
        }

        List<Product> sortedProductList = productsService.getSortedProductList(comparator);
        System.out.println(sortedProductList);

    }
}

/*
Предположим, вы пишите программу для on-line магазина
У каждого товара есть наименование, цена, рейтинг,
количество штук на складе и т.д. Ваша программа должна
предлагать пользователю выбрать, как бы он хотел сортировать товары и,
в зависимости от выбора пользователя, выводить список товаров
в нужном порядке (например, по цене по возрастанию, по цене по убыванию, по рейтингу, по количеству на складе).

 */

