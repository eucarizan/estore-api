package dev.nj.api.service;

import dev.nj.api.entity.ShipmentEntity;
import jakarta.validation.constraints.Min;

public interface ShipmentService {
  Iterable<ShipmentEntity> getShipmentByOrderId(@Min(value = 1L, message = "Invalid product ID.")  String id);
}
