
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
/**
 * In dieser Klasse sind rekursive Algorithmen umzusetzen.
 * 
 * @author Prateek kalra
 * @version 2022
 */
class Produzieren
{
    /**
    * Liefert die Fakultät von n, also das Produkt aller natürlichen Zahlen bis n.
    * Die Fakultät von 0 ist per mathematischer Definition 1.
    *
    * Beispielauswertung:
    * 
    *   fak(4)
    * -> 4 * fak(3)
    * -> 4 * (3 * fak(2))
    * -> 4 * (3 * (2 * fak(1)))
    * -> 4 * (3 * (2 * (1 * fak(0))))
    * -> 4 * (3 * (2 * (1 * 1)))
    * -> 4 * (3 * (2 * 1))
    * -> 4 * (3 * 2)
    * -> 4 * 6
    * -> 24
    */
   
     
    public int fak(int n)
    {
        if(n>=1)
        {
        return n*fak(n-1);
        }
        else
        {
        return 1;
        }  
    }
    
    /**
     * Berechnet n modulo m, also den Rest der ganzzahligen Division n/m.
     * 
     * modulo(14,3) -> modulo(11,3) -> modulo(8,3) -> modulo(5,3) -> modulo(2,3) -> 2
     * 
     * @param n ein beliebiger Wert >= 0
     * @param m ein beliebiger Wert > 0
  
    public int mod(int n, int m) throws Exception
    {   int r;
        if(n>=0 && m>0){
         r= n%m;
        }
      
        else
        {
        throw new Exception("nota valid input");    
        }
     return r;
    }
       */
      
    public int mod(int dividend, int divisor) 
    {
        if(dividend>=0 && divisor>=0){
        if(dividend == divisor)
            return 0;
        
        else if (divisor > dividend)
            return dividend;
            
        return mod(dividend - divisor, divisor);
    }
    else 
    {
    return -1;
    }
    }
    
    /**
    * Gibt an, ob die Zeichenkette einen Vokal enthält. Auswertungen:
    * 
    * enthaeltVokal("brei") -> enthaeltVokal("rei") -> enthaeltVokal("ei") -> true
    * enthaeltVokal("xyz") -> enthaeltVokal("yz") -> enthaeltVokal("z") -> enthaeltVokal("") -> false
    * @param s ein beliebiger String ungleich null
    */
    public boolean enthaeltVokal(String text)
    {
    String S= text.toLowerCase();
      
    for(int x=0;x<S.length();x++)
    {
        char ch=S.charAt(x);
        if(istVokal(ch))
        {
          return true;
        }
    }       
        return false;
    }
     
    
    private boolean istVokal(char ch)
    
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
    * Gibt an, ob die Zeichenkette ein Palindrom ist. Auswertungen:
    * 
    * istPalindrom("anna") -> istPalindrom("nn") -> istPalindrom("") -> true
    * istPalindrom("asta") -> istPalindrom("st") -> false
    * istPalindrom("axa") -> istPalindrom("x") -> true
    * istPalindrom("xyz") -> false
    * @param s ein beliebiger String ungleich null
    
    public boolean istPalindrom(String text)
    {
         String s=text.toLowerCase(); // yu lower case ,Unterschied zwichen a und A zu vermeiden
        for (int i=0 , j=s.length()-1 ; i<j/2 ; i++ , j-- ) // j/2 die programm schneller zu  machen.
        {

            if ( s.charAt(i) != s.charAt(j) ) {
                return false;
            }
        }

        return true;
    }
    */
    public boolean isPalindrom(String s)
    {
        if(s.length() == 0 || s.length() == 1)
                      return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
        {  
            return isPalindrom(s.substring(1, s.length()-1));

        }
        return false;
    }
    
