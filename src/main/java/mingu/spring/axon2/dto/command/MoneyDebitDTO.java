package mingu.spring.axon2.dto.command;

public record MoneyDebitDTO(
        double debitAmount,
        String currency
) {
}
