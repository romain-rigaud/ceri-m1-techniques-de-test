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

public class IPokedexTest{

    IPokedex pokedex;
    Pokemon pokemon;

    @Before
    public void setUp() {
        //this.pokedex = mock(IPokedex.class);

        List<Pokemon> pokemons = new ArrayList<>();
        this.pokedex = new Pokedex(pokemons);
        this.pokemon = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 56);
    }

    @Test
    public void testSize() {
//        when(pokedex.size()).thenReturn(0);
//        assertEquals(0, pokedex.size());
//        pokedex.addPokemon(pokemon);
//        when(pokedex.size()).thenReturn(1);
//        assertEquals(1, pokedex.size());
        assertEquals(0, pokedex.size());
        pokedex.addPokemon(pokemon);
        assertEquals(1, pokedex.size());
    }

    @Test
    public void testGetPokemon() throws PokedexException {
//        when(pokedex.addPokemon(pokemon)).thenReturn(1);
//        int index = pokedex.addPokemon(pokemon);
//        when(pokedex.getPokemon(index)).thenReturn(pokemon);
//        Pokemon retrievedPokemon = pokedex.getPokemon(index);
//        assertEquals(pokemon.getIndex(), retrievedPokemon.getIndex());

        int index = pokedex.addPokemon(pokemon);
        Pokemon retrievedPokemon = pokedex.getPokemon(index);
        assertEquals(pokemon.getIndex(), retrievedPokemon.getIndex());
    }

    @Test
    public void testAddPokemon() throws PokedexException {
//        int index = pokedex.addPokemon(pokemon);
//        when(pokedex.addPokemon(pokemon)).thenReturn(0);
//        assertEquals(index, 0);

        int index = pokedex.addPokemon(pokemon);
        assertEquals(index, 0);
    }

    @Test
    public void testGetPokemons() {
//        Pokemon bulbizarre = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 0.56);
//        Pokemon aquali = new Pokemon(133, "Aquali", 186, 168, 260, 2729, 202, 5000, 4, 1.0);
//        pokedex.addPokemon(bulbizarre);
//        pokedex.addPokemon(aquali);
//
//        List<Pokemon> pokemons = new ArrayList<>();
//        pokemons.add(bulbizarre);
//        pokemons.add(aquali);
//        when(pokedex.getPokemons()).thenReturn(pokemons);
//        List<Pokemon> pokemonsRetrieved = pokedex.getPokemons();
//
//        Assert.assertEquals(pokemons.size(), pokemonsRetrieved.size());
//        Assert.assertTrue(pokemons.contains(bulbizarre));
//        Assert.assertTrue(pokemons.contains(aquali));

        Pokemon bulbizarre = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 0.56);
        Pokemon aquali = new Pokemon(133, "Aquali", 186, 168, 260, 2729, 202, 5000, 4, 1.0);
        pokedex.addPokemon(bulbizarre);
        pokedex.addPokemon(aquali);

        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(bulbizarre);
        pokemons.add(aquali);
        List<Pokemon> pokemonsRetrieved = pokedex.getPokemons();

        Assert.assertEquals(pokemons.size(), pokemonsRetrieved.size());
        Assert.assertTrue(pokemons.contains(bulbizarre));
        Assert.assertTrue(pokemons.contains(aquali));
    }

    @Test
    public void testGetPokemonMetadata() throws PokedexException {
        IPokemonMetadataProvider metadataProvider = Mockito.mock(IPokemonMetadataProvider.class);

        when(metadataProvider.getPokemonMetadata(0)).thenReturn(new PokemonMetadata(0, "Bulbizarre", 126, 126, 90));
        PokemonMetadata pokemonMetadata = metadataProvider.getPokemonMetadata(0);

        Assert.assertNotNull(pokemonMetadata);
        Assert.assertEquals(0, pokemonMetadata.getIndex());
        Assert.assertEquals("Bulbizarre", pokemonMetadata.getName());
        Assert.assertEquals(126, pokemonMetadata.getAttack());
        Assert.assertEquals(126, pokemonMetadata.getDefense());
        Assert.assertEquals(90, pokemonMetadata.getStamina());
    }

    @Test(expected = PokedexException.class)
    public void testGetPokemonMetadataInvalidIndex() throws PokedexException {
//        IPokemonMetadataProvider metadataProvider = Mockito.mock(IPokemonMetadataProvider.class);
//
//        when(metadataProvider.getPokemonMetadata(-1)).thenThrow(new PokedexException("Index invalide"));
//        PokemonMetadata pokemonMetadata = metadataProvider.getPokemonMetadata(-1);

        IPokemonMetadataProvider metadataProvider = Mockito.mock(IPokemonMetadataProvider.class);

        when(metadataProvider.getPokemonMetadata(-1)).thenThrow(new PokedexException("Index invalide"));
        PokemonMetadata pokemonMetadata = metadataProvider.getPokemonMetadata(-1);
    }

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


        int index = 0;
        int cp = 613;
        int hp = 64;
        int dust = 4000;
        int candy = 4;

        Pokemon pokemon = pokedex.createPokemon(index, cp, hp, dust, candy);

        Assert.assertNotNull(pokemon);
        Assert.assertEquals(index, pokemon.getIndex());
        Assert.assertEquals(cp, pokemon.getCp());
        Assert.assertEquals(hp, pokemon.getHp());
        Assert.assertEquals(dust, pokemon.getDust());
        Assert.assertEquals(candy, pokemon.getCandy());



    }
}