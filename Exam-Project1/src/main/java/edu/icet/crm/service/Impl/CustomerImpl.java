package edu.icet.crm.service.Impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.dto.Customer;
import edu.icet.crm.entity.CustomerEntity;
import edu.icet.crm.repositary.CustomerRepositary;
import edu.icet.crm.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomerImpl implements CustomerService {

    private  final CustomerRepositary customerRepositary;
    private final ObjectMapper mapper;
    @Override
    public void addCustomer(Customer customer) {
        CustomerEntity customerEntity = mapper.convertValue(customer, CustomerEntity.class);
        customerRepositary.save(customerEntity);
    }
}
