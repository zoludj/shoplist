package com.javaguru.shoppinglist;


import java.util.HashMap;
import java.util.Map;

public class Repository {

    private Long PRODUCT_ID_SEQUENCE = 0L;
    private Map<Long, Product> products = new HashMap<>();


    public Product insert(Product product) {
        product.setId(PRODUCT_ID_SEQUENCE);
        products.put(PRODUCT_ID_SEQUENCE, product);
        PRODUCT_ID_SEQUENCE++;
        return product;
    }

    public Product findProductByID(Long id) {
        return null;
    }
}


