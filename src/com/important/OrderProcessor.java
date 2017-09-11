package com.important;

import com.logging.OrderLoggerInterface;
import com.models.Order;

// Parameter injection
// Constructor injection
// Property injection
// "Reflection" injection


public class OrderProcessor {
    private OrderLoggerInterface orderLogger;

    public OrderProcessor(OrderLoggerInterface orderLogger) {
        this.orderLogger = orderLogger;
    }

    public Order processOrder(Order order) {
        orderLogger.log("Processing order");

        if(order.id < 0) {
            orderLogger.log("Something went wrong processing order: " + order.id);
            return order;
        }

        orderLogger.log("Finished Processing order!");
        return order;
    }

    public void setOrderLogger(OrderLoggerInterface orderLogger) {
        this.orderLogger = orderLogger;
    }
}
