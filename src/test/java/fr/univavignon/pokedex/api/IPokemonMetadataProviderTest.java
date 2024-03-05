package fr.univavignon.pokedex.api;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class IPokemonMetadataProviderTest {

    @Test
    public void testGetPokemonMetadata() throws PokedexException {
    }

    @Test(expected = PokedexException.class)
    public void testGetPokemonMetadataInvalidIndex() throws PokedexException {
        IPokemonMetadataProvider metadataProvider = Mockito.mock(IPokemonMetadataProvider.class);
        PokemonMetadata pokemonMetadata = metadataProvider.getPokemonMetadata(1);

        Assert.assertNotNull(pokemonMetadata);

    }
}
