package model;
import lombok.*;

import java.util.*;
@NoArgsConstructor
@Getter
@Setter
//@AllArgsConstructor
@ToString


public class AccountDto {
    private long id;

    public AccountDto(long id, String accountNumber, String accountHolder, double balance, Date transactionDate) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transactionDate = transactionDate;
    }

    private String accountNumber;


    private String accountHolder;

    private double balance;


    private Date transactionDate;


}
