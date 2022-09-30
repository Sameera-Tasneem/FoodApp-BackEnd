package com.clarivate.foodApp.controller;

import com.clarivate.foodApp.model.Item;
import com.clarivate.foodApp.model.Menu;
import com.clarivate.foodApp.service.FoodOrderService;
import com.clarivate.foodApp.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemService itemService;

    @Autowired
    FoodOrderService foodOrderService;

    @PostMapping("/api/item/add")
    public String addUser(@RequestBody Item item)
    {
        Long foodProductId = item.getFoodProduct().getId();
        Long foodOrderId = item.getFoodOrder().getId();
        Integer quantity = item.getQuantity();
        foodOrderService.updateFoodOrder(foodProductId, foodOrderId, quantity);
        return itemService.saveItem(item);
    }

    @GetMapping("/api/item/all")
    public List<Item> retrieveAllItems()
    {
        return itemService.getAllItems();
    }

    @PutMapping("/api/item/update/{id}")
    public void updateUser(@PathVariable Long id,@RequestBody Item item)
    {
        itemService.updateItem(id, item);
    }
}
