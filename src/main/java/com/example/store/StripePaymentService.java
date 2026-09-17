package com.example.store;

/**
 * @author Megumin
 * @create 2026-09-17 2:32 PM
 */
public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("Amount: " + amount);
    }
}
