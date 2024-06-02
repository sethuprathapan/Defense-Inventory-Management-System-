package com.inventoryStoreManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.inventoryStoreManagement.entity.User;
import com.inventoryStoreManagement.service.LoginAuthentication;
import com.inventoryStoreManagement.service.UserService;

import jakarta.servlet.http.HttpSession;





@Controller
public class InventoryController {
	
	
	
@Autowired                  
public UserService userservice;

@Autowired
public LoginAuthentication l;

	
@GetMapping("/login")
public String login() {
	return "login";
}
@PostMapping("/save")
public String adduser(@ModelAttribute User u){
	userservice.save(u);
	return "login";	
}
// @GetMapping("/checklogdetails")
// public String checklogdetails(HttpSession session ,Model model){
//	 session.invalidate();
//	 if(session.getAttribute("user")!=null) {
//		 //String idEmail=(String)session.getAttribute("user");
//		 String idEmail="pareekshnam";
//		 String username=userservice.username(idEmail);
//		 model.addAttribute("user_name",username);
//		 return "index";
//	 }else {
//	 return "login";
//	 }
// }
 
@PostMapping("/checklogdetails")
public String checklogdetails(@RequestParam("idEmail") String idEmail , @RequestParam("password" )String password ,  HttpSession session ,Model model){
	 //session.invalidate();
	if(l.athentication(idEmail, password)) {
		
		String username=userservice.username(idEmail);
		//System.out.println(username + "huhuh");
		session.setAttribute("user" ,idEmail);
		
		model.addAttribute("user_name",username);
		
		
		//String s= (String)session.getAttribute("user");
		//System.out.print(user);
		return "index";
	}
	else {
	return "login";	
}}

}
