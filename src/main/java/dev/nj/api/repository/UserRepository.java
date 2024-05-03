package dev.nj.api.repository;

import dev.nj.api.entity.UserEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, UUID> {
}

