package serviceImpl;

import model.AccountDto;
import model.MemberDto;
import service.AccountService;
import service.AuthService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class AccountServiceImpl implements AccountService {
    private static AccountServiceImpl instance = new AccountServiceImpl();

    private AccountServiceImpl() {
        this.accounts = new ArrayList<>();
    }

    public static AccountServiceImpl getInstance() {
        return instance;
    }

    List<AccountDto> accounts = new ArrayList<>();


    @Override
    public String createAccount(AccountDto account) {
        String result ="";
        accounts.add(account);
        return null;
    }

    @Override
    public String deposit(AccountDto account) {
        return null;
    }

    @Override
    public String withdraw(AccountDto account) {
        return null;
    }

    @Override
    public String getBalance(String accountNumber) {
        return null;
    }

    @Override
    public String cancelAccount(String accountNumber) {
        return null;
    }

    @Override
    public List<AccountDto> getAccount() {
        return null;
    }
}
