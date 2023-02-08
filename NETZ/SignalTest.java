
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Die Test-Klasse SignalTest.
 *
 * @author  (Dein Name)
 * @version (Versionsnummer oder Datum)
 */
public class SignalTest
{
    private Signal s;
   @Test(expected = IllegalArgumentException.class)
   public void testcons()
   {
     Signal s=new Signal(null);  
    }
     
     @Test
    public void AusTest()
    {
    Signal s=new Signal("abc");  
    assertEquals(false,s.equals(null));
    }
    
   /**
     * Eine Test-Methode pro Testfall, jeweils markiert mit @Test
     */
    @Test
    public void testMethode()
    {
        Signal s1 = new Signal("test");
        Signal s2 = new Signal("test");
        assertEquals(s1, s2);
        assertNotSame(s1, s2);
    }
}