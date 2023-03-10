import java.util.Random;
import java.util.Arrays;

/**
 * Diese Klasse implementiert den Zahlensack mittels eines Arrays,
 * in dem sich fuer jede Zahl gemerkt wird, ob sie bereits gezogen wurde.
 * 
 * @author Fredrik Winkler, Christian Sp?h
 * @version 2022
 */
class Naiv implements Zahlensack 
{
    private final String _string;
    private final Random _zufall;
    private final boolean[] _bereitsGezogen;
    private final int _groesse;
    private int _anzahl;
    
    /**
     * @param groesse die Gr??e des Zahlensacks
     */
    /**
     * @param groesse die Groesse des Zahlensacks, muss >= 2 sein.
     * @throws IllegalArgumentException
     */
    public Naiv(int groesse)
    {
        if (groesse < 2)
        {
            throw new IllegalArgumentException();
        }
        _string = "Naiv (" + groesse + ")";
        _zufall = new Random();
        _bereitsGezogen = new boolean[groesse];
        _groesse = groesse;
        _anzahl = 0;
    }

    /**
     * @return die Gr??e des Zahlensacks
     */
    public int gibGroesse()
    {
        return _groesse;
    }
    
    /**
     * @return die Anzahl der Zahlen, die sich momentan im Zahlensack befinden
     */
    public int gibAnzahl()
    {
        return _anzahl;
    }
    
    /**
     * @return true, falls der Zahlensack leer ist
     */
    public boolean istLeer()
    {
        return _anzahl == 0;
    }
    
    /**
     * F?llt den Zahlensack mit gibGroesse() verschiedenen Zufallszahlen
     * im halboffenen Intervall [0, gibGroesse)
     */
    private void fuelleSack()
    {
        Arrays.fill(_bereitsGezogen, false);
        _anzahl = _groesse;
    }
    
    /**
     * Entfernt eine Zahl aus dem Zahlensack und liefert sie zur?ck.
     * Danach ist der Zahlensack um ein Element kleiner.
     * Ausnahme: Falls der Zahlensack vor dem Aufruf leer ist,
     * wird er zuerst gef?llt, und nach dem Aufruf ist gibAnzahl() == gibGroesse()-1.
     * 
     * @return eine zuf?llige Zahl im halboffenen Intervall [0, gibGroesse)
     */
    public int entferneZahl()
    {
        if (istLeer())
        {
            fuelleSack();
        }
        int zahl;
        do
        {
            zahl = _zufall.nextInt(_groesse);
        } while (_bereitsGezogen[zahl]);
        
        _bereitsGezogen[zahl] = true;
        --_anzahl;
        return zahl;
    }
    
    /**
     * Verwirft alle ?brig gebliebenen Zahlen aus dem Zahlensack.
     * istLeer() liefert anschlie?end true zur?ck, und gibAnzahl() liefert 0.
     */
    public void leereSack()
    {
        _anzahl = 0;
    }
    
    /**
     * @return der verwendete Algorithmus sowie die Gr??e des Zahlensacks
     */
    public String toString()
    {
        return _string;
    }
}
