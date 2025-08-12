package org.example.flipkartpayment.springboot03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot03Application {
/*
//If you use both @Primary and @Qualifier, then @Qualifier will
//be given more importance as compared to the @Primary
 */

    public static void main(String[] args)
    {
        ApplicationContext context= SpringApplication.run(SpringBoot03Application.class, args);
        Flipkart flipkart= context.getBean(Flipkart.class);
        flipkart.payment();

        System.out.println("hello world");
    }

}
