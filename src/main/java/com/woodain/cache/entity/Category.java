package com.woodain.cache.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@ToString
@Data
@Entity
public class Category {
    @Id
    @Column(name="category_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryNo;

    @Column(name="category_name", length = 255, nullable = true)
    private String categoryName;

    @Column(name="parent_no",length = 255, nullable = true)
    private String parentNo;

    @Column(name="depth",length = 255, nullable = false)
    private String depth;

    @Builder
    public Category(Long categoryNo, String categoryName, String parentNo, String depth) {
        this.categoryNo = categoryNo;
        this.categoryName = categoryName;
        this.parentNo = parentNo;
        this.depth = depth;
    }
}
