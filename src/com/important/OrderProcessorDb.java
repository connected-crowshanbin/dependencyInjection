package com.important;

import com.data.Database;
import com.logging.OrderLogger;
import com.models.Order;

public class OrderProcessorDb {
    public void processOrder(Order order) {
        Database.insert(order);
    }
}
