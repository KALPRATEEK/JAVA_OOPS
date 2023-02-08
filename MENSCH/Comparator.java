 
/**
 * Write a description of interface Comparator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 public interface Comparator<person>
{
   /**
     * Vergleicht zwei Personen miteinander und gibt Auskunft darueber, in welcher
     * Beziehung sie zueinander stehen.
     * Wenn die beiden Personen (gemessem am Vergleichskriterium) gleich sind, dann
     * wird 0 geliefert.
     * Wenn a in einer geordneten Liste vor b stehen wuerde, dann wird irgendeine
     * negative Zahl geliefert.
     * Ansonsten wird irgendeine positive Zahl geliefert.
     */
    public int compare(Person a, Person b);
}
