package fr.univavignon.pokedex.api;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IPokedexFactoryTest {

    @Test
    public void testCreatePokedex() {
//        IPokemonMetadataProvider metadataProvider = Mockito.mock(IPokemonMetadataProvider.class);
//        IPokemonFactory pokemonFactory = Mockito.mock(IPokemonFactory.class);
//        IPokedexFactory pokedexFactory = Mockito.mock(IPokedexFactory.class);
//
//        when(pokedexFactory.createPokedex(metadataProvider, pokemonFactory)).thenReturn(mock(IPokedex.class));
//        IPokedex pokedex = pokedexFactory.createPokedex(metadataProvider, pokemonFactory);
//
//        Assert.assertNotNull(pokedex);

        IPokedexFactory iPokedexFactory = new PokedexFactory();
        Assert.assertNotNull(iPokedexFactory.createPokedex(Mockito.mock(PokemonMetadataProvider.class), Mockito.mock(PokemonFactory.class)));

    }
}
