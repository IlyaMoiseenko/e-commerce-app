package by.moiseenko.payment.dto.request;

import by.moiseenko.payment.entity.Customer;
import by.moiseenko.payment.entity.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        Integer id,
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        Customer customer
) {
}
