import java.util.List;
import java.util.LinkedList;

/**
 * Eine Zusammenstellung von Menschen, die die Informatik geprägt haben.
 * 
 * @author Fredrik Winkler, Axel Schmolitzky
 * @version 2022
 */
class SpannendeMenschenDerInformatik 
{
    private final List<Person> _urspruenglicheReihenfolge;
    private List<Person> _menschenDerInformatik;
    
    public SpannendeMenschenDerInformatik()
    {
        _urspruenglicheReihenfolge = new LinkedList<Person>();
        List<Person> list = _urspruenglicheReihenfolge;  // kürzerer Name...
        list.add(new Person("Ada", "Lovelace", 1815, Geschlecht.WEIBLICH));
        list.add(new Person("Charles", "Babbage", 1791, Geschlecht.DIVERS));
        list.add(new Person("Grace", "Hopper", 1906, Geschlecht.WEIBLICH));
        list.add(new Person("Konrad", "Zuse", 1910, Geschlecht.DIVERS));

        list.add(new Person("Alan", "Kay", 1940, Geschlecht.DIVERS));
        list.add(new Person("Alonzo", "Church", 1903, Geschlecht.DIVERS));
        list.add(new Person("Brian", "Kernighan", 1942, Geschlecht.DIVERS));
        list.add(new Person("Barbara", "Liskov", 1939, Geschlecht.WEIBLICH));
        list.add(new Person("John", "Baccus", 1924, Geschlecht.DIVERS));
        list.add(new Person("Kristen", "Nygaard", 1926, Geschlecht.DIVERS));
        list.add(new Person("Niklaus", "Wirth", 1934, Geschlecht.DIVERS));
        list.add(new Person("Ole-Johan", "Dahl", 1931, Geschlecht.MAENNLICH));

        list.add(new Person("Adele", "Goldberg", 1985, Geschlecht.WEIBLICH));
        list.add(new Person("Linus", "Torvalds", 1969, Geschlecht.MAENNLICH));
        list.add(new Person("Jade", "Raymond", 1975, Geschlecht.WEIBLICH));

        list.add(new Person("Alan", "Turing", 1912, Geschlecht.MAENNLICH));
        list.add(new Person("Claude", "Shannon", 1916, Geschlecht.MAENNLICH));
        list.add(new Person("George", "Boole", 1815, Geschlecht.MAENNLICH));
        list.add(new Person("Harry", "Nyquist", 1889, Geschlecht.MAENNLICH));
        list.add(new Person("John", "Neumann von", 1903, Geschlecht.MAENNLICH));
        list.add(new Person("Kurt", "Goedel", 1906, Geschlecht.MAENNLICH));

        list.add(new Person("Christiane", "Floyd", 1943, Geschlecht.WEIBLICH));
        list.add(new Person("Donald", "Knuth", 1938, Geschlecht.MAENNLICH));
        list.add(new Person("Edsger", "Dijkstra", 1930, Geschlecht.MAENNLICH));
        list.add(new Person("Radia", "Perlman", 1951, Geschlecht.WEIBLICH));
        list.add(new Person("Tony", "Hoare", 1934, Geschlecht.MAENNLICH));
       
    }

    
    /**
     * Schreibt die Menschen auf die Konsole, geordnet nach einem Kriterium.
     */
    public void schreibeGeordnet(Comparator comparer)
    {
        _menschenDerInformatik = new LinkedList<Person>(_urspruenglicheReihenfolge);
        insertionsort(comparer);
        System.out.println("========== " + comparer.getClass().toString().substring(6) + " ==========");
        for (Person p : _menschenDerInformatik)
        {
            System.out.println(p);
        }
        System.out.println();
    }

    /**
     * Insertionsort ist ein einfacher, aber nicht besonders effizienter Sortieralgorithmus.
     * Bitte verwendet in der Praxis Collections.sort, statt eigene Sortierroutinen zu schreiben!
     * Aber vielleicht interessiert ja den einen oder anderen Studierenden,
     * wie man ein Sortierverfahren von Hand programmieren könnte :)
     */
    private void insertionsort(Comparator comparer)
    {
        for (int i = 1; i < _menschenDerInformatik.size(); ++i)
        {
            // Vorbedingung: Die Liste ist von 0 bis i-1 sortiert
            insert(i, comparer);
            // Nachbedingung: Die Liste ist von 0 bis i sortiert
        }
    }

    private void insert(int j, Comparator comparer)
    {
        Person einzufuegen = _menschenDerInformatik.get(j);
        while ((j > 0) && comparer.compare(einzufuegen, _menschenDerInformatik.get(j - 1)) < 0)
        {
            _menschenDerInformatik.set(j, _menschenDerInformatik.get(j - 1));
            --j;
        }
        _menschenDerInformatik.set(j,einzufuegen);
    }
}
