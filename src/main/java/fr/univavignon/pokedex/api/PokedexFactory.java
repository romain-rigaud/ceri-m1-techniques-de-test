package fr.univavignon.pokedex.api;

public class PokedexFactory implements IPokedexFactory {

    @Override
    public Pokedex createPokedex(PokemonMetadataProvider metadataProvider, PokemonFactory pokemonFactory) {
        return new Pokedex(metadataProvider, pokemonFactory);
    }

}