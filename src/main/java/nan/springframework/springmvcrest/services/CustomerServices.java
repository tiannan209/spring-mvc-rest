package nan.springframework.springmvcrest.services;

import nan.springframework.springmvcrest.domain.Customer;

import java.util.List;

public interface CustomerServices {
    Customer findCustomerById(Long id);
    List<Customer> findAllCustomers();

    Customer saveCustomer(Customer customer);
}
