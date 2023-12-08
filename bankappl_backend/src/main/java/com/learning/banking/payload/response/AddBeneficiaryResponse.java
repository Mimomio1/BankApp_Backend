package com.learning.banking.payload.response;

import com.learning.banking.entity.Beneficiary;
import com.learning.banking.enums.AccountType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddBeneficiaryResponse {
	private Long accountNumber;
	private AccountType accountType;
	private boolean approved;
	
	public AddBeneficiaryResponse(Beneficiary beneficiary) {
		this.accountNumber = beneficiary.getAccount().getAccountNumber();
		this.accountType = beneficiary.getAccount().getAccountType();
		this.approved = beneficiary.isApproved();
	}
}