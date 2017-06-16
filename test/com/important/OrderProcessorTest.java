package com.important;

import com.logging.OrderLoggerForTests;
import com.models.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class OrderProcessorTest {

    OrderProcessor orderProcessor;
    private OrderLoggerForTests customOrderLogger;

    @BeforeEach
    void setUp() {
        customOrderLogger = new OrderLoggerForTests();
        orderProcessor = new OrderProcessor(customOrderLogger);
    }

    @Test
    void shouldLogProcessingOrderWhenProcessingOrder() {
        Order order = new Order(1);

        orderProcessor.processOrder(order);

        // make sure it's called with "Processing Order!"
    }

    @Test
    void shouldLogFinishedProcessingOrderWhenFinishedProcessingOrder() {
        Order order = new Order(1);

        orderProcessor.processOrder(order);

        // ???
    }

    @Test
    void shouldLogSomethingWentWrongWhenGivenBadOrder1() {
        orderProcessor = new OrderProcessor(customOrderLogger);

        Order badOrder = new Order(-1);
        orderProcessor.processOrder(badOrder);

        "Something went wrong!".equals(customOrderLogger.lastMessageCalledWith);
    }
}