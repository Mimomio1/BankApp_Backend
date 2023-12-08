package com.learning.banking.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.learning.banking.enums.TransactionType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = { "initiatedBy" })
@ToString(exclude = { "initiatedBy" })
@Entity
@Table
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long transactionID;
	private LocalDateTime date;
	private String reference;
	private BigDecimal amount;
	@Enumerated(EnumType.STRING)
	private TransactionType transactionType;
	
	@ManyToOne
	private Account account;
	
	@OneToOne
	private Customer initiatedBy; 
}
