package org.leandroxk.model; 

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PokemonTest {

	@Test
	public void HappyDay() {
		var pokemon = new Pokemon.Builder()
			.id(1000)
			.number(1)
			.name("Bulbasauro")
			.build();

		assertEquals(Integer.valueOf(1000), pokemon.id());
		assertEquals(Integer.valueOf(1), pokemon.number());
		assertEquals("Bulbasauro", pokemon.name());
	}
}