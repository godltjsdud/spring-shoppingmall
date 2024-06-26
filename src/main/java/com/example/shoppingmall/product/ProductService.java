package com.example.shoppingmall.product;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor // 필드로 생성자 코드 구현
public class ProductService {
    ProductRepository productRepository;
    ProductJPARepository productJPARepository;
    public Product registerProduct(Product product) {
        System.out.println(
                "/products : service - " + product.getName());

//        return productRepository.save(product);
        return productJPARepository.save(product);
    }

    public Product findProduct(int id) {
//        return productRepository.findProduct(id);
        return productJPARepository.findById(id).get();
    }


    public List<Product> findProducts(){
        return productJPARepository.findAll();
    }

    public List<Product> findProducts(int limit, int currentPage) {
        return productRepository.findProducts(limit, currentPage);
    }

    public List<Product> findProducts(int limit, int currentPage, int categoryId) {
        return productRepository.findProducts(limit, currentPage, categoryId);
    }

    public void deleteProduct(int id) {
        productRepository.deleteProduct(id);
    }

    public void deleteProducts(List<Integer> productIds) {
        productRepository.deleteProducts(productIds);
    }
}
