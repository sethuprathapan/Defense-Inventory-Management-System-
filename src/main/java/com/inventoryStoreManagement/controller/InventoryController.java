package com.inventoryStoreManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.inventoryStoreManagement.entity.User;
import com.inventoryStoreManagement.service.UserService;



@Controller
public class InventoryController {
	
	
@Autowired                  
public UserService userservice;
	
@GetMapping("/login")
public String login() {
	return "login";
}
@PostMapping("/save")
public String adduser(@ModelAttribute User u){
	userservice.save(u);
	return "redirect:/login";	
}


}
