package dev.nj.api.repository;

import dev.nj.api.entity.ProductEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity, UUID> {
}

