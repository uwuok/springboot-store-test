package com.example.store;

/**
 * @author Megumin
 * @create 2026-09-17 2:31 PM
 */
public class OrderService {

    private PaymentService paymentService;

    // 透過 constructor 進行 dependency injection
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
//        var paymentService = new StripePaymentService();
        paymentService.processPayment(10);

    }
}
