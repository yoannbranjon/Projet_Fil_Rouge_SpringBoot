package fr.ibformaiton.CinemaMargoulin.controllers;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformaiton.CinemaMargoulin.Services.AccountService;
import fr.ibformaiton.CinemaMargoulin.beans.Account;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;

	@PostConstruct
	@Transactional
	void init() {
		Account account = new Account("nezha@gmail.com", "password");
		accountService.add(account);
	}

	@GetMapping("/REST/recupaccount")
	public List<Account> getAll() {
		return accountService.getAll();
	}
}
