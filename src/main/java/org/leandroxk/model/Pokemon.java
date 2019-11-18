package org.leandroxk.model; 

public class Pokemon {

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