package com.woodain.cache.repository;

import com.woodain.cache.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category getOne(Long categoryNo);
    Optional<Category> findById(Long categoryNo);
    List<Category> findByCategoryName(String categoryName);

}
