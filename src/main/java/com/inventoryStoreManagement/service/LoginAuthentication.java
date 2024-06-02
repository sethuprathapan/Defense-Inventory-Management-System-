package com.inventoryStoreManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventoryStoreManagement.entity.User;
import com.inventoryStoreManagement.repository.UserRepository;

import jakarta.servlet.http.HttpSession;


@Service
public class LoginAuthentication {
	
	@Autowired
	 UserRepository uRepo;
	
	public boolean athentication(String username, String password ) {
		User u=uRepo.findById(username).get();
		String email=u.getIdEmail();
		String pass=u.getPassword();
		//System.out.println(username);
		//System.out.println(password);
		if(username.equals(email) && password.equals(pass)) {
			
		return true;
		
		}else {
			System.out.println("false");
			return false;
		}
		
	}

}
