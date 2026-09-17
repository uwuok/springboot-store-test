package com.example.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Megumin
 * @create 2026-09-17 2:31 PM
 */
@Service
public class OrderService {

    private PaymentService paymentService;

    // 透拓 qualifier 指定使用的 Bean(該 Bean 需要被指定名稱)
    public OrderService(@Qualifier("paypal") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.processPayment(10);
    }
}
