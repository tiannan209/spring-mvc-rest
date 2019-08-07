package nan.springframework.springmvcrest.controllers;

import nan.springframework.springmvcrest.domain.Customer;
import nan.springframework.springmvcrest.services.CustomerServices;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(CustomerControlller.BASE_URL)
public class CustomerControlller {
    public static final String BASE_URL = "/api/v1/customers";

    private final CustomerServices customerServices;

    public CustomerControlller(CustomerServices customerServices) {
        this.customerServices = customerServices;
    }

    @GetMapping
    List<Customer> getAllCustomers(){
        return customerServices.findAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id){
        return customerServices.findCustomerById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerServices.saveCustomer(customer);
    }
}
