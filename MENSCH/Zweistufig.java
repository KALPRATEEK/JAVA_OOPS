import static java.util.Objects.requireNonNull;

/**
 * Vergleicht zwei Personen anhand eines primären Comparators.
 * Wenn die beiden Personen laut diesem primären Comparator gleich sind,
 * dann werden die Personen anhand eines sekundären Comparators verglichen.
 * 
 * @author Fredrik Winkler
 * @version 2022
 */
class Zweistufig implements  Comparator
{
    private final Comparator _primaer;
    private final Comparator _sekundaer;
    private final Comparator _dritte;
    /**
     * @param primaer der primäre Comparator; darf nicht null sein
     * @param sekundaer der sekundäre Comparator; darf nicht null sein
     */
    public Zweistufig(Comparator primaer, Comparator sekundaer,Comparator dritte)
    {
        _primaer = requireNonNull(primaer);
        _sekundaer = requireNonNull(sekundaer);
        _dritte=requireNonNull(dritte);
    }

    /**
     * @see Comparator.compare
     */
    public int compare(Person a, Person b)
    {
        int ergebnis = _primaer.compare(a, b);
        if (ergebnis == 0)
        {
            ergebnis = _sekundaer.compare(a, b);
        }
        else if(ergebnis==0)
        {
        ergebnis = _dritte.compare(a, b);
        }
        return ergebnis;
    }
}
