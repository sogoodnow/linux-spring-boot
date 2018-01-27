package com.msp.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserConller {
	@Autowired
	UserDao dao;
	
	@GetMapping("/{id}")
	public User findById(@PathVariable Long id)
	{
		User user=this.dao.findOne(id);
		return user;
	}

}
