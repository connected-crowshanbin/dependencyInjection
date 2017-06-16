package com.logging;

public class OrderLogger implements OrderLoggerInterface {
    public void log(String msg) {
        System.out.println(msg);
    }
}
