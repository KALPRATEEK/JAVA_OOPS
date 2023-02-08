
/**
 * Write a description of interface Spielfeld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Spielfeld
{
   public int gibBesitzer(int zeile, int spalte);
    public void besetzePosition(int zeile, int spalte, int spieler);
     public boolean istVoll();
    
}
