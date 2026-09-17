package com.example.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

//        SpringApplication.run(StoreApplication.class, args);
        var orderService = new OrderService();

        // 這種實現方法如果忘記傳入參數會有 NULL pointer exception
        // 在這種情況下 Payment service 是必須依賴項，而非可選的
        // 所以在這種情況下使用 setter inject 是沒有意義的
        // 再者，多數情況下還是用 constructor injection
        orderService.setPaymentService(new PayPalPaymentService());
        orderService.placeOrder();
    }

}
