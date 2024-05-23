package com.example.shoppingmall.order;

import com.example.shoppingmall.member.Member;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDTO {

    @Id
    int id;

    @NotNull
    int productId;

    @NotBlank(message = "수량을 정확히 입력해주세요")
    int count;

}
