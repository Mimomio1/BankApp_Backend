package com.learning.banking.payload.request;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Feature;
import com.learning.banking.enums.AccountType;

import lombok.Data;

@Data
public class CreateAccountRequest {
	@NotNull
	@JsonFormat(with = { Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, Feature.ACCEPT_CASE_INSENSITIVE_VALUES }) 
	private AccountType accountType;
	@Positive
	@NotNull
	private BigDecimal accountBalance;
	
	private boolean approved = false;
}
