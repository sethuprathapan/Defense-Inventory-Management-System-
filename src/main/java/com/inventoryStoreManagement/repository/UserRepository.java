package com.inventoryStoreManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventoryStoreManagement.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,String>{

	public boolean findByPassword(String password);
	
}
