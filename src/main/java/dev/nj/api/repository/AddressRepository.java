package dev.nj.api.repository;

import dev.nj.api.entity.AddressEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<AddressEntity, UUID> {
}

