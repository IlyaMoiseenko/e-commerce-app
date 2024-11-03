package by.moiseenko.product.dto.response;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ProductResponse {

    private Integer id;
    private String name;
    private String description;
    private double availableQuantity;
    private BigDecimal price;
    private Integer categoryId;
    private String categoryName;
    private String categoryDescription;
}
