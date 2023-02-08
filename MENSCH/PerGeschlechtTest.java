import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Die Test-Klasse PerGeschlechtTest.
 *
 * @author  (Okan)
 * @version (20.12.22)
 */
public class PerGeschlechtTest
{
    /**
     * Konstruktor: Initialisierungen fuer jeden Testfall
     */
    public PerGeschlechtTest()
    {
    }

    /**
     * @param Geschlechterliste soll w,d,m sein
     */
    @Test
    public void geschlechtTest()
    {
        perGeschlecht Comparator = new perGeschlecht();
        Person p1 = new Person("Ada", "Lovelace", 1815, Geschlecht.WEIBLICH);
        Person p11 = new Person("Cccc", "Dddd", 1818, Geschlecht.WEIBLICH);

        Person p2 = new Person("Aaaa", "Bbbb", 1818, Geschlecht.DIVERS);
        Person p22 = new Person("Cccc", "Dddd", 1818, Geschlecht.DIVERS);

        Person p3 = new Person("Charles", "Babbage", 1791, Geschlecht.MAENNLICH);
        Person p33 = new Person("Cccc", "Dddd", 1818, Geschlecht.MAENNLICH);

        int ergebnis1 = Comparator.compare(p1,p11); // Beides Weiblich
        assertEquals(0, ergebnis1);
        int ergebnis2 = Comparator.compare(p1,p2);  // Weiblich mit Divers
        assertEquals(-1, ergebnis2);
        int ergebnis3 = Comparator.compare(p1,p3);  // Weiblich mit Männlich
        assertEquals(-2, ergebnis3);

        int ergebnis4 = Comparator.compare(p2,p1);  // Divers mit Weiblich
        assertEquals(1, ergebnis4);
        int ergebnis5 = Comparator.compare(p2,p22); // Beides Divers
        assertEquals(0, ergebnis5);
        int ergebnis6 = Comparator.compare(p2,p3);  // Divers mit Männlich
        assertEquals(-1, ergebnis6);

        int ergebnis7 = Comparator.compare(p3,p1);  // Männlich mit Weiblich
        assertEquals(2, ergebnis7);
        int ergebnis8 = Comparator.compare(p3,p2);  // Männlich mit Divers
        assertEquals(1, ergebnis8);
        int ergebnis9 = Comparator.compare(p3,p33); // Beides Männlich
        assertEquals(0, ergebnis9);
    }
}