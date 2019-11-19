package org.leandroxk.controller;

import org.leandroxk.model.Pokemon;
import org.leandroxk.repository.PokedexRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokedexController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PokedexController.class);

    @Autowired
    private PokedexRepository repository;

    @PostMapping("/pokedex")
    public Pokemon add(@RequestBody Pokemon pokemon) {
        LOGGER.info("New Pokemon: [{}]", pokemon.getName());
        return repository.save(pokemon);
    }

    @GetMapping("/pokedex/{id}")
    public Pokemon findById(@PathVariable("id") Integer id) {
        LOGGER.info("Search Pokemon: [{}]", id);
        return repository.findById(id).get();
    }

    @GetMapping("/pokedex")
    public Iterable<Pokemon> findAll() {
        LOGGER.info("Search All Pokemon...");
        return repository.findAll();
    }

}