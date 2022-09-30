package com.clarivate.foodApp.repository;

import com.clarivate.foodApp.model.FoodOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodOrderRepository extends JpaRepository<FoodOrder, Long> {
}
