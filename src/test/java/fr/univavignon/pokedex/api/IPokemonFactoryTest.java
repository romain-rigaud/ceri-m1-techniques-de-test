package fr.univavignon.pokedex.api;

import org.junit.Assert;
import org.junit.Test;

public class IPokemonFactoryTest {

    @Test
    public void testCreatePokemon() {
        IPokemonFactory pokemonFactory = new PokemonFactory();

        int index = 1;
        int cp = 1000;
        int hp = 150;
        int dust = 500;
        int candy = 10;

        Pokemon pokemon = pokemonFactory.createPokemon(index, cp, hp, dust, candy);

        Assert.assertNotNull(pokemon);
        Assert.assertEquals(index, pokemon.getIndex());
        Assert.assertEquals(cp, pokemon.getCp());
        Assert.assertEquals(hp, pokemon.getHp());
        Assert.assertEquals(dust, pokemon.getDust());
        Assert.assertEquals(candy, pokemon.getCandy());
    }
}
