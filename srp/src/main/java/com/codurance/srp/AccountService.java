package com.codurance.srp;



public class AccountService {

    private static final String STATEMENT_HEADER = "DATE | AMOUNT | BALANCE";
    private static final String DATE_FORMAT = "dd/MM/yyyy";
    private static final String AMOUNT_FORMAT = "#.00";

    private TransactionRepository transactionRepository;
    private Clock clock;
    private PrinterService printerService;

    public AccountService(TransactionRepository transactionRepository,
                          Clock clock,
                          PrinterService printerService) {
        this.transactionRepository = transactionRepository;
        this.clock = clock;
        this.printerService = printerService;
    }

    public void deposit(int amount) {
        transactionRepository.add(transactionWith(amount));
    }


    public void withdraw(int amount) {
        transactionRepository.add(transactionWith(-amount));
    }




    private Transaction transactionWith(int amount) {
        return new Transaction(clock.today(), amount);
    }


    public void printStatement() {
        printerService.printStatement();
    }


}