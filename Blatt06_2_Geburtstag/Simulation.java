/**
 * In dieser Klasse wird das Geburtstagsparadoxon anhand der
 * Messergebnisse simulierter Parties �berpr�ft.
 * 
 * @author Fredrik Winkler, Axel Schmolitzky
 * @version 2022
 */
class Simulation
{
    /**
     * Simuliere das Geburtstagsparadoxon.
     * 
     * @param gaeste
     *            die Anzahl der G�ste auf einer Party
     * @param parties
     *            die Anzahl der Parties.
     *            Je h�her dieser Wert, desto genauer das Messergebnis!
     * 
     * @return die Wahrscheinlichkeit einer Kollision in Prozent
     */
    public int simuliere(int gaeste, int parties)
    {
        Tag startTag = new Tag(0);
        int ueberschneidungen = 0;
        for (int p = 0; p < parties; ++p)
        {
            Party party = new PartyMenge();
            for (int g = 0; g < gaeste; ++g)
            {
                party.fuegeGeburtstagHinzu(startTag.gibZufaelligenTag());
            }
            if (party.mindestensEinGeburtstagMehrfach())
            {
                ++ueberschneidungen;
            }
        }
        return 100 * ueberschneidungen / parties;
    }

    /**
     * Simuliere das Geburtstagsparadoxon mit 10000 Parties.
     * 
     * @param gaeste
     *            die Anzahl der G�ste auf einer Party
     * 
     * @return die Wahrscheinlichkeit einer Kollision in Prozent
     */
    public int simuliere(int gaeste)
    {

        return simuliere(gaeste, 1000);

    }

    public void help()
    {
        int a=0;int b=0; int c=0;
        for(int x=0;x<101;x++)
        {
            int prob=simuliere(x,1000);  
           System.out.println("probabilty at "+x+ "is " + prob);            
        }
  
    }
    
        /**
         * Testet die Implementation von PartyMenge.
         * @return true, falls der Test erfolgreich war
         */
        
        public boolean test()
        {
            return Math.abs(simuliere(23) - 50) < 5;
        }
    }
