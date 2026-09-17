package com.example.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author Megumin
 * @create 2026-09-17 2:32 PM
 */

@Service("stripe")
@Primary // 當有多個 candidate 優先使用此
public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("Amount: " + amount);
    }
}
