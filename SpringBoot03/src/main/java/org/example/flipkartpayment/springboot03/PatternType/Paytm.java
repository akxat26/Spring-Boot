package org.example.flipkartpayment.springboot03.PatternType;

import org.springframework.stereotype.Component;

@Component
public class Paytm implements Pattern
{

    @Override
    public void pay(String amount) {
        System.out.println("Paytm payment done.............."+amount);
    }
}
