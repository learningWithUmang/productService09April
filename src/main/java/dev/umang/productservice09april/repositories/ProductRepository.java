package dev.umang.productservice09april.repositories;

import dev.umang.productservice09april.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product save(Product product);
    /*
    Spring will automatically run a query on the db for the corresponding
    method call
     */
}
