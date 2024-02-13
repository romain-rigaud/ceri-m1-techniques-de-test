package fr.univavignon.pokedex.api;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class IPokedexFactoryTest {

    @Test
    public void testCreatePokedex() {
        IPokemonMetadataProvider metadataProvider = Mockito.mock(IPokemonMetadataProvider.class);
        IPokemonFactory pokemonFactory = Mockito.mock(IPokemonFactory.class);

        IPokedexFactory pokedexFactory = new PokedexFactory();

        IPokedex pokedex = pokedexFactory.createPokedex(metadataProvider, pokemonFactory);

        Assert.assertNotNull(pokedex);
    }
}
