package com.learning.banking.payload.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.Data;

@Data
public class ApproveAccountRequest {
	@Positive
	@NotNull
	private Long accountNumber;
	@NotBlank
	private String approved;
}
