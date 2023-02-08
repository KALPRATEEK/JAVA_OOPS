
/**
 * Die möglichen Kartenbilder eines Kartenspiels als Aufzählung.
 * Ein Kartenbild setzt sich zusammen aus einer Kartenfarbe und einem
 * Kartenrang.<br>
 * Da es im Unicode-Zeichensatz auch Zeichen für Kartenbilder gibt,
 * kennt jedes Kartenbild zusätzlich seinen passenden Codepunkt.<br><br>
 * Beispiel: Das Pik-As (engl.: Ace of Spades) hat den (hexadezimal
 * dargestellten) Codepunkt 1f0a1.<br><br>
 * Dieses Zeichen kann auch direkt hier in HTML dargestellt werden: &#x1f0a1;,
 * etwas vergrößert: <font size="+7">&#x1f0a1;</font>
 * 
 * @author Axel Schmolitzky 
 * @version 2022 
 */ 
enum Kartenbild
{
    /** Herz Zwei <font size="+7">&#x1f0b2;</font> */ H2(Kartenfarbe.HERZ, Kartenrang.ZWEI, 0x1f0b2), 
    /** Herz Drei <font size="+7">&#x1f0b3;</font> */ H3(Kartenfarbe.HERZ, Kartenrang.DREI, 0x1f0b3),
    /** Herz Vier <font size="+7">&#x1f0b4;</font> */ H4(Kartenfarbe.HERZ, Kartenrang.VIER, 0x1f0b4),
    /** Herz Fuenf <font size="+7">&#x1f0b5;</font> */ H5(Kartenfarbe.HERZ, Kartenrang.FUENF, 0x1f0b5),
    /** Herz Sechs <font size="+7">&#x1f0b6;</font> */ H6(Kartenfarbe.HERZ, Kartenrang.SECHS, 0x1f0b6),
    /** Herz Sieben <font size="+7">&#x1f0b7;</font> */ H7(Kartenfarbe.HERZ, Kartenrang.SIEBEN, 0x1f0b7),
    /** Herz Acht <font size="+7">&#x1f0b8;</font> */ H8(Kartenfarbe.HERZ, Kartenrang.ACHT, 0x1f0b8),
    /** Herz Neun <font size="+7">&#x1f0b9;</font> */ H9(Kartenfarbe.HERZ, Kartenrang.NEUN, 0x1f0b9),
    /** Herz Zehn <font size="+7">&#x1f0ba;</font> */ H10(Kartenfarbe.HERZ, Kartenrang.ZEHN, 0x1f0ba),
    /** Herz Bube <font size="+7">&#x1f0bb;</font> */ HB(Kartenfarbe.HERZ, Kartenrang.BUBE, 0x1f0bb),
    /** Herz Dame <font size="+7">&#x1f0bd;</font> */ HD(Kartenfarbe.HERZ, Kartenrang.DAME, 0x1f0bd),
    /** Herz Koenig <font size="+7">&#x1f0be;</font> */ HK(Kartenfarbe.HERZ, Kartenrang.KOENIG, 0x1f0be),
    /** Herz As <font size="+7">&#x1f0b1;</font> */ HA(Kartenfarbe.HERZ, Kartenrang.AS, 0x1f0b1),

    /** Karo Zwei <font size="+7">&#x1f0c2;</font> */ KA2(Kartenfarbe.KARO, Kartenrang.ZWEI, 0x1f0c2),
    /** Karo Drei <font size="+7">&#x1f0c3;</font> */ KA3(Kartenfarbe.KARO, Kartenrang.DREI, 0x1f0c3),
    /** Karo Vier <font size="+7">&#x1f0c4;</font> */ KA4(Kartenfarbe.KARO, Kartenrang.VIER, 0x1f0c4),
    /** Karo Fuenf <font size="+7">&#x1f0c5;</font> */ KA5(Kartenfarbe.KARO, Kartenrang.FUENF, 0x1f0c5),
    /** Karo Sechs <font size="+7">&#x1f0c6;</font> */ KA6(Kartenfarbe.KARO, Kartenrang.SECHS, 0x1f0c6),
    /** Karo Sieben <font size="+7">&#x1f0c7;</font> */ KA7(Kartenfarbe.KARO, Kartenrang.SIEBEN, 0x1f0c7),
    /** Karo Acht <font size="+7">&#x1f0c8;</font> */ KA8(Kartenfarbe.KARO, Kartenrang.ACHT, 0x1f0c8),
    /** Karo Neun <font size="+7">&#x1f0c9;</font> */ KA9(Kartenfarbe.KARO, Kartenrang.NEUN, 0x1f0c9),
    /** Karo Zehn <font size="+7">&#x1f0ca;</font> */ KA10(Kartenfarbe.KARO, Kartenrang.ZEHN, 0x1f0ca),
    /** Karo Bube <font size="+7">&#x1f0cb;</font> */ KAB(Kartenfarbe.KARO, Kartenrang.BUBE, 0x1f0cb),
    /** Karo Dame <font size="+7">&#x1f0cd;</font> */ KAD(Kartenfarbe.KARO, Kartenrang.DAME, 0x1f0cd),
    /** Karo Koenig <font size="+7">&#x1f0ce;</font> */ KAK(Kartenfarbe.KARO, Kartenrang.KOENIG, 0x1f0ce),
    /** Karo As <font size="+7">&#x1f0c1;</font> */ KAA(Kartenfarbe.KARO, Kartenrang.AS, 0x1f0c1),


