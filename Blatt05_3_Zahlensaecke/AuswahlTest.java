import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 * The test class AuswahlTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AuswahlTest
{
    /**
     * Default constructor for test class AuswahlTest
     */
    private Zahlensack z;
    public AuswahlTest()
    {
        z=new Auswahl(3);
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Test
    public void lange()
    {
        z=new Auswahl(30);
        assertEquals(30,z.gibGroesse());
        assertNotEquals(50,z.gibGroesse()); 
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @Test
    public void gibAnzahlTest()
    {
        z=new Auswahl(3);
        z.entferneZahl();
        assertEquals(2,z.gibAnzahl());
        z.entferneZahl();
        assertEquals(1,z.gibAnzahl());
        z.entferneZahl();
        assertEquals(0,z.gibAnzahl());

        z=new Auswahl(4);
        z.entferneZahl();
        assertNotEquals(2,z.gibAnzahl());

    }
    @Test
    public void enternfeTest()
    {
        z=new Auswahl(3);
        int c=0;

        if(z.entferneZahl()==0||z.entferneZahl()==1||z.entferneZahl()==2)  
        { 
            assertEquals(1,c+1);  
        }
        else if(z.entferneZahl()==5||z.entferneZahl()==6||z.entferneZahl()==7)
        {
            assertNotEquals(1,c+1);
        }
    }

    @Test 
    public void IstLeer()
    {
        z=new Auswahl(3);
        for(int i=0;i<3;++i)
        {
            z.entferneZahl();

        }
        assertEquals(true,z.istLeer());
       
         z=new Auswahl(10);
    for(int i=0;i<9;++i)
        {
            z.entferneZahl();

        }
        assertNotEquals(true,z.istLeer());   //not equals weil nicht alle numa sind entfernt.
        }
        /**
     * @return der verwendete Algorithmus sowie die Größe des Zahlensacks
     */
    @Test
    public void Stringtest()
    {    
        z=new Auswahl(3);
        assertEquals("Auswahl (3)","Auswahl (" + z.gibGroesse() + ")");
        assertNotEquals("Auswahl (2)","Auswahl (" + z.gibGroesse() + ")");
    }
        
} 