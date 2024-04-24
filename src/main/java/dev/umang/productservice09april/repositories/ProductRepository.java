package dev.umang.productservice09april.repositories;

import dev.umang.productservice09april.models.Category;
import dev.umang.productservice09april.models.Product;
import dev.umang.productservice09april.repositories.projections.ProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("select p from Product p where p.title = :title")
    List<Product>findAllProductsWithAParticularName(@Param("title") String title);

    @Query("select p.title, p.category.title, p.description from Product p where p.category.title = :categoryName and p.price > :price")
    List<ProductProjection> findAllProductsByCategoryNameAndProductPrice(@Param("categoryName") String categoryName,
                                                                         @Param("price") long price);

    @Query(value = "select * from products p where p.category.title = :categoryName and p.price = :price", nativeQuery = true)
    List<Product> findAllProductsByCategoryNameAndProductPrice2(@Param("categoryName") String categoryName,
                                                               @Param("price") long price);
     Product save(Product product);
    /*
    Spring will automatically run a query on the db for the corresponding
    method call
     */

    /*
    to find product by id
     */
    Product findByIdIs(long id);

    @Override
    List<Product> findAll();

    List<Product> findAllByTitle(String title);

    List<Product> findAllByCategory(Category category);

    /*
    You don't need the entire object to filter products
    you can also filter based on attributes as well
     */
    List<Product> findAllByCategory_Title(String title);

    List<Product> findAllByCategory_Id(long id);

    List<Product> findByTitleStartingWithAndIdGreaterThanAndCategory_IdEquals(String title, long greaterThan, long category_id);


}
