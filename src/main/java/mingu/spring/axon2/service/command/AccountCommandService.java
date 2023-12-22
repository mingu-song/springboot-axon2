package mingu.spring.axon2.service.command;

import mingu.spring.axon2.dto.command.AccountCreateDTO;
import mingu.spring.axon2.dto.command.MoneyCreditDTO;
import mingu.spring.axon2.dto.command.MoneyDebitDTO;

import java.util.concurrent.CompletableFuture;

public interface AccountCommandService {
    CompletableFuture<String> createAccount(AccountCreateDTO accountCreateDTO);
    CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditDTO moneyCreditDTO);
    CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitDTO moneyDebitDTO);
}
