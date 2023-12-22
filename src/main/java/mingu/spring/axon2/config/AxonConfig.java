package mingu.spring.axon2.config;

import mingu.spring.axon2.aggregate.AccountAggregate;
import org.axonframework.eventsourcing.EventSourcingRepository;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AxonConfig {

    @Bean
    EventSourcingRepository<AccountAggregate> accountAggregateEventSourcingRepository(EventStore eventStore) {
        return EventSourcingRepository.builder(AccountAggregate.class).eventStore(eventStore).build();
    }
}
