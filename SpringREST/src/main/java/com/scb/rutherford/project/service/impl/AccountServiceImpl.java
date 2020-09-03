package com.scb.rutherford.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.rutherford.project.dao.IAccountDAO;
import com.scb.rutherford.project.model.Account;
import com.scb.rutherford.project.service.IAccountService;

@Service
public class AccountServiceImpl implements IAccountService{

	@Autowired
	private IAccountDAO iAccountDAO;
	@Override
	public Account getAccountById(int custId,int id) {
		// TODO Auto-generated method stub
		return iAccountDAO.getAccountById(custId,id);
	}

	@Override
	public List<Account> getAccounts(int custId) {
		// TODO Auto-generated method stub
		return iAccountDAO.getAccounts(custId);
	}

	@Override
	public int addAccount(Account account) {
		// TODO Auto-generated method stub
		return iAccountDAO.addAccount(account);
	}

	@Override
	public int deleteAccount(int id) {
		// TODO Auto-generated method stub
		return iAccountDAO.deleteAccount(id);
	}

	@Override
	public int editAccount(int id, Account updatedAccount) {
		// TODO Auto-generated method stub
		return iAccountDAO.editAccount(id, updatedAccount);
	}

}
