package com.study.amodule;

import com.study.bmodule.Service;

/**
 * Created by kcharan on 12/23/2017.
 */
public class Application {

    public static void main(String ... args) {

        String message = "Hello team...!";

        Service service = new Service();
        service.printMessage(message);

    }

}
