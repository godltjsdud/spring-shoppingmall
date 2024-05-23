package com.example.shoppingmall.product;

import com.example.shoppingmall.member.Member;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductDTO {

    @NotBlank(message = "상품 이름을 입력해주세요.")
    private String name;

    @NotNull(message = "상품 가격을 입력해주세요")
    private int price;

    private String description;

    @NotNull(message =  "카테고리를 입력해주세요")
    private int categoryId;

    public Product convertToEntity() {
        return new Product(name, price, description, categoryId);
    }

}
