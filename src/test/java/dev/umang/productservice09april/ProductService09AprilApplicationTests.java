package dev.umang.productservice09april;

import dev.umang.productservice09april.models.Category;
import dev.umang.productservice09april.repositories.CategoryRepository;
import dev.umang.productservice09april.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class ProductService09AprilApplicationTests {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    CategoryRepository categoryRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testQueries(){
        Category category = categoryRepository.findById(1L);
        System.out.println("Fetched a category object");
        //Category category = optionalCategory.get();

        category.getProducts();
    }
}
