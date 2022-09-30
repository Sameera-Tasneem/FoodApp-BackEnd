package com.clarivate.foodApp.controller;

import com.clarivate.foodApp.model.FoodOrder;
import com.clarivate.foodApp.model.FoodProduct;
import com.clarivate.foodApp.model.Item;
import com.clarivate.foodApp.service.FoodProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoodProductController {

    @Autowired
    FoodProductService foodProductService;

    @PostMapping("/api/foodproduct/add")
    public String addfoodProduct(@RequestBody FoodProduct foodProduct)
    {
        return foodProductService.saveFoodOrder(foodProduct);
    }

    @GetMapping("/api/foodproduct/all")
    public List<FoodProduct> retrieveAllFoodProducts()
    {
        return foodProductService.getAllFoodProducts();
    }

    @PutMapping("/api/foodproduct/update/{id}")
    public void updateFoodProduct(@PathVariable Long id,@RequestBody FoodProduct foodProduct)
    {
        foodProductService.updateItem(id, foodProduct);
    }
}
