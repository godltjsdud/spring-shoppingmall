package com.example.shoppingmall.order;

import com.example.shoppingmall.product.Product;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
//@RequiredArgsConstructor
public class Order {
    int id;
    Product product; // Domain = Object
    int count;

    public Order(Product orderdProduct, int count) {
        this.product = orderdProduct;
        this.count = count;
    }
    // DB column : Orders orders_id or id "통일성"
}
