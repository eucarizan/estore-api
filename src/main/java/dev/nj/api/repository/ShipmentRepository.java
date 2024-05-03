package dev.nj.api.repository;

import dev.nj.api.entity.ShipmentEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

public interface ShipmentRepository extends CrudRepository<ShipmentEntity, UUID> {
}

