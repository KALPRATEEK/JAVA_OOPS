/**
 * SWBild ist eine Klasse, die Graustufenbilder repraesentiert und
 * manipuliert. Die Implementierung erfolgt durch ein einfaches
 * Bildformat: Die Bildpunkte werden in einem zweidimensionalen
 * Array von 'short'-Werten gehalten. Jeder Feldeintrag kann einen
 * Wert zwischen 0 und 255 annehmen. Andere Werte sind unzulaessig.
 * Der Wertebereich [0..255] repraesentiert den Graustufenbereich:
 * 0 fuer Schwarz, 255 fuer Weiss und dazwischenliegende Werte fuer
 * die Grauabstufungen.
 * 
 * <p>Beispielmethode 'dunkler': Ein geladenes Bild kann um
 * ein gegebenes 'delta' abgedunkelt werden.
 * 
 * @author  Axel Schmolitzky
 * @author Petra Becker-Pechau
 * @version 6. Januar 2015
 */
public class SWBild
{
    // die Bilddaten dieses Bildes
    private short[][] _bilddaten;

    // die Breite dieses Bildes
    private int _breite;

    // die Hoehe dieses Bildes
    private int _hoehe;

    // Leinwand zur Anzeige
    private Leinwand _leinwand;
    

    /**
     * Initialisiert ein Bild mit einer Bilddatei. Der Benutzer kann interaktiv mit Hilfe eines
     * Dateidialogs die zu ladende Datei auswaehlen.
     */
    public SWBild()
    {
        _bilddaten = BildEinleser.liesBilddaten();
        if (_bilddaten != null)
        {
            aktualisiereBildgroesse(_bilddaten);
            erzeugeLeinwand();
        }
    }

    /**
     * Initialisiert ein Bild mit einer Bilddatei. Der Dateiname kann als absoluter oder relativer
     * Pfad uebergeben werden.
     * 
     * @param bilddateiName
     *            der Name der Bilddatei
     */
    public SWBild(String bilddateiName)
    {
        _bilddaten = BildEinleser.liesBilddaten(bilddateiName);
        aktualisiereBildgroesse(_bilddaten);
        erzeugeLeinwand();
    }

    /**
     * Dieses Bild um einen Wert abdunkeln. 
     * 
     * @param delta
     *            Wert der Abdunkelung. Es wird mit dem Betrag von delta gerechnet, 
     *            deshalb darf der Parameter sowohl positiv als auch negativ sein.  
     */
    public void dunkler(int delta)
    {
        if (delta < 0)
        {
            delta = -delta;
        }

        for (int y = 0; y < _hoehe; y++)
        {
            for (int x = 0; x < _breite; x++)
            {
                if ((_bilddaten[y][x] - delta) > 0) // Wert darf 0 nicht unterschreiten
                {
                    _bilddaten[y][x] = (short) (_bilddaten[y][x] - delta);
                }
                else
                {
                    _bilddaten[y][x] = 0;
                }
            }
        }

        zeichneBild();
    }

    /**
     * Dieses Bild um einen Wert aufhellen.
     * 
     * @param delta
     *            Wert der Aufhellung. Es wird mit dem Betrag von delta gerechnet, 
     *            deshalb darf der Parameter sowohl positiv als auch negativ sein.  
     */
    public void heller(int delta)
    {
        if (delta < 0)
        {
            delta = -delta;
        }

        for (int y = 0; y < _hoehe; y++)
        {
            for (int x = 0; x < _breite; x++)
            {
                if ((_bilddaten[y][x] + delta) < 255) // Wert darf 0 nicht unterschreiten
                {
                    _bilddaten[y][x] = (short) (_bilddaten[y][x] + delta);
                }
                else
                {
                    _bilddaten[y][x] = 255;
                }
            }
        }

        zeichneBild();
    }
    
    
    
    
    /**
     * Dieses Bild invertieren.
     */
    public void invertieren()
    {
        for (int y = 0; y < _hoehe; y++)
        {
            for (int x = 0; x < _breite; x++)
            {
                _bilddaten[y][x] = (short) (255 - _bilddaten[y][x]);
            }
        }
        
        zeichneBild();
    }
    
    /**
     * Dieses Bild an der X-Achse spiegeln.
     */
    public void xAchseSpiegeln()
    {
        
        short [][] spiegel = new short [_hoehe][_breite];
        for (int y = 0; y < _hoehe; y++)
        {
            spiegel[y] = _bilddaten[_hoehe-y-1];
        }
        _bilddaten = spiegel;
        zeichneBild();
    }
    
    /**
     * Gib den Wert eines einzelnen Bildpunktes zurueck.
     * 
     * @param y die y-Koordinate des Bildpunktes.
     * @param x die x-Koordinate des Bildpunktes.
     * @return den Wert des angegebenen Bildpunktes.
     */
    public short punktSpiegeln(int y, int x)
    {
        return _bilddaten[y][x];
    }

    public void weichzeichnen()
    {
        int y = _hoehe;
        int x = _breite;
        while( y > 0)
        {
            while(x > 0)
            {
                mittelwert(y,x);
            }
        }
        
        zeichneBild();
        
        
    }
    
    
    // ==== private Hilfsmethoden ====

    /**
     * Zeichnet das Bild in _bilddaten neu.
     */
    private void zeichneBild()
    {
        _leinwand.zeichneBild(_bilddaten);
    }

    /**
     * Hoehe und Breite neu berechnen, nachdem die Bilddaten veraendert worden sind.
     */
    private void aktualisiereBildgroesse(short[][] bilddaten)
    {
        _hoehe = bilddaten.length;
        if (_hoehe == 0)
        {
            _breite = 0;
        }
        else
        {
            _breite = bilddaten[0].length;
        }
    }

    /**
     * Erzeuge die Leinwand zur Darstellung und zeige sie an.
     */
    private void erzeugeLeinwand()
    {
        _leinwand = new Leinwand("Bildbetrachter", _breite, _hoehe);
        _leinwand.sichtbarMachen();

        zeichneBild();
    }
    
   private void mittelwert(int y, int x)
    {
        for (y = 0; y < _hoehe - 1; y++)
        {
            for (x = 0; x < _breite - 1; x++)
            {
                int p =  _bilddaten[y][x] + _bilddaten[y+1][x] + _bilddaten[y-1][x] + _bilddaten[y][x+1] + _bilddaten[y][x-1] 
                + _bilddaten[y+1][x+1] + _bilddaten[y-1][x-1] +_bilddaten[y-1][x+1] + _bilddaten[y+1][x-1] ;
                p /= 9;
                
                
            }
        }
        
    }
    
    
}
