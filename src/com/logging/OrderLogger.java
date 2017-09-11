package com.logging;

import java.io.PrintStream;

public class OrderLogger implements OrderLoggerInterface {

    private final PrintStream out;

    public OrderLogger() {
        out = System.out;
    }

    public void log(String msg) {
        out.println(msg);
    }
}
