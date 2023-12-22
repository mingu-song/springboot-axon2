package mingu.spring.axon2.service.query;

import lombok.RequiredArgsConstructor;
import mingu.spring.axon2.entity.AccountQueryEntity;
import mingu.spring.axon2.entity.repository.AccountRepository;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.axonframework.messaging.Message;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class AccountQueryServiceImpl  implements AccountQueryService {
    private final EventStore eventStore;

    private final AccountRepository accountRepository;

    @Override
    public List<Object> listEventsForAccount(String accountNumber) {
        return eventStore.readEvents(accountNumber).asStream().map(Message::getPayload).collect(Collectors.toList());
    }

    @Override
    public AccountQueryEntity getAccount(String accountNumber) {
        return accountRepository.findById(accountNumber).orElseGet(AccountQueryEntity::new);
    }
}
