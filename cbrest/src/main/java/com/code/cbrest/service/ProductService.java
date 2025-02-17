package com.code.cbrest.service;

import com.code.cbrest.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    public Optional<Product> getProductById(int id) {
        return getProducts().stream().filter(product -> product.getId() == id).toList().stream().findFirst();
    }

    private List<Product> getProducts() {
        Product.Rating rating1 = new Product.Rating();
        rating1.setCount(2);
        rating1.setRate(9.1);

        Product.Rating rating2 = new Product.Rating();
        rating2.setCount(2);
        rating2.setRate(9.1);

        Product product1 = new Product();
        Product product2 = new Product();

        product1.setId(1);
        product1.setTitle("Books");
        product1.setDescription("Adventure");
        product1.setPrice(100);
        product1.setRating(rating1);

        product2.setId(2);
        product2.setTitle("Books");
        product2.setDescription("Science");
        product2.setPrice(140);
        product2.setRating(rating2);

        return List.of(product1, product2);
    }
}
