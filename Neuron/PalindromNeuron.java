import java.util.HashSet;
import java.util.Set;

/**
 * Write a description of class PalindromNeuron here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PalindromNeuron implements Neuron
{
    private Neuron n;
  
    Set<String> hash = new HashSet<String>();
    public PalindromNeuron()
    {
    
    }

    public String getAusgangswert()
    {
     return"";   
    }
    
    
        
    public void eingangHinzuFuegen(String s){
    hash.add(s);
    
    }

}
