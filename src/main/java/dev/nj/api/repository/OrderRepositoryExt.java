package dev.nj.api.repository;

import dev.nj.api.entity.OrderEntity;
import dev.nj.api.model.NewOrder;
import java.util.Optional;

public interface OrderRepositoryExt {
  Optional<OrderEntity> insert(NewOrder m);
}

