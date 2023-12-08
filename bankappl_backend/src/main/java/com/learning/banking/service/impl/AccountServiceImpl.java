package com.learning.banking.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.banking.entity.Account;
import com.learning.banking.repo.AccountRepository;
import com.learning.banking.service.AccountService;


@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountRepository repo;

	@Override
	public Optional<Account> getAccountByAccountNumber(long accountNumber) {
		return repo.findById(accountNumber);
	}

	@Override
	public List<Account> updateAccounts(Iterable<Account> accounts) {
		return repo.saveAll(accounts);
	}

	@Override
	public boolean existsByAccountNumber(Long accountNumber) {
		return repo.existsByAccountNumber(accountNumber);
	}

	@Override
	public Optional<Account> findAccountByAccountNumber(Long accountNumber) {
		return repo.findAccountByAccountNumber(accountNumber);
	}

	@Override
	public Account updateAccount(Account account) {
		return repo.save(account);
	}

	@Override
	public List<Account> getAllAccounts() {
		return repo.findAll();
	}

	@Override
	public List<Account> findAccountsByCustomerCustomerID(Long id) {
		return repo.findAccountsByCustomerCustomerID(id);
	}

	public Account addAccount(Account account) {
		return repo.save(account);
	}
}
