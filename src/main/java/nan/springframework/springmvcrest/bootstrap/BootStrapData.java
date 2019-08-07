package nan.springframework.springmvcrest.bootstrap;

import nan.springframework.springmvcrest.domain.Customer;
import nan.springframework.springmvcrest.respositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
       System.out.println("Loading Customer Data");

        Customer c1 = new Customer();
        c1.setFirstName("Nan");
        c1.setLastName("Tian");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("Jie");
        c2.setLastName("Tian");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstName("Ying");
        c3.setLastName("Wang");
        customerRepository.save(c3);

        System.out.println("Customers saved: " + customerRepository.count());
    }
}
