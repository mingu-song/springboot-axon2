package mingu.spring.axon2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class AccountQueryEntity {

    @Id
    private String id;

    private double accountBalance;

    private String currency;

    private String status;
}
