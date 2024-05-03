package dev.nj.api.controller;

import dev.nj.api.ShipmentApi;
import dev.nj.api.hateoas.ShipmentRepresentationModelAssembler;
import dev.nj.api.model.Shipment;
import dev.nj.api.service.ShipmentService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShipmentController implements ShipmentApi {

  private final ShipmentService service;
  private final ShipmentRepresentationModelAssembler assembler;

  public ShipmentController(ShipmentService service, ShipmentRepresentationModelAssembler assembler) {
    this.service = service;
    this.assembler = assembler;
  }

  @Override
  public ResponseEntity<List<Shipment>> getShipmentByOrderId(@NotNull @Valid String id) {
    return ResponseEntity.ok(assembler.toListModel(service.getShipmentByOrderId(id)));
  }
}
