package by.moiseenko.customer.dto.mapper;

import by.moiseenko.customer.dto.request.CustomerRequest;
import by.moiseenko.customer.dto.response.CustomerResponse;
import by.moiseenko.customer.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public Customer toCustomer(CustomerRequest request) {
        if (request == null) {
            return null;
        }

        return Customer.builder()
                .id(request.getId())
                .firstname(request.getFirstname())
                .lastname(request.getLastname())
                .email(request.getEmail())
                .address(request.getAddress())
                .build();
    }

    public CustomerResponse fromCustomer(Customer customer) {
        if (customer == null) {
            return null;
        }

        return new CustomerResponse(
                customer.getId(),
                customer.getFirstname(),
                customer.getLastname(),
                customer.getEmail(),
                customer.getAddress()
        );
    }
}
