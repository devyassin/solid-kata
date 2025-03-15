package com.codurance.srp;

import java.util.List;

public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public void add(Transaction transaction) {
        transactionRepository.add(transaction);
    }

    @Override
    public List<Transaction> all() {
        return transactionRepository.all();
    }
}
