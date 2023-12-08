package com.learning.banking.payload.response;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.learning.banking.entity.Account;
import com.learning.banking.enums.AccountStatus;
import com.learning.banking.enums.AccountType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDetailsResponse {
	private long accountNumber;

	private AccountType accountType;
	
	private BigDecimal accountBalance;

	private AccountStatus accountStatus;
	
	private List<TransactionsResponse> transaction;
	
	public AccountDetailsResponse(Account account) {
		this.accountNumber = account.getAccountNumber();
		this.accountType = account.getAccountType();
		this.accountBalance = account.getAccountBalance();
		this.accountStatus = account.getAccountStatus();
		
		if (account.getTransactions() != null) {
			transaction = account.getTransactions().stream().sorted((o1, o2) -> {
				return o2.getDate().compareTo(o1.getDate());
			}).map(t -> {
				return new TransactionsResponse(t);
			}).collect(Collectors.toList());
		} else {
			transaction = Collections.emptyList();
		}
	}
}
