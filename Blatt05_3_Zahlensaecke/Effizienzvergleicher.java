/**
 * Diese Klasse vergleicht die Effizienz verschiedener Implementationen 
 * von Zahlensack.
 *
 * Implementiert in der Methode vermesse(Zahlensack) den fehlenden Code!
 *
 * @author Fredrik Winkler, Christian M. Späh
 * @version 2022
 */
class Effizienzvergleicher
{
    /**
     * Vergleicht die Effizienz verschiedener Implementationen von Zahlensack.
     * Alle Zahlensäcke werden mit der gleichen Größe erzeugt.
     * 
     * @param groesse die Größe der Zahlensäcke
     */
     
     
    public void vergleiche(int groesse)
    {
        if (groesse < 1)
        {
            throw new IllegalArgumentException("groesse < 1");
        }
        
        Zahlensack zs = new Naiv(groesse);
        vermesse(zs);
        
        zs = new Permutation(groesse);
        vermesse(zs);
        
        zs = new Auswahl(groesse);
        vermesse(zs);
    }

    /**
     * Misst die Zeit, die für das Entfernen von sehr vielen Zahlen aus dem
     * Zahlensack benötigt wird. Das Ergebnis wird auf der Konsole ausgegeben.
     * 
     * @param sack der zu vermessende Zahlensack
     */
    private void vermesse(Zahlensack sack)
    {
        // Speichere die aktuelle Zeit als Startzeit
        long AktuelleZeit =System.nanoTime();
        
        // Rufe 1 Mio. Mal "entferneZahl" auf
         for(int x=1;x<=1000000;x++)
         {
          sack.entferneZahl();   
         }
        // Speichere die aktuelle Zeit als Stoppzeit
        long StopZeit =System.nanoTime();
        // Bilde die Differenz aus Stoppzeit und Startzeit
        long Zeit=StopZeit-AktuelleZeit;
        // Teile die Differenz durch 1_000_000, um von ns nach ms umzurechnen
       
        System.out.print(sack); // Beschreibung des Zahlensacks ausgeben
        System.out.print(": " ); // gefolgt von einem Doppelpunkt
        // Gib das Ergebnis auf der Konsole aus
          System.out.print("time taken in ms is"+ " "+(Zeit/1000000)+  "\n"); 
    }
}
