import java.util.ArrayList;
import java.util.List;

/**
 * Beschreibe hier die Klasse PalindromNeuron.
 * 
 * @author (PRATEEK) 
 * @version (eine Versionsnummer oder ein Datum)
 */ 
class PalindromNeuron implements Neuron
{
    private boolean _ignoriereGrossKleinSchreibung;
    private List<Neuron> eingaenge ;
     
    public PalindromNeuron(boolean ignoriereGrossKleinSchreibung)
    {
        _ignoriereGrossKleinSchreibung = ignoriereGrossKleinSchreibung;
        eingaenge = new ArrayList();
    }

    public void eingangHinzufuegen(Neuron eingang)
    {
        eingaenge.add(eingang);

    }

    private boolean istPalindrom (String text)
    {
        int letztePosition = text.length() - 1;
        String textRueckwaerts = "";
        String textEingang = text;
        if (_ignoriereGrossKleinSchreibung)
        {
            textEingang = text.toLowerCase(); 
        }
        for (int i = letztePosition; i > -1; --i)
        {
            char buchstabe = textEingang.charAt(i);
            textRueckwaerts = textRueckwaerts + String.valueOf(buchstabe);
        }
        return textEingang.equals(textRueckwaerts);
    }

    public String getAusgangswert()
    {
        String ausgangswert = null;
        for (Neuron aktuellesNeuron : eingaenge)
        {
            String text = aktuellesNeuron.getAusgangswert();
            boolean istPalindrom = this.istPalindrom(text);
            if (istPalindrom)
            {
                if (ausgangswert == null)
                {
                    ausgangswert = text; 
                }
                else
                {
                    if (text.length() > ausgangswert.length())                    
                    {
                        ausgangswert = text;
                    }
                }
            }
        }
        return ausgangswert;
    }
}