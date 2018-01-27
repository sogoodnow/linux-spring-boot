package com.msp.user;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserConller {
	@GetMapping("/{id}")
	String idex(@PathVariable Long id)
	{
		return 
	}

}
