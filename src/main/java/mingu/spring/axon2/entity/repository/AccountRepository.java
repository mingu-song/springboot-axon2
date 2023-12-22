package mingu.spring.axon2.entity.repository;

import mingu.spring.axon2.entity.AccountQueryEntity;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<AccountQueryEntity, String> {
}
