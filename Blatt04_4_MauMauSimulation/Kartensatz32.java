 

import java.util.*;

/**
 * Ein Kartensatz32 besteht aus 32 Spielkarten mit den Rängen
 * SIEBEN bis AS. In einem Kartensatz32 kommt jedes Kartenbild
 * nur genau einmal vor.
 * <br><br>
 * Beispiele für Kartenspiele, die einen Kartensatz32 verwenden,
 * sind MauMau und Skat. 
 * 
 * @author Axel Schmolitzky 
 * @version 2022
 */
class Kartensatz32 implements Iterable<Spielkarte>
{
    private Set<Spielkarte> _karten;
    
    /**
     * Initialisiert einen Kartensatz32 mit 32 neuen Spielkarten.
     */
    public Kartensatz32()
    {
        _karten = new HashSet<Spielkarte>();
        _karten.add(new Spielkarte(Kartenbild.H7));
        _karten.add(new Spielkarte(Kartenbild.H8));
        _karten.add(new Spielkarte(Kartenbild.H9));
        _karten.add(new Spielkarte(Kartenbild.H10));
        _karten.add(new Spielkarte(Kartenbild.HB));
        _karten.add(new Spielkarte(Kartenbild.HD));
        _karten.add(new Spielkarte(Kartenbild.HK));
        _karten.add(new Spielkarte(Kartenbild.HA));

        _karten.add(new Spielkarte(Kartenbild.KA7));
        _karten.add(new Spielkarte(Kartenbild.KA8));
        _karten.add(new Spielkarte(Kartenbild.KA9));
        _karten.add(new Spielkarte(Kartenbild.KA10));
        _karten.add(new Spielkarte(Kartenbild.KAB));
        _karten.add(new Spielkarte(Kartenbild.KAD));
        _karten.add(new Spielkarte(Kartenbild.KAK));
        _karten.add(new Spielkarte(Kartenbild.KAA));

        _karten.add(new Spielkarte(Kartenbild.P7));
        _karten.add(new Spielkarte(Kartenbild.P8));
        _karten.add(new Spielkarte(Kartenbild.P9));
        _karten.add(new Spielkarte(Kartenbild.P10));
        _karten.add(new Spielkarte(Kartenbild.PB));
        _karten.add(new Spielkarte(Kartenbild.PD));
        _karten.add(new Spielkarte(Kartenbild.PK));
        _karten.add(new Spielkarte(Kartenbild.PA));

        _karten.add(new Spielkarte(Kartenbild.KR7)); 
        _karten.add(new Spielkarte(Kartenbild.KR8));
        _karten.add(new Spielkarte(Kartenbild.KR9));
        _karten.add(new Spielkarte(Kartenbild.KR10));
        _karten.add(new Spielkarte(Kartenbild.KRB));
        _karten.add(new Spielkarte(Kartenbild.KRD));
        _karten.add(new Spielkarte(Kartenbild.KRK));
        _karten.add(new Spielkarte(Kartenbild.KRA));
    }
    
    public Iterator<Spielkarte> iterator()
    {
        return _karten.iterator();
    }
    
}
     