/**
 * Vergleicht zwei Personen anhand ihres Vornamens.
 */
class PerVorname implements  Comparator
{
    /**
     * @see Vergleicher.vergleiche
     */
    public int compare(Person a, Person b)
    {
        return a.gibVorname().compareTo(b.gibVorname());
    }
}