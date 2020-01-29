package com.javaguru.shoppinglist;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class ShoppingListApplication {

    public static void main(String[] args) {
        Map<Long, Product> productRepository = new HashMap<>();
        Long productIdSequence = 0L;
        while (true) {
            Scanner scanner = new Scanner(System.in);


            try {
                System.out.println("1. Create product");
                System.out.println("2. Find product by id");
                System.out.println("3. Exit");
                Integer userInput = Integer.valueOf(scanner.nextLine());
                switch (userInput) {
                    case 1:
                        Validator validator = new Validator();
                        Product product = new Product();
                        createProduct(validator, scanner, product);
                        System.out.println(product + "created");
                        product.setId(productIdSequence);
                        productRepository.put(productIdSequence, product);
                        productIdSequence++;
                        System.out.println("Result: " + product.getId());
                        break;
                    case 2:
                        System.out.println("Enter product id: ");
                        long id = scanner.nextLong();
                        Product findProductResult = productRepository.get(id);
                        System.out.println(findProductResult);
                        break;
                    case 3:
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error! Please try again.");
            }
        }
    }


    private static void createProduct(Validator validator, Scanner scanner, Product product) {
        System.out.println("Enter product name: ");
        String name = scanner.nextLine();
        System.out.println("Enter product price: ");
        BigDecimal price = new BigDecimal(scanner.nextLine());
        System.out.println("Enter product discount");
        int discount = Integer.parseInt(scanner.nextLine());
        if (!validator.validateName(name) || !validator.validateDiscount(discount) || !validator.validatePrice(price)) {
            System.out.println("Validation failed");
            createProduct(validator, scanner, product);
        }


        product.setDiscount(discount);
        product.setName(name);
        product.setPrice(price);


    }
}




