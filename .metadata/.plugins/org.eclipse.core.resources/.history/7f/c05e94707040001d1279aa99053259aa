package com.clarivate.foodApp.controller;

import com.clarivate.foodApp.model.Menu;
import com.clarivate.foodApp.model.User;
import com.clarivate.foodApp.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MenuController {

    @Autowired
    MenuService menuService;

    @PostMapping("/api/menu/add")
    public String addUser(@RequestBody Menu menu)
    {
        //TODO
        //user.getEmail() .eq
        return menuService.saveMenu(menu);
    }

    @GetMapping("/api/menu/all")
    public List<Menu> retrieveAllMenus()
    {
        return menuService.getAllMenus();
    }

    @PutMapping("/api/menu/update/{id}")
    public void updateUser(@PathVariable Long id,@RequestBody Menu menu)
    {
        menuService.updateMenu(id, menu);
    }
}
