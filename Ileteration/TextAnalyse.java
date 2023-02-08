/**
 * Diese Klasse bietet die Möglichkeit, Texte zu analysieren.
 * Sie dient als Einstieg in Schleifenkonstrukte und zeigt in
 * der Methode istFrage beispielhaft einige Methodenaufrufe an
 * einem Objekt der Klasse String.
 * 
 * @author Prateek kalra
 * @version 2022
 */
class TextAnalyse
{
    //lokale variable 
    int x; 
    char vowel;
    int zaehler=0;
    
    /**
     * Ermittelt, ob es sich bei dem übergebenen Text um eine Frage
     * handelt. Eine Frage erkennt man am abschließenden Fragezeichen.
     * 
     * @param text der zu analysierende Text
     * @return true, wenn es sich um eine Frage handelt, false sonst
     */    
    public boolean istFrage(String text)
    {
        int anzahlZeichen = text.length();

        int letztePosition = anzahlZeichen - 1;

        char letztesZeichen = text.charAt(letztePosition);

        boolean endetAufFragezeichen = (letztesZeichen == '?');

        return endetAufFragezeichen;
    }

    /**
     * Ermittelt, ob es sich bei dem übergebenen Text um eine Frage
     * handelt. Eine Frage erkennt man am abschließenden Fragezeichen.
     * 
     * @param text der zu analysierende Text
     * @return true, wenn es sich um eine Frage handelt, false sonst
     */
    public boolean istFrageKompakt(String text)
    {
        return text.charAt(text.length() - 1) == '?';
    }
    
   
    /**
     * Ermittelt, ob es sich bei dem übergebenen Text pallindrome ist.
     * 
     * 
     * @param text der zu analysierende Text
     * @return true, wenn es eine Pallindrome ist.
     */ 
    public  boolean istPalindrome(String txt) {
        String s=txt.toLowerCase(); // yu lower case ,Unterschied zwichen a und A zu vermeiden
        for (int i=0 , j=s.length()-1 ; i<j/2 ; i++ , j-- ) // j/2 die programm schneller zu  machen.
        {

            if ( s.charAt(i) != s.charAt(j) ) {
                return false;
            }
        }

        return true;
    }
   
    private boolean istVokal(char ch )
    
    {
    boolean istVokal=false;
    switch(ch)
    {
            case     'a':
            case     'e':
            case     'i':
            case     'o':          
            case     'u':
                    istVokal=true;
            
    }    
    return istVokal;
    }

    /**
     * Ermittelt, wie viele Vowel gibts in einem gegebenen Text.
     * 
     * 
     * @param String text, Text zu analysieren
     * @return int ,die count des Vowels in dem Text.
     */
    public int countVocals(String text)
    {
        String S= text.toLowerCase();
       zaehler=0;
    for(x=0;x<S.length();x++)
    {
        char ch=S.charAt(x);
        if(istVokal(ch))
        {
          zaehler++;
        }
    }
       return  zaehler;
               
}


}
