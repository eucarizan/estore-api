package dev.nj.api.controller;

import static org.springframework.http.ResponseEntity.accepted;
import static org.springframework.http.ResponseEntity.notFound;
import static org.springframework.http.ResponseEntity.ok;
import static org.springframework.http.ResponseEntity.status;

import dev.nj.api.CardApi;
import dev.nj.api.hateoas.CardRepresentationModelAssembler;
import dev.nj.api.model.AddCardReq;
import dev.nj.api.model.Card;
import dev.nj.api.service.CardService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController implements CardApi {

  private final CardService service;
  private final CardRepresentationModelAssembler assembler;

  public CardController(CardService service, CardRepresentationModelAssembler assembler) {
    this.service = service;
    this.assembler = assembler;
  }

  @Override
  public ResponseEntity<Void> deleteCardById(String id) {
    service.deleteCardById(id);
    return accepted().build();
  }

  @Override
  public ResponseEntity<List<Card>> getAllCards() {
    return ok(assembler.toListModel(service.getAllCards()));
  }

  @Override
  public ResponseEntity<Card> getCardById(String id) {
    return service.getCardById(id).map(assembler::toModel)
        .map(ResponseEntity::ok).orElse(notFound().build());
  }

  @Override
  public ResponseEntity<Card> registerCard(@Valid AddCardReq addCardReq) {
    return status(HttpStatus.CREATED).body(service.registerCard(addCardReq).map(assembler::toModel).get());
  }
}
