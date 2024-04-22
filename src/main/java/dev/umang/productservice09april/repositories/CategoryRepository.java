package dev.umang.productservice09april.repositories;

import dev.umang.productservice09april.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByTitle(String title);
    Category save(Category category);
}
