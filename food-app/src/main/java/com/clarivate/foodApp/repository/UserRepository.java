package com.clarivate.foodApp.repository;

import com.clarivate.foodApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
