package com.javaguru.shoppinglist;

import javax.swing.*;
import java.math.BigDecimal;

public class Product {

    private Long id;
    private String name;
    private BigDecimal price;
    private String category;
    private int discount;
    private String info;

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }

    public int getDiscount() { return discount; }


    public void setDiscount(int discount) { this.discount = discount; }


    public String getInfo() { return info; }

    public void setInfo(String info) { this.info = info; }


    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }


    public BigDecimal getPrice() { return price; }

    public void setPrice(BigDecimal price) { this.price = price; }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", discount=" + discount +
                ", info='" + info + '\'' +
                '}';
    }
}
