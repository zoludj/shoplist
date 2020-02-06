package com.javaguru.shoppinglist;

public class NameValidatorRule implements ProductValidatorRule {
    public void validate(Product product) throws Exception {
        String name = product.getName();
        if (name.length() < 3 || name.length() > 32) {
            throw new Exception("Name will be from 3 words to 32");
        }
    }
}
