package fr.univavignon.pokedex.api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pokedex implements  IPokedex{

    private List<Pokemon> pokemons = new ArrayList<>();
    @Override
    public int size() {
        return pokemons.size();
    }

    @Override
    public int addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
        return pokemons.indexOf(pokemon);
    }

    @Override
    public Pokemon getPokemon(int id) throws PokedexException {

        return null;
    }

    @Override
    public List<Pokemon> getPokemons() {
        return null;
    }

    @Override
    public List<Pokemon> getPokemons(Comparator<Pokemon> order) {
        return null;
    }

    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
        return null;
    }

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        return null;
    }
}
