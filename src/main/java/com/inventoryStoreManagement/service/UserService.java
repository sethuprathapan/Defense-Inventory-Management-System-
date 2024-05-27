package com.inventoryStoreManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventoryStoreManagement.entity.User;
import com.inventoryStoreManagement.repository.UserRepository;

@Service
public class UserService {
@Autowired
private UserRepository uRepo;
public void save(User u) {
	uRepo.save(u);
}
}
