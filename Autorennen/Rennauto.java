/**
 * Beschreibe hier die Klasse Rennauto.
 * 
 * @author ( Prateek) 
 * @version (08.11.2022)
 */ 

class Rennauto
{
    private String _name;
    private String _fahrzeugtyp;
    private int _maximalgeschwindigkeit;
    private double _gefahreneStrecke;

    public Rennauto (String name, String fahrzeugtyp,
    int maximalgeschwindigkeit, int gefahreneStrecke)
    {
        _name = name;
        _fahrzeugtyp = fahrzeugtyp;
        _maximalgeschwindigkeit = maximalgeschwindigkeit;
        _gefahreneStrecke = gefahreneStrecke;   
    }
    
    public Rennauto (String name)
    {
        _name = name;
        _fahrzeugtyp = "Mercedes";
        _maximalgeschwindigkeit = 100;
        _gefahreneStrecke = 0;
    }

    /**
     * @param Die gefahrene Geschwindigkeit
     */
    // Math.random

    public void fahre ()
    {
        // 1 Fahrt = 10sek      
        int zeitabschnittInSekunden = 10;   
        // in Minuten weil wir geschwindigkeit in km/h wollen
        double zeitabschnittInMinuten = zeitabschnittInSekunden / 60d;
        // zufallsgeschwindigkeit
        double zufallsZahl = Math.random();
        int geschwindigkeit = (int) (zufallsZahl * _maximalgeschwindigkeit);
        // gefahrene Strecke = Geschwindigkeit * Zeit in Stunden
        double gefahreneStreckeInIntervall = geschwindigkeit *  (zeitabschnittInMinuten / 60);
        // Gesamt gefahrene Strecke
        _gefahreneStrecke = _gefahreneStrecke + gefahreneStreckeInIntervall;
        
        System.out.println ( gibInformationen() + _gefahreneStrecke + 
        " km gefahren " + geschwindigkeit + " in km/h ");
    }
    public String gibInformationen() 
    {
        return "Name: "+ _name;
    }
    public double gibGefahreneStrecke ()
    {
        return _gefahreneStrecke;
    }
    
}
