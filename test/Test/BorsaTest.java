package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Borsa;

public class BorsaTest {
	Borsa borsa = new Borsa();
	Attrezzo spada;
	Attrezzo martello;
	
	@Before
	public void setUp() {
		spada = new Attrezzo("spada", 9);
		martello = new Attrezzo("martello", 50);
	}
	
	@Test
	public void testGetPeso() {
		borsa.addAttrezzo(spada);
		assertEquals(spada, borsa.getAttrezzo("spada"));

	}

	@Test
	public void testAddAttrezzo_ConPesoMinoreDiDieci() {
		assertTrue(borsa.addAttrezzo(spada));

	}
	
	@Test
	public void testAddAttrezzo_ConPesoMaggioreDiDieci() {
		assertFalse(borsa.addAttrezzo(martello));

	}
	
	

	
}
