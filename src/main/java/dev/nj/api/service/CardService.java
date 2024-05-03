package dev.nj.api.service;

import dev.nj.api.entity.CardEntity;
import dev.nj.api.model.AddCardReq;
import jakarta.validation.Valid;
import java.util.Optional;

public interface CardService {
  void deleteCardById(String id);
  Iterable<CardEntity> getAllCards();
  Optional<CardEntity> getCardById(String id);
  Optional<CardEntity> registerCard(@Valid AddCardReq addCardReq);
}
