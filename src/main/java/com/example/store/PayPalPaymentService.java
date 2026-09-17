package com.example.store;

/**
 * @author Megumin
 * @create 2026-09-17 3:03 PM
 */
public class PayPalPaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("PAYPAL");
        System.out.println("Amount: " + amount);
    }
}
