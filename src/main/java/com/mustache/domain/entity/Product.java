package com.mustache.domain.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="product") //생략 가능
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;    // 상품번호

    @Column(nullable = false)
    private String name;    // 상품이름

    @Column(nullable = false)
    private Integer price;  // 상품 가격

    @Column(nullable = false)
    private Integer stock;  // 상품 재고

    private LocalDateTime createdAt;    // 상품 생성 일자

    private LocalDateTime updateAt;     // 상품 정보 변경 일자
}
