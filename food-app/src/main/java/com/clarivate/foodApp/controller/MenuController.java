package com.clarivate.foodApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clarivate.foodApp.model.Menu;
import com.clarivate.foodApp.service.MenuService;

@RestController
public class MenuController {

	@Autowired
	MenuService menuService;

	@PostMapping("/menu/add")
	public String addUser(@RequestBody Menu menu) {
		return menuService.saveMenu(menu);
	}

	@GetMapping("/menu/all")
	public List<Menu> retrieveAllMenus() {
		return menuService.getAllMenus();
	}

	@PutMapping("/menu/update/{id}")
	public void updateUser(@PathVariable Long id, @RequestBody Menu menu) {
		menuService.updateMenu(id, menu);
	}

	@DeleteMapping("/menu/delete/{id}")
	public void removeUser(@PathVariable Long id) {
		menuService.deleteMenu(id);
	}
}
