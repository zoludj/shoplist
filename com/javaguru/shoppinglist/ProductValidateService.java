package com.javaguru.shoppinglist;

import java.util.HashSet;
import java.util.Set;

public class ProductValidateService {
    private Set<ProductValidatorRule> validateRules = new HashSet<>();
    public ProductValidateService(){
        validateRules.add(new NameValidatorRule());
        validateRules.add(new PriceValidatorRule());
        validateRules.add(new DiscountValidatorRule());
    }
    public void validate (Product product){
        validateRules.forEach(s -> {
            try {
                s.validate(product);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
