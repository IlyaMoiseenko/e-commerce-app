package by.moiseenko.order.dto.request;

import by.moiseenko.order.dto.response.CustomerResponse;
import by.moiseenko.order.entity.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
