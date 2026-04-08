package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaTest {

  @Test
  public void testGetAttrezzo_stanzavuota() {
    Stanza vuota = new Stanza ("VUOTA");
    assertNull(vuota.getAttrezzo("inesistente"));

  }

  @Test
  public void testGetAttrezzo_Stanza_Non_Vuota_Presente() {
    Attrezzo attrezzo = new Attrezzo("attrezzo",0);
    Stanza stanza = new Stanza ("stanza");
    stanza.addAttrezzo(attrezzo);
    assertNotNull(stanza.getAttrezzo("attrezzo"));

  }

  @Test
  public void testGetAttrezzo_Stanza_Non_Vuota_Assente() {
    Attrezzo attrezzo = new Attrezzo("attrezzo",0);
    Stanza stanza = new Stanza ("stanza");
    stanza.addAttrezzo(attrezzo);
    assertNull(stanza.getAttrezzo("nome di attrezzo non presente"));

  }

}