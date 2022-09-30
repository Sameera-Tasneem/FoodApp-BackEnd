package com.clarivate.foodApp.repository;

import com.clarivate.foodApp.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}
