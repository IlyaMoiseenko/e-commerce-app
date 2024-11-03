package by.moiseenko.order.kafka;

import by.moiseenko.order.dto.response.CustomerResponse;
import by.moiseenko.order.dto.response.PurchaseResponse;
import by.moiseenko.order.entity.PaymentMethod;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
