package com.imrob.desafio01.services;

import com.imrob.desafio01.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private ShippingService shippingService;
    public double total(Order order) {
        double priceWithDiscount = order.getBasic() - (order.getBasic() * (order.getDiscount() / 100.0));
        return priceWithDiscount + shippingService.shipment(order);
    }
}
