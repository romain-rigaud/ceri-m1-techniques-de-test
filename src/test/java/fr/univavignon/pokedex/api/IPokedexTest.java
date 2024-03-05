package fr.univavignon.pokedex.api;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class IPokedexTest {

    IPokedex pokedex;
    Pokemon pokemon;

    @Before
    public void setUp() {
        this.pokedex = mock(IPokedex.class);
        this.pokemon = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 56);
    }

    @Test
    public void testSize() {
        assertEquals(0, pokedex.size());
        pokedex.addPokemon(pokemon);
        assertEquals(1, pokedex.size());
    }

    @Test
    public void testGetPokemon() throws PokedexException {
        int index = pokedex.addPokemon(pokemon);
        Pokemon retrievedPokemon = pokedex.getPokemon(index);
        assertEquals(0, retrievedPokemon.getIndex());
    }

    @Test
    public void testAddPokemon() throws PokedexException {
        int index = pokedex.addPokemon(pokemon);
        assertNotNull(index);
    }

    @Test
    public void testGetPokemons() {
        Pokemon bulbizarre = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 0.56);
        Pokemon aquali = new Pokemon(133, "Aquali", 186, 168, 260, 2729, 202, 5000, 4, 1.0);
        pokedex.addPokemon(bulbizarre);
        pokedex.addPokemon(aquali);

        List<Pokemon> pokemons = pokedex.getPokemons();

        Assert.assertEquals(2, pokemons.size());
        Assert.assertTrue(pokemons.contains(bulbizarre));
        Assert.assertTrue(pokemons.contains(aquali));
    }
}