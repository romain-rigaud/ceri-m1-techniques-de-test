package fr.univavignon.pokedex.api;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class IPokemonTrainerFactoryTest {

    @Test
    public void testCreateTrainer() {
        String name = "Ash";
        Team team = Team.MYSTIC;
        IPokedex pokedex = Mockito.mock(IPokedex.class);
        IPokedexFactory pokedexFactory = Mockito.mock(IPokedexFactory.class);
        IPokemonTrainerFactory trainerFactory = Mockito.mock(IPokemonTrainerFactory.class);

        when(trainerFactory.createTrainer(name, team, pokedexFactory)).thenReturn(new PokemonTrainer(name, team, pokedex));
        PokemonTrainer trainer = trainerFactory.createTrainer(name, team, pokedexFactory);

        Assert.assertNotNull(trainer);
        Assert.assertEquals(name, trainer.getName());
        Assert.assertEquals(team, trainer.getTeam());
    }
}
