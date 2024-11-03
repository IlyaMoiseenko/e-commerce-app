package by.moiseenko.customer.dto.request;

import by.moiseenko.customer.entity.Address;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CustomerRequest {

    private String id;

    @NotNull(message = "Customer firstname is required")
    private String firstname;

    @NotNull(message = "Customer lastname is required")
    private String lastname;

    @NotNull(message = "Customer Email is required")
    @Email(message = "Customer Email is not a valid email address")
    private String email;
    private Address address;
}
