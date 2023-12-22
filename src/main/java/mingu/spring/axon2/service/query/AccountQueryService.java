package mingu.spring.axon2.service.query;

import mingu.spring.axon2.entity.AccountQueryEntity;

import java.util.List;

public interface AccountQueryService {
    List<Object> listEventsForAccount(String accountNumber);
    AccountQueryEntity getAccount(String accountNumber);
}
