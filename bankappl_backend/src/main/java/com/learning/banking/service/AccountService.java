package com.learning.banking.service;

import java.util.List;
import java.util.Optional;

import com.learning.banking.entity.Account;


public interface AccountService {
	Optional<Account> getAccountByAccountNumber(long accountNumber);

	Account updateAccount(Account account);

	List<Account> updateAccounts(Iterable<Account> accounts);

	List<Account> getAllAccounts();

	boolean existsByAccountNumber(Long accountNumber);

	Optional<Account> findAccountByAccountNumber(Long accountNumber);

	List<Account> findAccountsByCustomerCustomerID(Long id);

	Account addAccount(Account account);
}
