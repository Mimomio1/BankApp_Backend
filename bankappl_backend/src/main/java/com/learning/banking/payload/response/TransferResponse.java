package com.learning.banking.payload.response;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferResponse {
	@Positive
	@NotNull
	private Long fromAccNumber;
	@Positive
	@NotNull
	private Long toAccNumber;
	@Positive
	@NotNull
	private BigDecimal amount;
	@NotBlank
	private String reason;
	@Positive
	@NotNull
	private Long by;
}