package com.learning.banking.payload.response;

import com.learning.banking.entity.Beneficiary;
import com.learning.banking.enums.BeneficiaryStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BeneficiaryResponse {
	private long beneficiaryID;
	private long beneficiaryAccountNo;
	private String beneficiaryName;
	private BeneficiaryStatus active;
	
	public BeneficiaryResponse(Beneficiary beneficiary) {
		this.beneficiaryID = beneficiary.getBeneficiaryID();
		this.beneficiaryAccountNo = beneficiary.getAccount().getAccountNumber();
		this.beneficiaryName = beneficiary.getAccount().getCustomer().getFullname();
		this.active = beneficiary.getActive();
	}
}
