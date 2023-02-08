import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Die Testklasse UhrenanzeigeTest. hier werden Testfälle beschrieben, die
 * die Klasse Uhrenanzeige durchlaufen muss.
 * 
 * Nach dem ersten Laden des Projekts laufen diese Testfaelle nicht fehlerfrei durch,
 * da sich ein Fehler in der zu testenden Klasse Uhrenanzeige befindet. Nachdem
 * ihr diesen Test gestartet habt und die Fehlermeldung nachvollzogen habt,
 * behebt den Fehler und startet die Tests erneut.
 * 
 * @author prateek
 * @version 2022
 */
public class UhrenanzeigeTest
{

    private Uhrenanzeige _uhr;

    /**
     * Konstruktor: Initialisierungen für jeden Testfall
     */
    public UhrenanzeigeTest()
    {
        _uhr = new Uhrenanzeige();
        _uhr.setzeUhrzeit(0, 0);
    }

    /**
     * Testet die Methoden setzeUhrzeit() und gibUhrzeit().
     */
    @Test
    public void testGibSetzeUhrzeit()
    {
        // überprüft, ob der erwartete Initialwert zurückgegeben wird
        assertEquals("00:00", _uhr.gibUhrzeit());

        // überprüft, ob der gesetzte Wert zurückgegeben wird
        _uhr.setzeUhrzeit(23, 59);
        assertEquals("23:59", _uhr.gibUhrzeit());

        // überprüft, ob nicht erlaubte Werte auch nicht gesetzt werden
        _uhr.setzeUhrzeit(24, 60);
        assertEquals("23:59", _uhr.gibUhrzeit());
        _uhr.setzeUhrzeit(-01, -01);
        assertEquals("23:59", _uhr.gibUhrzeit());

        // überprüft, ob einstellige Werte richtig formatiert werden, auch in
        // den Randbereichen
        _uhr.setzeUhrzeit(9, 9);
        assertEquals("09:09", _uhr.gibUhrzeit());
        _uhr.setzeUhrzeit(10, 10);
        assertEquals("10:10", _uhr.gibUhrzeit());
    }

    /**
     * Testet die Methode taktSignalGeben().
     */
    @Test
    public void testTaktSignalGeben()
    {
         // überprüft den Takt in den Übergangsbereichen
        _uhr.setzeUhrzeit(23, 59);
        _uhr.taktSignalGeben();
        assertEquals("00:00", _uhr.gibUhrzeit());
        
        
        
        // überprüft, ob nach dem ersten Takt nach dem Setzen auf die
        // Standardwerte die Uhrzeit stimmt
         _uhr.setzeUhrzeit(00, 00);
        _uhr.taktSignalGeben();
        assertEquals("00:01", _uhr.gibUhrzeit());

       
    }
}