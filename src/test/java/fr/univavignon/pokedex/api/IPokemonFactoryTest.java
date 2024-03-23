package fr.univavignon.pokedex.api;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IPokemonFactoryTest {

    @Test
    public void testCreatePokemon() {
//        IPokemonFactory pokemonFactory = Mockito.mock(IPokemonFactory.class);
//
//        int index = 0;
//        int cp = 613;
//        int hp = 64;
//        int dust = 4000;
//        int candy = 4;
//
//        when(pokemonFactory.createPokemon(index, cp, hp, dust, candy)).thenReturn(new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 56));
//        Pokemon pokemon = pokemonFactory.createPokemon(index, cp, hp, dust, candy);
//
//        Assert.assertNotNull(pokemon);
//        Assert.assertEquals(index, pokemon.getIndex());
//        Assert.assertEquals(cp, pokemon.getCp());
//        Assert.assertEquals(hp, pokemon.getHp());
//        Assert.assertEquals(dust, pokemon.getDust());
//        Assert.assertEquals(candy, pokemon.getCandy());

        IPokemonFactory iPokemonFactory = Mockito.mock(IPokemonFactory.class);

        Assert.assertNull(iPokemonFactory.createPokemon(133,2729,202,5000,4));
    }
}
