package fr.univavignon.pokedex.api;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;

public class IPokedexFactoryTest {

    @Test
    public void testCreatePokedex() {
        IPokemonMetadataProvider metadataProvider = Mockito.mock(IPokemonMetadataProvider.class);
        IPokemonFactory pokemonFactory = Mockito.mock(IPokemonFactory.class);
        IPokedexFactory pokedexFactory = Mockito.mock(IPokedexFactory.class);

        IPokedex pokedex = pokedexFactory.createPokedex(metadataProvider, pokemonFactory);

        Assert.assertNotNull(pokedex);
    }
}
