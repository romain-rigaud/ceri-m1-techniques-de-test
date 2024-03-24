package fr.univavignon.pokedex.api;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class IPokemonTrainerFactoryTest {

    @Test
    public void testCreateTrainer() {
//        String name = "Ash";
//        Team team = Team.MYSTIC;
//        Pokedex pokedex = Mockito.mock(Pokedex.class);
//        PokedexFactory pokedexFactory = Mockito.mock(PokedexFactory.class);
//        PokemonTrainerFactory trainerFactory = Mockito.mock(PokemonTrainerFactory.class);
//
//        when(trainerFactory.createTrainer(name, team, pokedexFactory)).thenReturn(new PokemonTrainer(name, team, pokedex));
//        PokemonTrainer trainer = trainerFactory.createTrainer(name, team, pokedexFactory);
//
//        Assert.assertNotNull(trainer);
//        Assert.assertEquals(name, trainer.getName());
//        Assert.assertEquals(team, trainer.getTeam());

        PokemonTrainerFactory PokemonTrainerFactory = new PokemonTrainerFactory();
        PokedexFactory pokedexFactory = Mockito.mock(PokedexFactory.class);
        PokemonTrainer trainer = PokemonTrainerFactory.createTrainer("Ash", Team.MYSTIC, pokedexFactory);
        Assert.assertNotNull(trainer);
    }
}
