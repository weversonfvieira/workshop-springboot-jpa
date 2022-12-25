package com.weverson.course.repositories;

import com.weverson.course.entities.Category;
import com.weverson.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
