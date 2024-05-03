package dev.nj.api.repository;

import dev.nj.api.entity.CardEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<CardEntity, UUID> {
}

