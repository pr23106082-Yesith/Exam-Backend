package edu.icet.crm.controller;

import edu.icet.crm.dto.Customer;
import edu.icet.crm.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/add-customer")
    void addCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
    }
}
