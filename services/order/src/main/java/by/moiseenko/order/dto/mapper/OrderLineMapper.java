package by.moiseenko.order.dto.mapper;

import by.moiseenko.order.dto.request.OrderLineRequest;
import by.moiseenko.order.dto.response.OrderLineResponse;
import by.moiseenko.order.entity.Order;
import by.moiseenko.order.entity.OrderLine;
import org.springframework.stereotype.Service;

@Service
public class OrderLineMapper {
    public OrderLine toOrderLine(OrderLineRequest request) {
        return OrderLine.builder()
                .id(request.orderId())
                .productId(request.productId())
                .order(
                        Order.builder()
                                .id(request.orderId())
                                .build()
                )
                .quantity(request.quantity())
                .build();
    }

    public OrderLineResponse toOrderLineResponse(OrderLine orderLine) {
        return new OrderLineResponse(
                orderLine.getId(),
                orderLine.getQuantity()
        );
    }
}
