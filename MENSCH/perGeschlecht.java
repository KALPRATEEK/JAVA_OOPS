/**
 * Vergleicht zwei Personen anhand ihres Nachnamens.
 */
class perGeschlecht implements  Comparator
{
    
    public int compare(Person a, Person b)
    {
        return a.gibGeschlecht().compareTo(b.gibGeschlecht());
    }
}
