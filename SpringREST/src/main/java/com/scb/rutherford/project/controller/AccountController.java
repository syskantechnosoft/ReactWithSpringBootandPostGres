package com.scb.rutherford.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.scb.rutherford.project.model.Account;
import com.scb.rutherford.project.service.IAccountService;

@RestController
@CrossOrigin
public class AccountController {
	@Autowired
	private IAccountService iAccountService;

	@GetMapping("customer/{custId}/account/{id}")
	public Account getAccountById(@PathVariable int custId, @PathVariable int id) {
		return iAccountService.getAccountById(custId,id);
	}

	@GetMapping("customer/{custId}/account")
	public List<Account> getAccounts(@PathVariable int custId) {
		return iAccountService.getAccounts(custId);
	}

	@PostMapping("/account")
	public int addAccount(@RequestBody Account account) {
		return iAccountService.addAccount(account);
	}

	@DeleteMapping("/account/{id}")
	public int deleteAccount(@PathVariable int id) {
		return iAccountService.deleteAccount(id);
	}

	@PutMapping("/account/{id}")
	public int editAccount(@PathVariable int id, @RequestBody Account updatedAccount) {
		return iAccountService.editAccount(id, updatedAccount);
	}
}
