package com.logging;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderLoggerTest {

    private OrderLogger orderLogger;

    @BeforeEach
    void setUp() {
        orderLogger = new OrderLogger();
    }

    @Test
    void shouldPrintMessageToStdOut() {

    }

}