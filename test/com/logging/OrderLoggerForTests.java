package com.logging;

public class OrderLoggerForTests implements OrderLoggerInterface {
    public String lastMessageCalledWith;

    @Override
    public void log(String msg) {
        lastMessageCalledWith = msg;
    }
}
