package dev.nj.api.repository;

import dev.nj.api.entity.CartEntity;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CartRepository extends CrudRepository<CartEntity, UUID> {
  @Query("select c from CartEntity c join c.user u where u.id = :customerId")
  Optional<CartEntity> findByCustomerId(@Param("customerId") UUID customerId);
}
