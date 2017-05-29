package com.important;

import com.logging.OrderLogger;
import com.models.Order;

public class OrderProcessor {
    public void processOrder(Order order) {
        OrderLogger.log("Processing order");

        if(order.id < 0) {
            OrderLogger.log("Something went wrong processing order: " + order.id);
        }

        OrderLogger.log("Finished Processing order!");
    }
}
