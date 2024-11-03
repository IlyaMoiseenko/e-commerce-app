package by.moiseenko.customer.repository;

import by.moiseenko.customer.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoCustomerRepository extends MongoRepository<Customer, String> {
}
