package org.example.one.springboot01.Custom;

import org.springframework.stereotype.Component;

@Component
public class Deiesel implements IEngine {

    Deiesel()
    {
        System.out.println("Deiesel consttructor  started ......");
    }

    public void start()
    {

        System.out.println("Deiesel engine starting.....................");
    }


}
