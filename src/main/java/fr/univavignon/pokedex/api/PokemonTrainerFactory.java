package fr.univavignon.pokedex.api;

public class PokemonTrainerFactory implements  IPokemonTrainerFactory{

    public PokemonTrainerFactory(){}
    @Override
    public PokemonTrainer createTrainer(String name, Team team, PokedexFactory pokedexFactory) {
        Pokedex pokedex = pokedexFactory.createPokedex(new PokemonMetadataProvider(),new PokemonFactory());
        return new PokemonTrainer(name, team, pokedex);
    }
}
