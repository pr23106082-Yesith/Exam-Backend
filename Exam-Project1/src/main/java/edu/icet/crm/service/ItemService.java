package edu.icet.crm.service;

import edu.icet.crm.dto.Customer;
import edu.icet.crm.dto.Item;

import java.util.List;

public interface ItemService {
    void additem(Item item);

    List<Item> getAllItem();

    void upadatitem(Item item);

    Item getItemById(Integer id);
}
