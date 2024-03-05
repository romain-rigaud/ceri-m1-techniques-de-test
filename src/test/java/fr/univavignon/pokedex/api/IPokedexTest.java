package fr.univavignon.pokedex.api;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
        when(pokedex.size()).thenReturn(0);
        assertEquals(0, pokedex.size());
        pokedex.addPokemon(pokemon);
        when(pokedex.size()).thenReturn(1);
        assertEquals(1, pokedex.size());
    }

    @Test
    public void testGetPokemon() throws PokedexException {
        when(pokedex.addPokemon(pokemon)).thenReturn(1);
        int index = pokedex.addPokemon(pokemon);
        when(pokedex.getPokemon(index)).thenReturn(pokemon);
        Pokemon retrievedPokemon = pokedex.getPokemon(index);
        assertEquals(pokemon.getIndex(), retrievedPokemon.getIndex());
    }

    @Test
    public void testAddPokemon() throws PokedexException {
        int index = pokedex.addPokemon(pokemon);
        when(pokedex.addPokemon(pokemon)).thenReturn(0);
        assertEquals(index, 0);
    }

    @Test
    public void testGetPokemons() {
        Pokemon bulbizarre = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 0.56);
        Pokemon aquali = new Pokemon(133, "Aquali", 186, 168, 260, 2729, 202, 5000, 4, 1.0);
        pokedex.addPokemon(bulbizarre);
        pokedex.addPokemon(aquali);

        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(bulbizarre);
        pokemons.add(aquali);
        when(pokedex.getPokemons()).thenReturn(pokemons);
        List<Pokemon> pokemonsRetrieved = pokedex.getPokemons();

        Assert.assertEquals(pokemons.size(), pokemonsRetrieved.size());
        Assert.assertTrue(pokemons.contains(bulbizarre));
        Assert.assertTrue(pokemons.contains(aquali));
    }
}