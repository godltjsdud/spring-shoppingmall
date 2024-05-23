package com.example.shoppingmall.product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Product {
    @Id
    private int id;

    @NotBlank(message = "상품 이름을 입력해주세요.")
    private String name;

    @NotNull(message = "상품 가격을 입력해주세요")
    private int price;

    private String description;

    @NotNull(message =  "카테고리를 입력해주세요")
    private int categoryId;

    // getter, setter
    // setter는 가능한 도메인 객체에는 만들면 안된다.
    // TODO setter는 DTO 등장하고. 지우러 오자!

    Product(String name, int price, String description, int categoryId){
        this.name = name;
        this.price = price;
        this.description = description;
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", categoryId=" + categoryId +
                '}';
    }
}
