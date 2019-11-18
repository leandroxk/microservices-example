package org.leandroxk.repository;

import org.leandroxk.model.Pokemon;
import org.springframework.data.repository.CrudRepository;

public interface PokedexRepository extends CrudRepository<Pokemon, Integer> { }