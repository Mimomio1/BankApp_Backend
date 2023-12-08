package com.learning.banking.payload.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.learning.banking.entity.Transaction;
import com.learning.banking.enums.TransactionType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionsResponse {
	@JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime date;
	private String reference;
	private BigDecimal amount;
	private TransactionType transactionType;
	
	public TransactionsResponse(Transaction transaction) {
		this.date = transaction.getDate();
		this.reference = transaction.getReference();
		this.amount = transaction.getAmount();
		this.transactionType = transaction.getTransactionType();
	}
}
