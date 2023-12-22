package mingu.spring.axon2.dto.command;

public record MoneyCreditDTO(
        double creditAmount,
        String currency
) { }
