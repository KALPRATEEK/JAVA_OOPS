import static org.junit.Assert.*;

import org.junit.Test;
/**
 * The test class TagTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TagTest
{
    /**
     * Testet, ob zwei Tag-Exemplare, die denselben Tag repraesentieren,
     * als gleich angesehen werden.
     */
    @Test
    public void testGleichheit()
    {
    Tag tag1=new Tag(1);
    Tag tag2=new Tag(1);
    assertEquals(true,tag1.equals(tag2));
    }
    
    /**
     * Testet, ob zwei Tag-Exemplare, die verschiedene Tage repraesentieren,
     * als ungleich angesehen werden.
     */
    @Test
    public void testUngleichheit()
    {
        Tag tag1=new Tag(1);
        Tag tag2=new Tag(2);
        assertNotEquals(true,tag1.equals(tag2));
    }
    
    @Test(expected =  IllegalArgumentException.class)
    public void ConstrucTest()
    {
    Tag tag1=new Tag(-1);    // werf ein exception wenn Tag weniger als 0 sind
    Tag tag2=new Tag(367);    // werf ein exception wenn Tag mehr als 366 sind.
    }

    @Test
    public void testFuerEquals()
    {
     TagTest tag=new TagTest();
     Tag tag1=new Tag(1);
     assertNotEquals(true,tag.equals(tag1)); // false ,weil die beide sind exemplar von verschieden Klassen ,eine von tagtest eine von tag.
    }
    
    public void hashTest()
    {
    Tag tag=new Tag(1);    
    assertEquals(1,tag.hashCode());
    assertNotEquals(2,tag.hashCode());
    }
    
    public void StringTest()
    {
    Tag tag=new Tag(20);
    assertEquals("21.Januar",tag.toString());
    }
    
    public void zufTest()
    {
    Tag tag=new Tag(20);
    assertNotEquals(367,tag.gibZufaelligenTag());
      assertNotEquals(-5,tag.gibZufaelligenTag());
        assertNotEquals(9.8,tag.gibZufaelligenTag());
    }
    
}