package dev.nj.api.service;

import dev.nj.api.entity.AddressEntity;
import dev.nj.api.entity.CardEntity;
import dev.nj.api.entity.UserEntity;
import java.util.Optional;

public interface UserService {
  void deleteCustomerById(String id);
  Optional<Iterable<AddressEntity>> getAddressesByCustomerId(String id);
  Iterable<UserEntity> getAllCustomers();
  Optional<CardEntity> getCardByCustomerId(String id);
  Optional<UserEntity> getCustomerById(String id);
}
