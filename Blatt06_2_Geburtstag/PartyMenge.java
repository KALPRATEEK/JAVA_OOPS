import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Write a description of class PartyMenge here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PartyMenge implements Party
{
    /**
     * Ein weiterer Gast hat seinen Geburtstag verraten :)
     * 
     * @param geburtstag der Geburtstag des Gasts; darf nicht null sein
     * 
     * Tag t=geburtstag;

     * 
     */
    int c=0;
    HashSet<Tag> set = new HashSet<>();
    public void fuegeGeburtstagHinzu(Tag t)
    {
        Tag _t=t;

        if(set.contains(_t))
        {
            c=c+1;

        }
        else{
            set.add(_t);
        }

    }

    /**
     * Gibt an, ob mehrere Gäste am gleichen Tag Geburtstag haben.
     */
    public boolean mindestensEinGeburtstagMehrfach()
    {
        if(c==0)
        {
            return false;
        }
        else{
            return true;
        }
    }

    /**
     * 
    zeigt einfach wie viel leute hat Tag reingetippt. 
     */
    public void display()
    {
        Iterator i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }

}
