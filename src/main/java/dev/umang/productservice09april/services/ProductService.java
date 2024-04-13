package dev.umang.productservice09april.services;

import dev.umang.productservice09april.models.Category;
import dev.umang.productservice09april.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(Long productId);
    List<Product> getAllProducts();
    Product createProduct(String title,
                  String description,
                  double price,
                  String category,
                  String image
                  );
}
