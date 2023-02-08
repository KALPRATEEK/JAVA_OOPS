/**
 * Vergleicht zwei Personen anhand ihres Alters.  
 * @author Fredrik Winkler
 * @version 2022
 */
class Umgekehrt implements Comparator
{
    Comparator compare;
    perGeschlecht compare1_;
    PerNachname compare2_;
    PerVorname compare3_;
    PerAlter compare4_;

    /**
     *  Welche Funktion wollen sie umkehren 
     *  @param darf nicht null sein
     */
    public Umgekehrt(Comparator compare_)
    {

        compare=compare_;
        if(compare==null)
        {
            throw new NullPointerException("soll nicht null sein");
        }
        compare1_ =new perGeschlecht();
        compare2_=new PerNachname();
        compare3_=new PerVorname();
        compare4_=new PerAlter();

    
    }
    /**
     * khert um ,die gegebene Funktion. 
     *  @param darf nicht null sein
     */

    public int compare(Person a, Person b)
    {
        // Achtung: Dieser Trick funktioniert nur, wenn die Differenz garantiert in einen int passt.
        if(compare instanceof perGeschlecht)
        {

            return compare1_.compare(a,b)*(-1);
        }    
        else if(compare instanceof  PerNachname)
        {
            return (compare2_.compare(a,b))*(-1);
        }
        else if(compare instanceof  PerVorname)
        {
            return (compare3_.compare( a,b))*(-1);
        }
        else
        {

            return (compare4_.compare(a,b))*(-1);
        }

    }

}