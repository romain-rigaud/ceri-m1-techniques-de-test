package fr.univavignon.pokedex.api;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class IPokedexTest {

    @Test
    public void testSize() {
        Pokedex pokedex = new Pokedex();

        assertEquals(0, pokedex.size());

        Pokemon mockPokemon = Mockito.mock(Pokemon.class);
        pokedex.addPokemon(mockPokemon);

        assertEquals(1, pokedex.size());
    }

    @Test
    public void testAddPokemon() {
        Pokedex pokedex = new Pokedex();

        Pokemon pokemon = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 0.56);
        int index = pokedex.addPokemon(pokemon);

        Pokemon retrievedPokemon = pokedex.getPokemon(index);
        assertEquals(0, retrievedPokemon.getIndex());
        assertEquals("Bulbizarre", retrievedPokemon.getName());
        assertEquals(126, retrievedPokemon.getAttack());
        assertEquals(126, retrievedPokemon.getDefense());
        assertEquals(126, retrievedPokemon.getDefense());
        assertEquals(613, retrievedPokemon.getStamina());
        assertEquals(64, retrievedPokemon.getHp());
        assertEquals(4000, retrievedPokemon.getDust());
        assertEquals(4, retrievedPokemon.getCandy());

    }

    @Test
    public void testGetPokemons() {
        Pokedex pokedex = new Pokedex();

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