    /** Pik Zwei <font size="+7">&#x1f0a2;</font> */ P2(Kartenfarbe.PIK, Kartenrang.ZWEI, 0x1f0a2),
    /** Pik Drei <font size="+7">&#x1f0a3;</font> */ P3(Kartenfarbe.PIK, Kartenrang.DREI, 0x1f0a3),
    /** Pik Vier <font size="+7">&#x1f0a4;</font> */ P4(Kartenfarbe.PIK, Kartenrang.VIER, 0x1f0a4),
    /** Pik Fuenf <font size="+7">&#x1f0a5;</font> */ P5(Kartenfarbe.PIK, Kartenrang.FUENF, 0x1f0a5),
    /** Pik Sechs <font size="+7">&#x1f0a6;</font> */ P6(Kartenfarbe.PIK, Kartenrang.SECHS, 0x1f0a6),
    /** Pik Sieben <font size="+7">&#x1f0a7;</font> */ P7(Kartenfarbe.PIK, Kartenrang.SIEBEN, 0x1f0a7),
    /** Pik Acht <font size="+7">&#x1f0a8;</font> */ P8(Kartenfarbe.PIK, Kartenrang.ACHT, 0x1f0a8),
    /** Pik Neun <font size="+7">&#x1f0a9;</font> */ P9(Kartenfarbe.PIK, Kartenrang.NEUN, 0x1f0a9),
    /** Pik Zehn <font size="+7">&#x1f0aa;</font> */ P10(Kartenfarbe.PIK, Kartenrang.ZEHN, 0x1f0aa),
    /** Pik Bube <font size="+7">&#x1f0ab;</font> */ PB(Kartenfarbe.PIK, Kartenrang.BUBE, 0x1f0ab),
    /** Pik Dame <font size="+7">&#x1f0ad;</font> */ PD(Kartenfarbe.PIK, Kartenrang.DAME, 0x1f0ad),
    /** Pik Koenig <font size="+7">&#x1f0ae;</font> */ PK(Kartenfarbe.PIK, Kartenrang.KOENIG, 0x1f0ae),
    /** Pik As <font size="+7">&#x1f0a1;</font> */ PA(Kartenfarbe.PIK, Kartenrang.AS, 0x1f0a1),

    /** Kreuz Zwei <font size="+7">&#x1f0d2;</font> */ KR2(Kartenfarbe.KREUZ, Kartenrang.ZWEI, 0x1f0d2),
    /** Kreuz Drei <font size="+7">&#x1f0d3;</font> */ KR3(Kartenfarbe.KREUZ, Kartenrang.DREI, 0x1f0d3),
    /** Kreuz Vier <font size="+7">&#x1f0d4;</font> */ KR4(Kartenfarbe.KREUZ, Kartenrang.VIER, 0x1f0d4),
    /** Kreuz Fuenf <font size="+7">&#x1f0d5;</font> */ KR5(Kartenfarbe.KREUZ, Kartenrang.FUENF, 0x1f0d5),
    /** Kreuz Sechs <font size="+7">&#x1f0d6;</font> */ KR6(Kartenfarbe.KREUZ, Kartenrang.SECHS, 0x1f0d6),
    /** Kreuz Sieben <font size="+7">&#x1f0d7;</font> */ KR7(Kartenfarbe.KREUZ, Kartenrang.SIEBEN, 0x1f0d7),
    /** Kreuz Acht <font size="+7">&#x1f0d8;</font> */ KR8(Kartenfarbe.KREUZ, Kartenrang.ACHT, 0x1f0d8),
    /** Kreuz Neun <font size="+7">&#x1f0d9;</font> */ KR9(Kartenfarbe.KREUZ, Kartenrang.NEUN, 0x1f0d9),
    /** Kreuz Zehn <font size="+7">&#x1f0da;</font> */ KR10(Kartenfarbe.KREUZ, Kartenrang.ZEHN, 0x1f0da),
    /** Kreuz Bube <font size="+7">&#x1f0db;</font> */ KRB(Kartenfarbe.KREUZ, Kartenrang.BUBE, 0x1f0db),
    /** Kreuz Dame <font size="+7">&#x1f0dd;</font> */ KRD(Kartenfarbe.KREUZ, Kartenrang.DAME, 0x1f0dd),
    /** Kreuz Koenig <font size="+7">&#x1f0de;</font> */ KRK(Kartenfarbe.KREUZ, Kartenrang.KOENIG, 0x1f0de),
    /** Kreuz As <font size="+7">&#x1f0d1;</font> */ KRA(Kartenfarbe.KREUZ, Kartenrang.AS, 0x1f0d1);
    
    private Kartenfarbe _farbe;
    private Kartenrang _rang;
    private int _codepoint;
    
    private Kartenbild(Kartenfarbe farbe, Kartenrang rang, int codepoint)
    {
        _farbe = farbe;
        _rang = rang;
        _codepoint = codepoint;
    }
    
    /**
     * Liefert die Farbe dieses Kartenbildes.
     */
    public Kartenfarbe farbe()
    {
        return _farbe;
    }
    
    /**
     * Liefert den Rang dieses Kartenbildes.
     */
    public Kartenrang rang()
    {
        return _rang;
    }
    
    /**
     * Liefert den Codepoint des passenden Zeichens im Unicode-Zeichensatz.
     */
    public int codepoint()
    {
        return _codepoint;
    }

    /**
     * Liefert eine lesbare Darstellung dieses Kartenbildes.
     */
    public String toString()
    {
        return "" + _farbe + "-" + _rang;
    }
        
}
