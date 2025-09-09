package com.tnsif.springq;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringqualifierApplication {

    public static void main(String[] args) {
        // Start the Spring Boot application and get the application context
        ConfigurableApplicationContext context = SpringApplication.run(SpringqualifierApplication.class, args);

        // Get the Customer bean from the context
        Customer customer = context.getBean(Customer.class);

        // Call the order method (which internally calls ShoppingMall.purchase())
        customer.order();
    }
}