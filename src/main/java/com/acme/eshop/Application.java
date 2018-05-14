package com.acme.eshop;

import com.acme.eshop.domain.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.acme.eshop.repository.CartRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    CartRepository cartRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        // Fetch all Carts
        System.out.println("Carts found");
        System.out.println("-------------------");
        for(Cart cart : cartRepository.findAll()) {
            System.out.println(cart);
        }

        // Fetch cart by id
        System.out.println("Cart found by id 5af983b73b28229ab69d201f");
        System.out.println("------------------------------------------");
        System.out.println(cartRepository.findById("5af983b73b28229ab69d201f"));

    }
}
