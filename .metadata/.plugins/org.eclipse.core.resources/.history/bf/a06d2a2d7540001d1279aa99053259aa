package com.clarivate.foodApp.service;

import com.clarivate.foodApp.model.Item;
import com.clarivate.foodApp.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public String saveItem(Item item) {
        itemRepository.save(item);
        return item.toString();
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public void updateItem(Long id, Item item) {

        item.setId(id);
        itemRepository.save(item);
    }
}
