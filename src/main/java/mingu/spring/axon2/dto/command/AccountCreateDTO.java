package mingu.spring.axon2.dto.command;

public record AccountCreateDTO(
        double startingBalance,
        String currency
) {}
