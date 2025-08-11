package org.example.socialmedia.springboot02.Beans;

import org.example.socialmedia.springboot02.Config.InstaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Reels {

    @Autowired
    InstaConfig config;


    public void dance()
    {
        System.out.println("Reels watching at ---------------> "+config.getInstance());

        System.out.println("Dance is dancing...........");
    }
}
