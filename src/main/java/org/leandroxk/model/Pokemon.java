package org.leandroxk.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer number;
    private String name;

    public Integer getId() {
        return id;
    }

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public static class Builder {

        private Pokemon pokemon = new Pokemon();

        public Builder id(Integer id) {
            pokemon.id = id;
            return this;
        }

        public Builder number(Integer number) {
            pokemon.number = number;
            return this;
        }

        public Builder name(String name) {
            pokemon.name = name;
            return this;
        }

        public Pokemon build() {
            return pokemon;
        }
    }
}