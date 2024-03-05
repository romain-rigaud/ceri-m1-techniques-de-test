package fr.univavignon.pokedex.api;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class IPokemonTrainerFactoryTest {

    @Test
    public void testCreateTrainer() {
        String name = "Ash";
        Team team = Team.MYSTIC;
        IPokedexFactory mockPokedex = Mockito.mock(IPokedexFactory.class);
        IPokemonTrainerFactory trainerFactory = Mockito.mock(IPokemonTrainerFactory.class);
        PokemonTrainer trainer = trainerFactory.createTrainer(name, team, mockPokedex);

        Assert.assertNotNull(trainer);
        Assert.assertEquals(name, trainer.getName());
        Assert.assertEquals(team, trainer.getTeam());
    }
}
