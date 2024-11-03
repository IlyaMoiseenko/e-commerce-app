package by.moiseenko.product.dto.mapper;

import by.moiseenko.product.dto.request.ProductRequest;
import by.moiseenko.product.dto.response.ProductPurchaseResponse;
import by.moiseenko.product.dto.response.ProductResponse;
import by.moiseenko.product.entity.Category;
import by.moiseenko.product.entity.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductMapper {
    public Product toProduct(ProductRequest request) {
        return Product.builder()
                .id(request.getId())
                .name(request.getName())
                .description(request.getDescription())
                .availableQuantity(request.getAvailableQuantity())
                .price(request.getPrice())
                .category(
                        Category.builder()
                                .id(request.getId())
                                .build()
                )
                .build();
    }

    public ProductResponse toProductResponse(Product product) {
        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getAvailableQuantity(),
                product.getPrice(),
                product.getCategory().getId(),
                product.getCategory().getName(),
                product.getCategory().getDescription()
        );
    }

    public ProductPurchaseResponse toproductPurchaseResponse(Product product, double quantity) {
        return new ProductPurchaseResponse(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                quantity
        );
    }
}
