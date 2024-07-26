package edu.icet.crm.service.Impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.dto.Customer;
import edu.icet.crm.dto.Item;
import edu.icet.crm.entity.ItemEntity;
import edu.icet.crm.repositary.ItemRepositary;
import edu.icet.crm.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ItemServiceImpl implements ItemService {

    private  final ItemRepositary itemRepositary;
    private final ObjectMapper mapper;

    @Override
    public void additem(Item item) {

        ItemEntity itemEntity = mapper.convertValue(item, ItemEntity.class);
        itemRepositary.save(itemEntity);
    }

    @Override
    public List<Item> getAllItem() {
        List <Item> itemList = new ArrayList();
        Iterable<ItemEntity> all = itemRepositary.findAll();

        all.forEach(itemEntity -> {
            Item item = mapper.convertValue(itemEntity, Item.class);
            itemList.add(item);
        });
        return itemList;
    }

    @Override
    public void upadatitem(Item item) {
        if (itemRepositary.existsById(item.getId())){
            ItemEntity itemEntity = mapper.convertValue(item, ItemEntity.class);
            itemRepositary.save(itemEntity);

        }
    }

    @Override
    public Item getItemById(Integer id) {
        if(itemRepositary.existsById(id)){
            Optional<ItemEntity> byId = itemRepositary.findById(id);
            return mapper.convertValue(byId, Item.class);
        }
        return null;
    }
}
