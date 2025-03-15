package com.codurance.srp;

import java.util.List;

public interface TransactionService {
    void add(Transaction transaction);
    List<Transaction> all();
}