    /**
    * Berechnet die Anzahl Leerzeichen in der Zeichenketten. Auswertung:
    * 
    * anzahlLeerzeichen("a bc d")
    * -> 0 + anzahlLeerzeichen(" bc d")
    * -> 0 + (1 + anzahlLeerzeichen("bc d"))
    * -> 0 + (1 + (0 + anzahlLeerzeichen("c d")))
    * -> 0 + (1 + (0 + (0 + anzahlLeerzeichen(" d"))))
    * -> 0 + (1 + (0 + (0 + (1 + anzahlLeerzeichen("d")))))
    * -> 0 + (1 + (0 + (0 + (1 + (0 + anzahlLeerzeichen(""))))))
    * -> 0 + (1 + (0 + (0 + (1 + (0 + 0)))))
    * -> 0 + (1 + (0 + (0 + (1 + 0))))
    * -> 0 + (1 + (0 + (0 + 1)))
    * -> 0 + (1 + (0 + 1))
    * -> 0 + (1 + 1)
    * -> 0 + 2
    * -> 2
    * @param s ein beliebiger String ungleich null
    
    public int anzahlLeerzeichen(String s)
    {
        int count=0;
        for(int x=0;x<s.length();x++)
        {
            if(s.charAt(x)==' ')
        {    
        count =count+1;
        }     
        
        }
     return count;   
    }    
    */
    public int anzahlLeerzeichen(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int count = 0;
        if (str.substring(0, 1).equals(" ")) {
            count = 1;
        }
        return count + anzahlLeerzeichen(str.substring(1));
    }
    
    /**
    * Liefert die umgedrehte Zeichenkette. Auswertung:
    * 
    *   umgedreht("regal")
    * -> umgedreht("egal") + 'r'
    * -> (umgedreht("gal") + 'e') + 'r'
    * -> ((umgedreht("al") + 'g') + 'e') + 'r'
    * -> (((umgedreht("l") + 'a') + 'g') + 'e') + 'r'
    * -> (((          "l"  + 'a') + 'g') + 'e') + 'r'
    * -> ((           "la"        + 'g') + 'e') + 'r'
    * -> (            "lag"              + 'e') + 'r'
    * ->              "lage"                    + 'r'
    * ->              "lager"
    * @param s ein beliebiger String ungleich null
    */
    public String umgedreht(String str) {
    if ((null == str) || (str.length() <= 1)) {
        return str;
    }
    return umgedreht(str.substring(1)) + str.charAt(0);
    }
   

    
    
   private void testmod()  
   {
    assertTrue(1==mod(5,4));
    assertTrue(0==mod(4,4));
    assertTrue(2==mod(2,3));
    assertTrue(-1==mod(3,-5));
   } 
   
    private void testpallin()
    {
    assertTrue(true==isPalindrom("appa"));
    assertTrue(true==isPalindrom(" "));
    assertTrue(false==isPalindrom("osass"));
    assertTrue(false==isPalindrom("2329"));
    assertTrue(true==isPalindrom("1111"));
   }
  
   private void  testfak()
   {
    assertTrue(120==fak(5));
    assertTrue(1==fak(0));
    assertTrue(1==fak(1));
    assertTrue(1==fak(-5));
   
   } 
   
   private void testleer()
   {
   Integer.compare(0, anzahlLeerzeichen("pozt"));
   Integer.compare(2, anzahlLeerzeichen("po zt "));
   Integer.compare(2, anzahlLeerzeichen("  "));
       }
     
    private void testVok()
   {
    assertTrue(true==enthaeltVokal("pol"));
    assertTrue(true==enthaeltVokal("i"));
    assertTrue(false==enthaeltVokal("mnbvcn"));
    assertTrue(false==enthaeltVokal("    "));
    assertTrue(false==enthaeltVokal("123"));
    
   } 

   private void testdreh()
   {
   assertTrue("regal".equals(umgedreht("lager")));
   assertTrue("pop".equals(umgedreht("pop")));
   assertTrue("111".equals(umgedreht("111")));
   assertTrue(" ".equals(umgedreht(" ")));
   assertFalse("olk".equals(umgedreht("lka")));
   
    }
    
    public String testAllMethode()
    {
    testdreh();
    testleer();
    testVok();
    testpallin();
    testfak();
    testmod();
    
    
    
    return "ALL TEST Erfolgreich";
    }
}