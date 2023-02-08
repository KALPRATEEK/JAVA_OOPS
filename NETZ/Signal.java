/**
 * Beschreibe hier die Klasse Signal.
 * 
 * @author (PRATEEK) 
 * @version (eine Versionsnummer oder ein Datum)
 */ 
class Signal implements Neuron
{
    private String _ausgangswert;

    public Signal(String ausgangswert)
    {
        if(ausgangswert == null)
        {
            throw new IllegalArgumentException("Der Wert darf nicht null sein");
        }
        _ausgangswert = ausgangswert;
    }

    public String getAusgangswert()
    {
        return _ausgangswert;
    }

    public boolean equals(Object other)
    {
        if (!(other instanceof Signal))
        {
            return false;
        }
        Signal otherSignal = (Signal)other;
        return this._ausgangswert.equals(otherSignal._ausgangswert);
    }

    public int hashCode()
    {
        return _ausgangswert.hashCode();
    }
}