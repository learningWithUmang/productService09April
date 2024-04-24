package dev.umang.productservice09april.services;

import dev.umang.productservice09april.models.Category;
import dev.umang.productservice09april.models.Product;
import dev.umang.productservice09april.repositories.CategoryRepository;
import dev.umang.productservice09april.repositories.ProductRepository;
import dev.umang.productservice09april.repositories.projections.ProductProjection;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("selfproductservice")
public class SelfProductService implements ProductService{
    private CategoryRepository categoryRepository;
    private ProductRepository productRepository;
    public SelfProductService(ProductRepository productRepository, CategoryRepository categoryRepository){
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }
    @Override
    public Product createProduct(String title,
                                 String description,
                                 double price,
                                 String category,
                                 String image) {
        Product p = new Product();
        p.setTitle(title);
        p.setDescription(description);
        p.setPrice(price);
        p.setImageURL(image);
        /*
        I need to confirm if already the category exists
         */
        Category categoryFromDatabase = categoryRepository.findByTitle(category);

        if(categoryFromDatabase == null){
            Category category1 = new Category();
            category1.setTitle(category);
            //categoryRepository.save(category1); //persist as cascade type
            categoryFromDatabase = category1;
        }

        p.setCategory(categoryFromDatabase); //persist as cascade type

        Product savedProduct = productRepository.save(p);
        return savedProduct;
    }

    @Override
    public Product getSingleProduct(Long productId) {
        return productRepository.findByIdIs(productId);
    }
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    /*

     */
    public List<Product> getProductsByCategory(String category_name){
        List<ProductProjection> prd = productRepository.findAllProductsByCategoryNameAndProductPrice("abc", 90);
        //prd.get(0).getTitle();
        return productRepository.findAllByCategory_Title(category_name);
    }
}
