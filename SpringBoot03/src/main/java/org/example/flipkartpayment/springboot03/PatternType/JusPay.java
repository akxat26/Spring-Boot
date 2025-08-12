package org.example.flipkartpayment.springboot03.PatternType;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JusPay implements Pattern
{
    @Override
    public void pay(String amount) {
        System.out.println("JusPay payment done.............. "+amount);
    }
}
