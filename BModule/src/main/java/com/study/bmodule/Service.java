package com.study.bmodule;

import com.study.common.Constants;

/**
 * Created by kcharan on 12/23/2017.
 */
public class Service {

    public void printMessage(String message) {

        System.out.println(String.format(Constants.MESSAGE_FORMAT, message));
    }

}
