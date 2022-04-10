package com.example.REST_server;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {
	private static final String template = "Hello";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/bn/api/accounts")
	public Accounts accounts(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Accounts(counter.incrementAndGet(), String.format(template,name), name, name, 0, name, name, false, name);
	}
}
