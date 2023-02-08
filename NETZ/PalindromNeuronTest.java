
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Die Test-Klasse PalindromNeuronTest.
 *
 * @author  (Dein Name)
 * @version (Versionsnummer oder Datum)
 */
public class PalindromNeuronTest
{
    /**
     * Konstruktor: Initialisierungen fuer jeden Testfall
     */
    public PalindromNeuronTest()
    {
    }

    /**
     * Eine Test-Methode pro Testfall, jeweils markiert mit @Test
     */
    @Test
    public void testKleinGrossschreibungBeachten()
    {

        PalindromNeuron pn = new PalindromNeuron(false);
        Neuron signal;
        signal = new Signal ("axa");
        pn.eingangHinzufuegen(signal);
        signal = new Signal ("Hallo");
        pn.eingangHinzufuegen(signal);
        signal = new Signal ("Regallager");
        pn.eingangHinzufuegen(signal);
        assertEquals("axa", pn.getAusgangswert());
    }

    /**
     * Eine Test-Methode pro Testfall, jeweils markiert mit @Test
     */
    @Test
    public void testKleinGrossschreibungNichtBeachten()
    {

        PalindromNeuron pn = new PalindromNeuron(true);
        Neuron signal;
        signal = new Signal ("axa");
        pn.eingangHinzufuegen(signal);
        signal = new Signal ("Hallo");
        pn.eingangHinzufuegen(signal);
        signal = new Signal ("Regallager");
        pn.eingangHinzufuegen(signal);
        assertEquals("Regallager", pn.getAusgangswert());
    }
}