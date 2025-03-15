package com.codurance.srp;


import static com.codurance.srp.Transaction.transactionWith;

public class AccountService {

    private static final String STATEMENT_HEADER = "DATE | AMOUNT | BALANCE";
    private static final String DATE_FORMAT = "dd/MM/yyyy";
    private static final String AMOUNT_FORMAT = "#.00";

    private Clock clock;
    private PrinterService printerService;
    private final TransactionService transactionService;

    public AccountService(TransactionService transactionService,
                          Clock clock,
                          PrinterService printerService) {
        this.transactionService = transactionService;
        this.clock = clock;
        this.printerService = printerService;
    }

    public void deposit(int amount) {
        transactionService.add(transactionWith(clock,amount));
    }


    public void withdraw(int amount) {
        transactionService.add(transactionWith(clock,-amount));
    }



}