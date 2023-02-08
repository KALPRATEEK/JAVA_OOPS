
/**
 * Beschreibe hier die Klasse Rennbahn.
 * 
 * @author (Prateek kalra) 
 * @version (eine Versionsnummer oder ein Datum)
 */ 
class Rennbahn
{
    private int _streckenlaenge;
    private Rennauto _autoSpur1;
    private Rennauto _autoSpur2;
    private Rennauto _autoSpur3;
    private Rennauto _autoSpur4;

    public Rennbahn (int streckenlaenge)
    {
        _streckenlaenge = streckenlaenge;
    }

    /**
     * @param Die Autos werden auf die Strecke gesetzt.
     * Jedes Auto soll nur einmal verwendet werden. Es wird nicht geprüft
     */
    public void setzeAufSpur(Rennauto auto)
    {
        if (_autoSpur1 == null)
        {
            _autoSpur1 = auto;
        } else 
        if (_autoSpur2 == null)
        {
            _autoSpur2 = auto;
        } else
        if (_autoSpur3 == null)
        {
            _autoSpur3 = auto;
        } else
        if (_autoSpur4 == null)
        {
            _autoSpur4 = auto;
        }
    }

    /**
     * Die Autos fahren einmal.
     */
    public void simuliereZeitabschnitt()
    {
        if (_autoSpur1 != null) 
        {
            _autoSpur1.fahre();
        }
        if (_autoSpur2 != null) 
        {
            _autoSpur2.fahre();
        }
        if (_autoSpur3 != null) 
        {
            _autoSpur3.fahre();
        }
        if (_autoSpur4 != null) 
        {
            _autoSpur4.fahre();
        }
    }
    
    /**
     * Ermittelt den ersten Sieger
     * Es wird immer der Sieger genommen, der als erstes Auto auf die Rennbahn gesetzt ist.
     * Es ist eine unfaire Ermittlingsmethode
     */
    public Rennauto liefereSieger ()
    {
        if (_autoSpur1 != null) 
        {
            if ( _streckenlaenge <= _autoSpur1.gibGefahreneStrecke())
            {
                return _autoSpur1;
            }
        }
        if (_autoSpur2 != null) 
        {
            if ( _streckenlaenge <= _autoSpur2.gibGefahreneStrecke())
            {
                return _autoSpur2;
            }
        }
        if (_autoSpur3 != null) 
        {
            if ( _streckenlaenge <= _autoSpur3.gibGefahreneStrecke())
            {
                return _autoSpur3;
            }        
        }
        if (_autoSpur4 != null) 
        {
            if ( _streckenlaenge <= _autoSpur4.gibGefahreneStrecke())
            {
                return _autoSpur4;
            }        
        }
        return null;
    }

    private boolean hatMindEinAuto ()
    {
        return _autoSpur1 != null || _autoSpur2 != null ||
        _autoSpur3 != null || _autoSpur4 != null;
    }

    public void rennenDurchfuehren ()
    {   
        while (liefereSieger() == null && hatMindEinAuto())
        {
            simuliereZeitabschnitt();
        }
        if (liefereSieger() != null) {
            System.out.println ("Der Sieger ist" + liefereSieger().gibInformationen());  
        }
    }
     
    public void entferne (Rennauto auto)
    {
        if (_autoSpur1 == auto) 
        {
            _autoSpur1 = null;          
        } 
        else

        if (_autoSpur2 == auto) 
        {
            _autoSpur2 = null;
        }
        else 

        if (_autoSpur3 == auto) 
        {
            _autoSpur3 = null;
        }
        else

        if (_autoSpur4 == auto) 
        {
            _autoSpur4 = null;
        }
    }
}
