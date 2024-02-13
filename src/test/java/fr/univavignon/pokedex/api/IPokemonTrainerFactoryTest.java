package fr.univavignon.pokedex.api;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class IPokemonTrainerFactoryTest {

    @Test
    public void testCreateTrainer() {
        String name = "Ash";
        Team team = Team.MYSTIC;
        IPokedex mockPokedex = Mockito.mock(IPokedex.class);
        PokemonTrainer trainer = trainerFactory.createTrainer(name, team, mockPokedexFactory);

        // Assurez-vous que le Pokémon Trainer a été créé correctement
        Assert.assertNotNull(trainer);
        Assert.assertEquals(name, trainer.getName());
        Assert.assertEquals(team, trainer.getTeam());
        Assert.assertEquals(mockPokedex, trainer.getPokedex());

    }
}
