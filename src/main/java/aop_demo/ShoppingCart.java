package aop_demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(String status) {
        // Logging
        // Authentication & Authorization
        // Sanitize the data
        System.out.println("Checkout method from ShoppingCart called");
    }


    public int quantity () {
        return 2;
    }
}
