package com.example.shoppingmall.order;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Repository
public class OrderRepository {

    @Autowired
    EntityManager entityManager;
    private Map<Integer, Order> order_table
            = new HashMap<>();
    private int id = 0;

    public void saveOrder(Order order) {
//        log.info("productName = {}", order.getProduct().getName());
//        log.info("count = {}", order.getCount());
//
//        order.setId(id++);
//        order_table.put(order.getId(), order);
        entityManager.persist(order);
    }

    public Order findById(int id){
        return entityManager.find(Order.class, id);
    }

}
