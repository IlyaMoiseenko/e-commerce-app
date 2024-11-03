package by.moiseenko.order.dto.request;

public record OrderLineRequest(
        Integer id,
        Integer orderId,
        Integer productId,
        double quantity
) {
}
