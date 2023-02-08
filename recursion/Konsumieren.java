/**
 * Die Methoden in dieser Klasse haben keine besonders aussagekräftigen Namen.
 * Schaue dir den Quelltext an, führe die Methoden aus und dokumentiere sie.
 * 
 * @author Prateek kalra
 * @version 2022
 */
class Konsumieren
{
    /**
     * Liefert die führende Ziffer einer Zahl.
     * 
     *    a(5678)
     * -> a(567)
     * -> a(56)
     * -> a(5)
     * -> 5
     */
    public int a(int x)
    {
        int result;
        if (x < 10)     // wenn die Zahl nur aus einer Ziffer besteht...
        {
            result = x;   // ...dann ist diese Ziffer das Ergebnis
        }
        else
        {               // ansonsten wird die rechte Ziffer abgeschnitten...
            result = a(x / 10);
        }               // ...und die Funktion erneut ausgeführt
        return result;
    }

    /**
     * Liefert die Anzahl Ziffern einer Zahl.
     * 
     *   b(5678)
     * -> 1 + b(567)
     * -> 1 + (1 + b(56))
     * -> 1 + (1 + (1 + b(5)))
     * -> 1 + (1 + (1 + 1))
     * -> 1 + (1 + 2)
     * -> 1 + 3
     * -> 4
     */
    public int b(int x)
    {
        int result;
        if (x < 10)     // wenn die Zahl nur aus einer Ziffer besteht...
        {
            result = 1;   // ...dann ist die Anzahl Ziffern 1
        }
        else
        {               // ansonsten ist das Ergebnis um 1 höher...
            result = 1 + b(x / 10);
        }               // ...als die Anzahl Ziffern in der Zahl ohne die rechte Ziffer
        return result;
    }

    /**
     * Liefert die Quersumme einer Zahl.
     *
     *   c(5678)
     * -> 
     */
    public int c(int x)
    {
        int result;
        if (x < 10)
        {
            result = x;
        }
        else
        {
            result = (x % 10) + c(x / 10);
        }
        return result;
    }
     
    /**
     * Liefert // die Zahl als Zeichenkette zurück
     * 
     *   d(5678)
     * -> d(567) + '8'
     * -> (d(56) + '7') + '8'
     * -> ((d(5) + '6') + '7') + '8'
     * -> (( "5" + '6') + '7') + '8'
     * -> (  "56        + '7') + '8'
     * ->    "567"             + '8'
     * ->    "5678"
     */
    public String d(int x)
    {
        String result;
        if (x < 10)
        {
            result = "" + zifferAlsZeichen(x);
        }
        else
        {
            result = d(x / 10) + zifferAlsZeichen(x % 10);
        }
        return result;
    }

    /**
     * Wandelt eine Ziffer (0 bis 9) in ein Zeichen ('0' bis '9') um.
     * @param x eine ganze Zahl aus dem Bereich 0 bis 9
     */
    private char zifferAlsZeichen(int ziffer)
    {
        return (char)('0' + ziffer);
    }

       /**
     * Liefert die Zahl in umgekehrter Reihenfolge aus
     * 
     * e(5678)
     * -> (8765)
     */
    public int e(int x)
    {
        return e2(x, 0);
    }

   /**
     * e2(5678, 0)
     * -> (567 , 8)
     * -> (56 , 87)
     * -> (5 , 876)
     * -> (0 , 8765)
     */
    public int e2(int x, int y)
    {
        int result;
        if (x < 10)
        {
            result = (y * 10) + x;
        }
        else
        {
            result = e2(x / 10, (y * 10) + (x % 10));
        }
        return result;
    }

     /**
     * Liefert die Position eines gesuchten Zeichens einer Zeichenkette
     * 
     * f("Rosen", 'e')
     * -> f("osen", 'e')
     * -> "sen"
     * -> "en"
     * -> "sen"
     * -> "osen"
     * -> "Rosen"
     * -> 3
     */
    public int f(String s, char c)
    {
        int result;
        if (s.isEmpty())
        {
            result = -1;
        }
        else
        {
            if (s.charAt(0) == c)
            {
                result = 0;
            }
            else
            {
                int ergebnis = f(s.substring(1), c);
                if(ergebnis == -1){
                    result = ergebnis;
                }
                else
                {
                    result = 1 + ergebnis;
                }
            }
        }
        return result;
    }

        /**
     * Liefert die Position eines gesuchten Zeichens innerhalb der Zeichenkette
     */
    public int g(String s, char c)
    {
        return g2(s, c, 0);
    }

     /**
     * g2("Rosen", 'e', 0)
     * -> g2("Rosen", 'e', 1)
     * -> g2("Rosen", 'e', 2)
     * -> g2("Rosen", 'e', 3)
     * -> g2("Rosen", 'e', 2)
     * -> g2("Rosen", 'e', 1)
     * -> g2("Rosen", 'e', 0)
     * -> 3
     */
    private int g2(String s, char c, int i)
    {
        int result;
        if (i == s.length())
        {
            result = -1;
        }
        else
        {
            if (s.charAt(i) == c)
            {
                result = i;
            }
            else
            {
                result = g2(s, c, i + 1);
            }
        }
        return result;
    }

    /**
     * Hier finden die Aufrufe statt, die in den Diagrammen
     * auf dem Aufgabenblatt veranschaulicht werden (sollen).
     */
    public void testeAlleMethoden()
    {
        System.out.println(a(5678));
        System.out.println(b(5678));
        System.out.println(c(5678));
        System.out.println(d(5678));
        System.out.println(e(5678));
        System.out.println(f("Rosen", 'e'));
        System.out.println(g("Rosen", 'e'));
    }
}
