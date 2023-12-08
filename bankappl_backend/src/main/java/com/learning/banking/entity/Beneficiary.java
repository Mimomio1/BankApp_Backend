package com.learning.banking.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.learning.banking.enums.BeneficiaryStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = { "account", "beneficiaryOf", "approvedBy" })
@EqualsAndHashCode(exclude = { "account", "beneficiaryOf", "approvedBy" })
@Entity
@Table
public class Beneficiary {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long beneficiaryID;
	
	@OneToOne
	@JsonIgnore
	private Account account; 
	
	@ManyToOne
	@JsonIgnore
	private Customer beneficiaryOf; 

	private LocalDate addedDate;

	private boolean approved;
	
	@Enumerated(EnumType.STRING)
	private BeneficiaryStatus active;
	
	@OneToOne
	@JsonIgnore
	private Customer approvedBy; 
	
	public Beneficiary(Account account, Customer beneficiaryOf) {
		this.account = account;
		this.beneficiaryOf = beneficiaryOf;
	}
}
