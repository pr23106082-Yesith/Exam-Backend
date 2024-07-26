package edu.icet.crm.controller;

import edu.icet.crm.dto.Customer;
import edu.icet.crm.dto.Item;
import edu.icet.crm.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Items")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @PostMapping("/add-items")
    void additem(@RequestBody Item item){
        itemService.additem(item);
    }

    @GetMapping("/get-All")
    List<Item> getAllCustomer(){
        return  itemService.getAllItem();
    }

    @PutMapping("/update-items")
    void upadateCustomer(@RequestBody Item item){
        itemService.upadatitem(item);
    }

    @GetMapping("/find-by-id/{id}")
    public Item findbyId(@PathVariable Integer id){
        return itemService.getItemById(id);
    }
}
