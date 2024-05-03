package dev.nj.api.service;

import dev.nj.api.entity.AuthorizationEntity;
import dev.nj.api.model.PaymentReq;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Optional;

public interface PaymentService {

  Optional<AuthorizationEntity> authorize(@Valid PaymentReq paymentReq);
  Optional<AuthorizationEntity> getOrdersPaymentAuthorization(@NotNull String orderId);
}
