package edu.icet.crm.service.Impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.dto.Customer;
import edu.icet.crm.entity.CustomerEntity;
import edu.icet.crm.repositary.CustomerRepositary;
import edu.icet.crm.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

    private  final CustomerRepositary customerRepositary;
    private final ObjectMapper mapper;
    @Override
    public void addCustomer(Customer customer) {
        CustomerEntity customerEntity = mapper.convertValue(customer, CustomerEntity.class);
        customerRepositary.save(customerEntity);
    }

    @Override
    public List<Customer> getAllCustomer() {
        List <Customer> customerList= new ArrayList();
        Iterable<CustomerEntity> all = customerRepositary.findAll();

        all.forEach(customerEntity -> {
            Customer customer = mapper.convertValue(customerEntity, Customer.class);
            customerList.add(customer);
        });
        return customerList;
    }

    @Override
    public void upadateCustomer(Customer customer) {
        if (customerRepositary.existsById(customer.getId())){
            CustomerEntity customerEntity = mapper.convertValue(customer, CustomerEntity.class);
            customerRepositary.save(customerEntity);
        }
    }

    @Override
    public boolean deleteCustomer(Integer id) {
        if(customerRepositary.existsById(id)){
            customerRepositary.deleteById(id);
            return true;
        }

        return false;
    }
}
