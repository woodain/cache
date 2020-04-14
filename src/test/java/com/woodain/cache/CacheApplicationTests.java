package com.woodain.cache;

import com.woodain.cache.entity.Category;
import com.woodain.cache.repository.CategoryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class CacheApplicationTests {

    @Autowired
    CategoryRepository categoryRepository;

    @Test
    public void testCategoryRepository(){
        Category category = categoryRepository.findById(1L).orElse(new Category());
        System.out.println(category.getCategoryName());
    }
}


