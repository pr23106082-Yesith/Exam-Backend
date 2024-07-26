package edu.icet.crm.controller;

import edu.icet.crm.dto.Customer;
import edu.icet.crm.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/get-All")
    List<Customer> getAllCustomer(){
        return  customerService.getAllCustomer();
    }

    @PutMapping("/update-Customer")
    void upadateCustomer(@RequestBody Customer customer){
        customerService.upadateCustomer(customer);
    }

    @DeleteMapping("/delete-Customer/{id}")
    boolean deleteCustomer(@PathVariable Integer id){
        return customerService.deleteCustomer(id);
    }

}
