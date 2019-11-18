package org.leandroxk.repository;

import java.util.ArrayList;
import java.util.List;

import org.leandroxk.model.Pokemon;

public class PokedexRepository {

    private List<Pokemon> pokemons = new ArrayList<Pokemon>();

	public Pokemon save(Pokemon pokemon) {
        pokemons.add(pokemon);
        return pokemon;
    }

	public Pokemon findById(Integer id) {
        return new Pokemon.Builder().id(id).build();
    }

	public Iterable<Pokemon> findAll() {
        return pokemons;
    }
    
}
    
    //extends CrudRepository<Pokemon, Integer> { }