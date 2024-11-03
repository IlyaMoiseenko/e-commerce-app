package by.moiseenko.product.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ProductPurchaseRequest {

    @NotNull(message = "Product is mandatory")
    Integer productId;
    @Positive(message = "Quantity is mandatory")
    double quantity;
}
