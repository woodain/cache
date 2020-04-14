package com.woodain.cache.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productNo;

    @Column(length = 255, nullable = false)
    private String brandName;

    @Column(length = 255, nullable = false)
    private String productName;

    @Column(length = 19, nullable = false)
    private Long productPrice;

    @ManyToOne
    @JoinColumn(name="category_no")
    private Category categoryNo;

    @Builder
    public Product(Long productNo, String brandName, String productName, Long productPrice, Category categoryNo) {
        this.productNo = productNo;
        this.brandName = brandName;
        this.productName = productName;
        this.productPrice = productPrice;
        this.categoryNo = categoryNo;
    }
}
