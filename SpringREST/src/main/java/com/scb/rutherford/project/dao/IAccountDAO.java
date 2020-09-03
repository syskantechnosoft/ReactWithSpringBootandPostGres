package com.scb.rutherford.project.dao;

import java.util.List;

import com.scb.rutherford.project.model.Account;

public interface IAccountDAO {
	public Account getAccountById(int custId,int id);

	public List<Account> getAccounts(int custId);

	public int addAccount(Account account);

	public int deleteAccount(int id);

	public int editAccount(int id, Account updatedAccount);
}
