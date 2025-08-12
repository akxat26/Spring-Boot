package org.example.flipkartpayment.springboot03;

import org.example.flipkartpayment.springboot03.PatternType.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Flipkart {

    @Autowired
    @Qualifier("razorpay")

    Pattern pattern;

    public void payment()
    {
        pattern.pay("10000");
    }
}
