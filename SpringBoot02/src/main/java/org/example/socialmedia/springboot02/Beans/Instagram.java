package org.example.socialmedia.springboot02.Beans;

import org.example.socialmedia.springboot02.Config.InstaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Instagram {

    @Autowired
    InstaConfig config;

    @Autowired
    Reels reels;
    public void play()
    {
        System.out.println("Playing Instagram play method ");
        System.out.println("Login at -------> "+config.getInstance());
        reels.dance();
    }




}
