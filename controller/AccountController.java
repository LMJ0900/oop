package controller;

import builder.AccountBuilder;
import model.AccountDto;
import service.AccountService;
import serviceImpl.AccountServiceImpl;

import java.util.List;
import java.util.Scanner;

public class AccountController {
   AccountService accountService;

    public AccountController() {
        this.accountService = AccountServiceImpl.getInstance();
    }


    public String createAccount(Scanner sc) {
        System.out.println("이름, 주민번호, 전화번호, " +
                "계좌번호, 비밀번호를 입력해주세요");
        return accountService.createAccount(new AccountBuilder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build());
    }

    public String deposit(Scanner sc) {
        return accountService.deposit(new AccountBuilder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build());

    }

    public String withdraw(Scanner sc) {
        return accountService.withdraw(new AccountBuilder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build());
    }

    public String getBalance(Scanner sc) {
        return accountService.getBalance(sc.next());
    }

    public void cancelAccount(Scanner sc) {
    }
}
