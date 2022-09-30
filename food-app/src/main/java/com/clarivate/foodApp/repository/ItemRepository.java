package com.clarivate.foodApp.repository;

import com.clarivate.foodApp.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
