package com.important;

import com.data.Database;
import com.models.Order;

public class OrderProcessorDb {
    public void processOrder(Order order, Database database) {
        database.insert(order);
    }
}
