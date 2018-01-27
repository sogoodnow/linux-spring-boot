package com.msp.user;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserConller {
	@Autowired
	UserDao dao;
	
	@GetMapping("/{id}")
	public EntityUser findById(@PathVariable Long id)
	{
		EntityUser user=this.dao.findOne(id);
		return user;
	}

}
