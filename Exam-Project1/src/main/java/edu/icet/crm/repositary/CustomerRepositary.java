package edu.icet.crm.repositary;

import edu.icet.crm.entity.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepositary extends CrudRepository<CustomerEntity ,Integer> {


}
