package mingu.spring.axon2.event;

import mingu.spring.axon2.aggregate.Status;

public class AccountActivatedEvent extends BaseEvent<String> {
    public final Status status;

    public AccountActivatedEvent(String id, Status status) {
        super(id);
        this.status = status;
    }
}
