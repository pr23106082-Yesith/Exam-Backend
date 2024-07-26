package edu.icet.crm.repositary;

import edu.icet.crm.entity.ItemEntity;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepositary extends CrudRepository<ItemEntity,Integer> {
}
