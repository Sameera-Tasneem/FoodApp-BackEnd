package com.clarivate.foodApp.controller;

import com.clarivate.foodApp.model.FoodOrder;
import com.clarivate.foodApp.model.FoodProduct;
import com.clarivate.foodApp.service.FoodOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoodOrderController {

    @Autowired
    FoodOrderService foodOrderService;

    @PostMapping("/api/foodorder/add")
    public String addfoodOrder(@RequestBody FoodOrder foodOrder)
    {
        return foodOrderService.saveFoodOrder(foodOrder);
    }

    @GetMapping("/api/foodorder/all")
    public List<FoodOrder> retrieveAllFoodOrder()
    {
        return foodOrderService.getAllFoodOrder();
    }

    @PutMapping("/api/foodorder/update/{id}")
    public void updateFoodOrder(@PathVariable Long id,@RequestBody FoodOrder foodOrder)
    {
        foodOrderService.updateItem(id, foodOrder);
    }

}
