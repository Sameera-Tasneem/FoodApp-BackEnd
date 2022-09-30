package com.clarivate.foodApp.repository;

import com.clarivate.foodApp.model.FoodProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodProductRepository extends JpaRepository<FoodProduct, Long> {
}
