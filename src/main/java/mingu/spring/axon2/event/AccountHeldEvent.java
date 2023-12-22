package mingu.spring.axon2.event;

import mingu.spring.axon2.aggregate.Status;

public class AccountHeldEvent extends BaseEvent<String> {
    public final Status status;

    public AccountHeldEvent(String id, Status status) {
        super(id);
        this.status = status;
    }
}
