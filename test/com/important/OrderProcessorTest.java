package com.important;

import com.logging.OrderLogger;
import com.logging.OrderLoggerForTests;
import com.models.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;


class OrderProcessorTest {

    OrderProcessor orderProcessor;
    private OrderLogger mockedOrderLogger;
    private OrderLoggerForTests customOrderLogger;

    @BeforeEach
    void setUp() {
        mockedOrderLogger = mock(OrderLogger.class);
        orderProcessor = new OrderProcessor(mockedOrderLogger);
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
        Order badOrder = new Order(-1);
        orderProcessor.processOrder(badOrder);

        "Something went wrong!".equals(customOrderLogger.lastMessageCalledWith);
    }

    @Test
    void shouldLogSomethingWentWrongWhenGivenBadOrder2() {
        Order badOrder = new Order(-1);
        orderProcessor.processOrder(badOrder);

        verify(mockedOrderLogger).log("Something went wrong processing order: -1");

    }

    @Test
    void shouldLogFinishedProcessingOrderWhenGivenGoodOrder() {
        Order goodOrder = new Order(1);
        orderProcessor.processOrder(goodOrder);

        verify(mockedOrderLogger).log("Processing order");
        verify(mockedOrderLogger).log("Finished Processing order!");

        verify(mockedOrderLogger, times(2)).log("s");

        Mockito.verifyNoMoreInteractions(mockedOrderLogger);
    }
}