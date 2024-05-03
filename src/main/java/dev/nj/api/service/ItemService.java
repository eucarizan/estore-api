package dev.nj.api.service;

import dev.nj.api.entity.ItemEntity;
import dev.nj.api.model.Item;
import java.util.List;

public interface ItemService {

  ItemEntity toEntity(Item m);

  List<ItemEntity> toEntityList(List<Item> items);

  Item toModel(ItemEntity e);

  List<Item> toModelList(List<ItemEntity> items);
}
