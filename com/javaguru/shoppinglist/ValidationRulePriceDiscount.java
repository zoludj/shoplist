package com.javaguru.shoppinglist;

import java.math.BigDecimal;

public class ValidationRulePriceDiscount {
    public void validate (Product product) throws Exception {
        BigDecimal price = product.getPrice();

        if (price.intValue() <20 );{
            throw new Exception("If price less then 20, discount not apply");

        }
    }

}
