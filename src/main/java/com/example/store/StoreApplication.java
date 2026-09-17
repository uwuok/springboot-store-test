package com.example.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        // 透過手動創建的 Java Object 對象需要自行管理
//        var orderService = new OrderService(new PayPalPaymentService());

        // Inversion of Control (IOC)
        // 反轉了物件的生命週期，和注入依賴
        // 讓 Spring 來處理好這件事
        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
    }

}
