/**
 * Die Klasse Uhrenanzeige simuliert digitale Uhren mit Stunden- und
 * Minutenanzeige. Der Minutentakt wird Ÿber einen Methodenaufruf vorgegeben.
 * Nach dem ersten Laden dieses Projekts befindet sich ein Fehler in der Methode
 * taktSignalGeben().
 * 
 * @author prateek
 * @version 2022
 */
class Uhrenanzeige
{
    // Referenz auf eine Nummernanzeige fŸr die Stunden dieser Anzeige
    private Nummernanzeige _stunden;

    // Referenz auf eine Nummernanzeige fŸr die Minuten dieser Anzeige
    private Nummernanzeige _minuten;

    /**
     * Eine neue Uhrenanzeige wird auf 00:00 initialisiert.
     */
    public Uhrenanzeige()
    {
        _stunden = new Nummernanzeige(24);
        _stunden.setzeWert(0);
        _minuten = new Nummernanzeige(60);
        _minuten.setzeWert(0);
    }

    /**
     * Setzt die Uhrzeit auf die Ÿbergebenen Werte.
     * 
     * @param stunden
     *            Der neue Stundenwert
     * @param minuten
     *            Der neue MinutenwertS
     */
    public void setzeUhrzeit(int stunden, int minuten)
    {
        _stunden.setzeWert(stunden);
        _minuten.setzeWert(minuten);
    }

    /**
     * Gibt einen Minutentakt und schaltet die Uhr eine Minute weiter.
     * @TODO Hier steckt noch ein Fehler im Detail.
     */
    public void taktSignalGeben()
    { //12,59  to 12 00 to 13 01
        if (_minuten.gibWert() == 59)
        {
            _stunden.erhoehen();
        }
        _minuten.erhoehen();  
    }

    /**
     * Liefert die aktuelle Uhrzeit im Format "HH:MM".
     * Sowohl Stunden als auch Minuten werden immer zweistellig
     * ausgegeben, gegebenenfalls mit fŸhrender Null.
     * 
     * @return die Uhrzeit dieser Uhrenanzeige
     */
    public String gibUhrzeit()
    {
        return _stunden.gibAnzeigewert() + ":" + _minuten.gibAnzeigewert();
    }
}
