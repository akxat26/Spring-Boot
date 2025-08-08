package org.example.one.springboot01.Custom;

import org.springframework.stereotype.Component;

@Component
public class Petrol implements IEngine {

    Petrol()
    {
        System.out.println("petrol consttructor started ......");
    }



    public void start()

    {
        System.out.println("petrol engine starting.....................");
    }


}
