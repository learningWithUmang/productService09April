package dev.umang.productservice09april.controllers;

import dev.umang.productservice09april.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    /*
    POST /products/
    Request body
    {
        "id" :
        "title:
        "descr":
        "category":
        "price"
     }
     */
    @PostMapping("/products")
    public void createProduct(){

    }

    // /product/1 - get details of a particular product
    /*
    id:
    title:
    price:
     */
    @GetMapping("/products/{id}")
    public Product getProductDetails(@PathVariable("id") int id){
        return new Product();
    }

    @GetMapping("/products")
    public void getAllProducts(){

    }


    public void updateProduct(){

    }
}



/*
Every api call at the end of the day is a method call inside a controller
 */