package com.clarivate.foodApp.service;

import com.clarivate.foodApp.model.User;
import com.clarivate.foodApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String saveUser(User user) {
        userRepository.save(user);
        return user.toString();
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void updateUser(Long id, User user) {

        user.setId(id);
        userRepository.save(user);
    }
}
