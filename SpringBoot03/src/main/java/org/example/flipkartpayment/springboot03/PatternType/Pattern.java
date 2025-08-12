package org.example.flipkartpayment.springboot03.PatternType;

import org.springframework.stereotype.Component;

@Component
public interface Pattern
{

    public void pay(String amount);
}
