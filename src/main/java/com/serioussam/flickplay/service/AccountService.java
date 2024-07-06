package com.serioussam.flickplay.service;

import com.serioussam.flickplay.entity.Account;
import com.serioussam.flickplay.repository.AccountRepository;
import com.serioussam.flickplay.util.PasswordUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account saveAccount(String[] accountData)
    {
        Account account = new Account();
        account.setName(accountData[0]);
        account.setPassword(PasswordUtil.hashPassword(accountData[1]));
        account.setUsername(accountData[2]);

        return accountRepository.save(account);
    }
}
