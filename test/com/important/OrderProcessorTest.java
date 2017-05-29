package com.important;

import com.models.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderProcessorTest {

    OrderProcessor orderProcessor;

    @BeforeEach
    void setUp() {
        orderProcessor = new OrderProcessor();
    }

    @Test
    void shouldLogProcessingOrderWhenProcessingOrder() {
        Order order = new Order(1);

        orderProcessor.processOrder(order);

        // ???
    }

    @Test
    void shouldLogFinishedProcessingOrderWhenFinishedProcessingOrder() {
        Order order = new Order(1);

        orderProcessor.processOrder(order);

        // ???
    }

    @Test
    void shouldLogSomethingWentWrongWhenGivenBadOrder() {
        Order badOrder = new Order(-1);

        orderProcessor.processOrder(badOrder);

        // ???
    }
}