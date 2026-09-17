package com.example.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Megumin
 * @create 2026-09-17 2:31 PM
 */
@Service
public class OrderService {

    private PaymentService paymentService;

    // 在默認情況下 Spring 優先使用 default constructor
//    public OrderService() {}

//    public OrderService(PaymentService paymentService, int x) {}

    // 在有多個 constructor 的情況下，
    // 透過 @Autowired 指定 spring 裝配這個類以及其依賴項
    // 透過 constructor 進行 dependency injection
    @Autowired
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
//        var paymentService = new StripePaymentService();
        paymentService.processPayment(10);

    }
}
