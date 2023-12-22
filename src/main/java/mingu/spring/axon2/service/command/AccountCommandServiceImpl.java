package mingu.spring.axon2.service.command;

import lombok.RequiredArgsConstructor;
import mingu.spring.axon2.command.CreateAccountCommand;
import mingu.spring.axon2.command.CreditMoneyCommand;
import mingu.spring.axon2.command.DebitMoneyCommand;
import mingu.spring.axon2.dto.command.AccountCreateDTO;
import mingu.spring.axon2.dto.command.MoneyCreditDTO;
import mingu.spring.axon2.dto.command.MoneyDebitDTO;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@RequiredArgsConstructor
@Service
public class AccountCommandServiceImpl implements AccountCommandService {

    private final CommandGateway commandGateway;

    @Override
    public CompletableFuture<String> createAccount(AccountCreateDTO accountCreateDTO) {
        return commandGateway.send(new CreateAccountCommand(UUID.randomUUID().toString(), accountCreateDTO.startingBalance(), accountCreateDTO.currency()));
    }

    @Override
    public CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditDTO moneyCreditDTO) {
        return commandGateway.send(new CreditMoneyCommand(accountNumber, moneyCreditDTO.creditAmount(), moneyCreditDTO.currency()));
    }

    @Override
    public CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitDTO moneyDebitDTO) {
        return commandGateway.send(new DebitMoneyCommand(accountNumber, moneyDebitDTO.debitAmount(), moneyDebitDTO.currency()));
    }
}
