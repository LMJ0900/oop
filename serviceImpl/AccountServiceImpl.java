package serviceImpl;

import model.Account;
import service.AccountService;

import java.util.ArrayList;
import java.util.List;


public class AccountServiceImpl implements AccountService {
    private static AccountServiceImpl instance = new AccountServiceImpl();

    private AccountServiceImpl() {
        this.accounts = new ArrayList<>();
    }

    public static AccountServiceImpl getInstance() {
        return instance;
    }

    List<Account> accounts = new ArrayList<>();


    @Override
    public String createAccount(Account account) {
        String result ="";
        accounts.add(account);
        return null;
    }

    @Override
    public String deposit(Account account) {
        return null;
    }

    @Override
    public String withdraw(Account account) {
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
    public List<?> getAccount() {
        return null;
    }
}
