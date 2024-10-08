package com.dailycodework.ekart.service.order;

import com.dailycodework.ekart.dto.OrderDto;
import com.dailycodework.ekart.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}
