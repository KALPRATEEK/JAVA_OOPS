import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Die Test-Klasse KettenNeuronTest.
 *
 * @author  (Dein Name)
 * @version (Versionsnummer oder Datum)
 */
public class KettenNeuronTest
{
    /**
     * Konstruktor: Initialisierungen fuer jeden Testfall
     */
    public KettenNeuronTest()
    {
    }

    /**
     * Eine Test-Methode pro Testfall, jeweils markiert mit @Test
     */
    @Test
    public void testEinfachesKettenNeuron()
    {
        KettenNeuron kn = new KettenNeuron();
        Neuron signal;
        signal = new Signal ("axa");
        kn.eingangHinzufuegen(signal);
        signal = new Signal ("Hallo");
        kn.eingangHinzufuegen(signal);
        signal = new Signal ("Regallager");
        kn.eingangHinzufuegen(signal);
        assertEquals("axa Hallo Regallager ", kn.getAusgangswert());
    }

    /**
     * Eine Test-Methode pro Testfall, jeweils markiert mit @Test
     */
    @Test
    public void testAufgabe()
    {
        PalindromNeuron pnTrue = new PalindromNeuron(true);
        PalindromNeuron pnFalse = new PalindromNeuron(false);
        Neuron signal;
        signal = new Signal ("axa");
        pnTrue.eingangHinzufuegen(signal);
        pnFalse.eingangHinzufuegen(signal);
        signal = new Signal ("Hallo");
        pnTrue.eingangHinzufuegen(signal);
        pnFalse.eingangHinzufuegen(signal);
        signal = new Signal ("Regallager");
        pnTrue.eingangHinzufuegen(signal);
        pnFalse.eingangHinzufuegen(signal);        
        
        KettenNeuron kn = new KettenNeuron();
        kn.eingangHinzufuegen(pnFalse);
        kn.eingangHinzufuegen(pnTrue); 
        
        assertEquals("axa Regallager ", kn.getAusgangswert());
    }
    
    @Test
    public void testPallindromKettenNeuron()
    {
        PalindromNeuron pnTrue = new PalindromNeuron(true);
        PalindromNeuron pnFalse = new PalindromNeuron(false);
        Neuron signal;
        signal = new Signal ("axa");
        pnTrue.eingangHinzufuegen(signal);
        pnFalse.eingangHinzufuegen(signal);
        signal = new Signal ("Hallo");
        pnTrue.eingangHinzufuegen(signal);
        pnFalse.eingangHinzufuegen(signal);
        signal = new Signal ("Regallager");
        pnTrue.eingangHinzufuegen(signal);
        pnFalse.eingangHinzufuegen(signal);        
        
        KettenNeuron kn = new KettenNeuron();
        kn.eingangHinzufuegen(pnTrue);
        kn.eingangHinzufuegen(pnFalse);  
        kn.eingangHinzufuegen(pnFalse);
        kn.eingangHinzufuegen(pnTrue);    
        kn.eingangHinzufuegen(new Signal ("Hallo")); 
        
        assertEquals("Regallager axa axa Regallager Hallo ", kn.getAusgangswert());
    }
}