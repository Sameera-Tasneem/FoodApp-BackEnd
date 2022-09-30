package com.clarivate.foodApp.service;


import com.clarivate.foodApp.model.FoodProduct;
import com.clarivate.foodApp.repository.FoodProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodProductService {
    @Autowired
    FoodProductRepository foodProductRepository;

    public String saveFoodOrder(FoodProduct foodProduct)
    {
        foodProductRepository.save(foodProduct);
        return foodProduct.toString();
    }

    public List<FoodProduct> getAllFoodProducts() {

        return foodProductRepository.findAll();
    }

    public void updateItem(Long id, FoodProduct foodProduct) {

        foodProduct.setId(id);
        foodProductRepository.save(foodProduct);
    }
}
