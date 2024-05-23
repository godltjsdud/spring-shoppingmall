package com.example.shoppingmall.product;

import com.example.shoppingmall.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductJPARepository extends JpaRepository<Product, Integer> {

    <S extends Product> S save(S entity);
    List<Product> findAll() ;
}
