package fr.univavignon.pokedex.api;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class IPokemonMetadataProviderTest {

    @Test
    public void testGetPokemonMetadata() throws PokedexException {
//        IPokemonMetadataProvider metadataProvider = Mockito.mock(IPokemonMetadataProvider.class);
//
//        when(metadataProvider.getPokemonMetadata(0)).thenReturn(new PokemonMetadata(0, "Bulbizarre", 126, 126, 90));
//        PokemonMetadata pokemonMetadata = metadataProvider.getPokemonMetadata(0);
//
//        Assert.assertNotNull(pokemonMetadata);
//        Assert.assertEquals(0, pokemonMetadata.getIndex());
//        Assert.assertEquals("Bulbizarre", pokemonMetadata.getName());
//        Assert.assertEquals(126, pokemonMetadata.getAttack());
//        Assert.assertEquals(126, pokemonMetadata.getDefense());
//        Assert.assertEquals(90, pokemonMetadata.getStamina());

        PokemonMetadataProvider PokemonMetadataProvider = new PokemonMetadataProvider();
        Assert.assertNull(PokemonMetadataProvider.getPokemonMetadata(0));

    }

    @Test(expected = PokedexException.class)
    public void testGetPokemonMetadataInvalidIndex() throws PokedexException {
        IPokemonMetadataProvider metadataProvider = Mockito.mock(IPokemonMetadataProvider.class);

        when(metadataProvider.getPokemonMetadata(-1)).thenThrow(new PokedexException("Index invalide"));
        PokemonMetadata pokemonMetadata = metadataProvider.getPokemonMetadata(-1);

    }
}
