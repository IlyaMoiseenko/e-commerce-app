package by.moiseenko.customer.dto.response;

import by.moiseenko.customer.entity.Address;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CustomerResponse {

    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private Address address;
}
