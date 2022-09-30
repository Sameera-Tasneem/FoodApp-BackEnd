package com.clarivate.foodApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clarivate.foodApp.model.Item;
import com.clarivate.foodApp.service.FoodOrderService;
import com.clarivate.foodApp.service.ItemService;

@RestController
public class ItemController {

	@Autowired
	ItemService itemService;

	@Autowired
	FoodOrderService foodOrderService;

	@PostMapping("/item/add")
	public String addUser(@RequestBody Item item) {
		Long foodProductId = item.getFoodProduct().getId();
		Long foodOrderId = item.getFoodOrder().getId();
		Integer quantity = item.getQuantity();

		// To update total_price column upon adding items
		foodOrderService.updateFoodOrder(foodProductId, foodOrderId, quantity);

		return itemService.saveItem(item);
	}

	@GetMapping("/item/all")
	public List<Item> retrieveAllItems() {
		return itemService.getAllItems();
	}

	@PutMapping("/item/update/{id}")
	public void updateUser(@PathVariable Long id, @RequestBody Item item) {
		itemService.updateItem(id, item);
	}

	@DeleteMapping("/item/delete/{id}")
	public void removeUser(@PathVariable Long id) {
		itemService.deleteItem(id);
	}
}
