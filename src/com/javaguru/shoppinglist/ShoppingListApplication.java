package com.javaguru.shoppinglist;


import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingListApplication {

    public static   void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("1. Create product");
                System.out.println("2. Find product by id");
                System.out.println("3. Exit");
                Integer userInput = Integer.valueOf(scanner.nextLine());
                switch (userInput) {
                    case 1:
                        createProduct();
                        break;
                    case 2:
                       findProduct();
                        break;
                    case 3:
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error! Please try again.");
            }
        }
    }

    private static void createProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, Enter product name: ");
        String name = scanner.nextLine();
        System.out.println("Please, Enter product info: ");
        String info = scanner.nextLine();

        Product product = new Product();
        product.setName(name);
        product.setInfo(info);

        ProductService.createProduct(product);
        System.out.println("Created");
    }


private static void findProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, Enter product id: ");
        Long id = scanner.nextLong();
        Product product = ProductService.findProductById(id);
        System.out.println(product);
    }

}




