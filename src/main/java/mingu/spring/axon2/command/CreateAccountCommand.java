package mingu.spring.axon2.command;

public class CreateAccountCommand extends BaseCommand<String> {
    public final double accountBalance;
    public final String currency;

    public CreateAccountCommand(String id, double accountBalance, String currency) {
        super(id);
        this.accountBalance = accountBalance;
        this.currency = currency;
    }
}