import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Beschreibe hier die Klasse KettenNeuron.
 * 
 * @author (PRATEEK) 
 * @version (eine Versionsnummer oder ein Datum)
 */ 
class KettenNeuron implements Neuron
{
    private List<Neuron> eingaenge ;

    public KettenNeuron()
    {
        eingaenge = new LinkedList();
    }

    public void eingangHinzufuegen(Neuron eingang)
    {
        eingaenge.add(eingang);
    }

    public String getAusgangswert()
    {
        String ausgangswert = "";
        for (Neuron aktuellesNeuron : eingaenge)
        {
            ausgangswert = ausgangswert + aktuellesNeuron.getAusgangswert() + " ";
        }
        return ausgangswert;
    }
}