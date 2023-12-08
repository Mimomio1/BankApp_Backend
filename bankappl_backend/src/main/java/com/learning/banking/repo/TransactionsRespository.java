package com.learning.banking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.banking.entity.Transaction;


@Repository
public interface TransactionsRespository extends JpaRepository<Transaction, Long> {

}
