
/**
 * Beschreibe hier die Klasse Lotto.
 * 
 * @author (Dein Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */ 
class Lotto
{
    public void sechsAus49()
    {
        Zahlensack zahlensack = new Auswahl(50);  
        int anzahlGezogenerZahlen = 0;
        while(anzahlGezogenerZahlen < 6)
        {
            int gezogeneZahl = zahlensack.entferneZahl();
            if (gezogeneZahl > 0)
            {
                anzahlGezogenerZahlen++;
                System.out.println("Zahl " + gezogeneZahl + " gezogen");
            }
        }
    }
}
