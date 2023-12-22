package mingu.spring.axon2.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import mingu.spring.axon2.dto.command.AccountCreateDTO;
import mingu.spring.axon2.dto.command.MoneyCreditDTO;
import mingu.spring.axon2.dto.command.MoneyDebitDTO;
import mingu.spring.axon2.service.command.AccountCommandService;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@Tag(name = "AccountCommandController", description = "Account Command Controller")
@RequiredArgsConstructor
@RestController
@RequestMapping("/bank-accounts")
public class AccountCommandController {

    private final AccountCommandService accountCommandService;

    @Operation(summary = "createAccount", description = "Create Account by AccountCreateDTO")
    @PostMapping
    public CompletableFuture<String> createAccount(@RequestBody AccountCreateDTO accountCreateDTO){
        return accountCommandService.createAccount(accountCreateDTO);
    }

    @PutMapping(value = "/credits/{accountNumber}")
    public CompletableFuture<String> creditMoneyToAccount(@PathVariable(value = "accountNumber") String accountNumber,
                                                          @RequestBody MoneyCreditDTO moneyCreditDTO){
        return accountCommandService.creditMoneyToAccount(accountNumber, moneyCreditDTO);
    }

    @PutMapping(value = "/debits/{accountNumber}")
    public CompletableFuture<String> debitMoneyFromAccount(@PathVariable(value = "accountNumber") String accountNumber,
                                                           @RequestBody MoneyDebitDTO moneyDebitDTO){
        return accountCommandService.debitMoneyFromAccount(accountNumber, moneyDebitDTO);
    }
}
