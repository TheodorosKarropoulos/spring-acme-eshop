package com.acme.eshop.domain;

import org.springframework.data.annotation.Id;

import java.util.List;


public class Cart {

    @Id
    public String id;

    public String sessionId;

    public List<Product> productList;

    public Cart(){}

    public Cart(String sessionId, List<Product> productList) {
        this.sessionId = sessionId;
        this.productList = productList;
    }

    public String getId() {
        return id;
    }

    public String getSessionId() {
        return sessionId;
    }

    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id='" + id + '\'' +
                ", sessionId='" + sessionId + '\'' +
                ", productList=" + productList +
                '}';
    }
}
