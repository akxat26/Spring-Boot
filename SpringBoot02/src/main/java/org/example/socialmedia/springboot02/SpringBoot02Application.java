package org.example.socialmedia.springboot02;

import org.example.socialmedia.springboot02.Beans.Instagram;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot02Application {

    public static void main(String[] args) {

        ApplicationContext context= SpringApplication.run(SpringBoot02Application.class, args);
        context.getBean(Instagram.class);
        Instagram bean=context.getBean(Instagram.class);
        bean.play();


//        context.getBean(Reels.class);
//        Reels reels= context.getBean(Reels.class);
//        reels.dance();
    }

}
