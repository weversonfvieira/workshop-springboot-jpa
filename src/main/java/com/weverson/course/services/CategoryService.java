package com.weverson.course.services;

import com.weverson.course.entities.Category;
import com.weverson.course.entities.Order;
import com.weverson.course.repositories.CategoryRepository;
import com.weverson.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        return category.get();

    }


}
