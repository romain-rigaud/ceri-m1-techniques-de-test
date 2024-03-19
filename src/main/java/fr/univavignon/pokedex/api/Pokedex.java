package fr.univavignon.pokedex.api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pokedex implements IPokedex {

    private List<Pokemon> pokemonList;
    private PokemonMetadataProvider metadataProvider;
    private PokemonFactory pokemonFactory;

    public Pokedex() {
        this.pokemonList = new ArrayList<>();
    }

    public Pokedex(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    @Override
    public int size() {
        return pokemonList.size();
    }

    @Override
    public int addPokemon(Pokemon pokemon) {
        pokemonList.add(pokemon);
        return pokemonList.indexOf(pokemon);
    }

    @Override
    public Pokemon getPokemon(int id) throws PokedexException {
        if (id < 0 || id >= pokemonList.size()) {
            throw new PokedexException("Invalid Pokemon index: " + id);
        }
        return pokemonList.get(id);
    }

    @Override
    public List<Pokemon> getPokemons() {
        return pokemonList;
    }

    @Override
    public List<Pokemon> getPokemons(Comparator<Pokemon> order) {
        List<Pokemon> sortedList = new ArrayList<>(pokemonList);
        sortedList.sort(order);
        return sortedList;
    }

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        if (index < 0 || index >= pokemonList.size()) {
            throw new PokedexException("Invalid Pokemon index: " + index);
        }
        Pokemon pokemon = pokemonList.get(index);
        return new PokemonMetadata(pokemon.getIndex(), pokemon.getName(), pokemon.getAttack(), pokemon.getDefense(), pokemon.getStamina());
    }

    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
        try {
            PokemonMetadata pokemonMetadata = getPokemonMetadata(index);
            return new Pokemon(index, pokemonMetadata.getName(), pokemonMetadata.getAttack(), pokemonMetadata.getDefense(), pokemonMetadata.getStamina(), cp, hp, dust, candy, 56);

        } catch (PokedexException e) {
            throw new RuntimeException(e);
        }
    }
}
