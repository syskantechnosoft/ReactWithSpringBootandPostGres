package com.scb.rutherford.project.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.scb.rutherford.project.dao.IAccountDAO;
import com.scb.rutherford.project.model.Account;

@Repository
public class AccountDAOImpl implements IAccountDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Account getAccountById(int custId,int id) {
		// TODO Auto-generated method stub
		String query = "select id,account_type,account_number,account_branch,account_balance,customer_id from accounts where customer_id=? and id=?";
		RowMapper<Account> rowMapper = new BeanPropertyRowMapper<Account>(Account.class);
		Account account = jdbcTemplate.queryForObject(query, rowMapper,custId, id);
		return account;
	}

	@Override
	public List<Account> getAccounts(int custId) {
		// TODO Auto-generated method stub
		String sql = "select id,account_type,account_number,account_branch,account_balance,customer_id from accounts accounts where customer_id=?";
		RowMapper<Account> rowMapper = new BeanPropertyRowMapper<Account>(Account.class);
		List<Account> accountsList = jdbcTemplate.query(sql,new Object[] {custId}, rowMapper);
		return accountsList;
	}

	@Override
	public int addAccount(Account account) {
		// TODO Auto-generated method stub
		int insertStatus = -1;
		String query = "INSERT INTO accounts(account_type,account_number,account_branch,account_balance,customer_id) VALUES ( ?, ?, ?, ?, ?)";
		insertStatus = jdbcTemplate.update(query, account.getAccountType(), account.getAccountNumber(),
				account.getAccountBranch(), account.getAccountBalance(), account.getCustomerId());
		return insertStatus;
	}

	@Override
	public int deleteAccount(int id) {
		// TODO Auto-generated method stub
		int deleteStatus = -1;
		String query = "DELETE FROM accounts WHERE id=?";
		deleteStatus = jdbcTemplate.update(query, id);
		return deleteStatus;
	}

	@Override
	public int editAccount(int id, Account updatedAccount) {
		// TODO Auto-generated method stub
		int editStatus = -1;
		String query = "UPDATE accounts SET account_type=?, account_number=?, account_branch=?, account_balance=?, customer_id=? WHERE id=?";
		editStatus = jdbcTemplate.update(query, updatedAccount.getAccountType(), updatedAccount.getAccountNumber(),
				updatedAccount.getAccountBranch(), updatedAccount.getAccountBalance(), updatedAccount.getCustomerId(),
				id);
		return editStatus;
	}

}
