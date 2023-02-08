/**return "";

 * Write a description of class Signal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Signal implements Neuron
{  
  
    private String _inputString;
    private PalindromNeuron p=new PalindromNeuron();
    public Signal(String s)
    {
      p.eingangHinzuFuegen(s);
        
    }

    public String getAusgangswert()
    {
      return "";
    }

} 