package com.code.cb.service;

import com.code.cb.dto.Product;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class ShoppingService {

    private static final Logger LOGGER = Logger.getLogger( ShoppingService.class.getName());

    private final WebClient webClient;

    public ShoppingService(WebClient webClient) {
        this.webClient = webClient;
    }

    @CircuitBreaker(name = "shoppingService", fallbackMethod = "fallback")
    public Product getProductById(int id) {
        return webClient.get()
                .uri("/products/{id}", id)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Product.class)
                .block();
    }

    private Product fallback(int id, Exception e) {
        LOGGER.log(Level.SEVERE, e.getMessage());
        return new Product();
    }

}
