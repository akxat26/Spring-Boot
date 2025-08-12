package org.example.flipkartpayment.springboot03.PatternType;

import org.springframework.stereotype.Component;

@Component
public class Razorpay implements Pattern{

    @Override
    public void pay(String amount) {
        System.out.println("Razorpay payment done.............."+amount);
    }
}
