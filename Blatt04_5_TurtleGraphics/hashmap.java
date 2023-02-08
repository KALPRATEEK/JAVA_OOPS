import java.util.HashMap;

/**
 * Write a description of class hashmap here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class hashmap
{
    HashMap<String,Integer> hash= new HashMap<String,Integer>(); 
    Dompteur d=new Dompteur();

    public void testPass(int x)
    {
        hash.put("abc",6969);
          
        if(hash.get("abc")==x)
        {
            d.zeichneKochKurve(100,5);
        }
        else{
            System.out.println("try again");
        }

    }
}
