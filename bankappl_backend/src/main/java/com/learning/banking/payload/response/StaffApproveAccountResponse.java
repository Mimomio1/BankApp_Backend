package com.learning.banking.payload.response;

import javax.validation.constraints.Positive;

import lombok.Data;


@Data
public class StaffApproveAccountResponse {
	@Positive
	private long accountNumber;
	private String approved;
}