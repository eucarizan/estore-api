package dev.nj.api.service;

import dev.nj.api.entity.AddressEntity;
import dev.nj.api.model.AddAddressReq;
import java.util.Optional;

public interface AddressService {
  Optional<AddressEntity> createAddress(AddAddressReq addAddressReq);

  void deleteAddressesById(String id);

  Optional<AddressEntity> getAddressesById(String id);

  Iterable<AddressEntity> getAllAddresses();
}
