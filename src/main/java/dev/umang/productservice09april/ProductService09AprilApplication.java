package dev.umang.productservice09april;

import dev.umang.productservice09april.models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductService09AprilApplication {

    public static void main(String[] args) {

        Product p1 = new Product();

        SpringApplication.run(ProductService09AprilApplication.class, args);
    }

}
