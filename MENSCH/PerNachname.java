/**
 * Vergleicht zwei Personen anhand ihres Nachnamens.
 */
class PerNachname implements  Comparator
{
    /**
     * @see Vergleicher.vergleiche
     */
    public int compare(Person a, Person b)
    {
        return a.gibNachname().compareTo(b.gibNachname());
    }
}
