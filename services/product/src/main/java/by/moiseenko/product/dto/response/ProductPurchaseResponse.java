package by.moiseenko.product.dto.response;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ProductPurchaseResponse {

    Integer productId;
    String name;
    String description;
    BigDecimal price;
    double quantity;
}
