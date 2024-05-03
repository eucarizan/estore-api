package dev.nj.api.repository;

import dev.nj.api.entity.TagEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<TagEntity, UUID> {
}
