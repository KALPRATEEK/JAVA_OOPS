 /**
 * Exemplare dieser Klasse veranlassen Turtles dazu,
 * Spuren auf einer Zeichenfläche zu hinterlassen.
 *
 * @author Prateek 
 * @version 2022
 */
class Dompteur
{
    /**
     * 'PR1' auf die Zeichenfläche zeichnen.
     */
    public void start()
    {
        Turtle turtle = new Turtle(50, 100);

        turtle.drehe(-90);
        turtle.geheVor(60);
        turtle.drehe(90);
        turtle.geheVor(30);
        turtle.drehe(90);
        turtle.geheVor(30);
        turtle.drehe(90);
        turtle.geheVor(30);
        turtle.drehe(180);
        
        // Ohne Spur zum nächsten Buchstaben bewegen:
        turtle.hinterlasseKeineSpur();
        turtle.geheZu(100, 100);

        // 'R' zeichnen:
        turtle.hinterlasseSpur();
        turtle.drehe(-90);
        turtle.geheVor(60);
        turtle.drehe(90);
        turtle.geheVor(30);
        turtle.drehe(90);
        turtle.geheVor(30);
        turtle.drehe(90);
        turtle.geheVor(30);
        turtle.drehe(180);
        turtle.hinterlasseKeineSpur();
        turtle.geheVor(15);
        turtle.hinterlasseSpur();
        turtle.drehe(60);
        turtle.geheVor(35);

        // Ohne Spur zum nächsten Buchstaben bewegen:
        turtle.hinterlasseKeineSpur();
        turtle.geheZu(170, 100);

        // '1' zeichnen:
        turtle.drehe(-60);
        turtle.hinterlasseSpur();
        turtle.setzeFarbe("rot");
        turtle.drehe(-90);
        turtle.geheVor(60);
        turtle.drehe(-120);
        turtle.geheVor(20);
    }
     
    /**
     * die Aufgabe auch zeigt dass,recusrion nimmt manchmal viel Zeit ,weil es sehr schwer ist eine lange methode noh mal zu anrufen innerhalb Methode.
     * wenn man n =7, oder mehr tippt ,nimmt die Machine sehr lange etwas zu malen. Daher Recursion ist zeitmaessig anspruchsvoll fuer Rechner.
     */
  public void  zeichneKochKurve(Turtle t, double l, int n) { 
      
      if (n > 0) {
            zeichneKochKurve ( t,l/3, n - 1);
            t.drehe(300);   //(soll eigentlich 60 sein , aber war total umgekhert mit 60 grad ,deswegen 360-60=300)
            zeichneKochKurve( t,l/3, n -1);
            t.drehe(480);   //(soll eigentlich -120 sein , aber war total umgekhert mit -120 grad ,deswegen 360-(-120)=480)
            zeichneKochKurve( t,l/3, n -1);
            t.drehe(300);//(soll eigentlich 60 sein , aber war total umgekhert mit 60 grad ,deswegen 360-60=300)
            zeichneKochKurve( t,l/3, n -1);
        } else t.geheVor(l);
    
    }

 /**
  * fuer beste KOCHKURVE =
  * L ist Perfekt am 300.
  * n soll maximal 5 sein, ab 6 nimmt es viel zeit zu malen.
    @param l S0ll nich negativ sein und am besten 300
    @param n S0ll nicht negativ sein, am besten zwischen 1 bis 5.
    */
  public void zeichneKochKurve(double l,int n)
  {
         Turtle t=new Turtle(50,100);
        zeichneKochKurve(t,l,n);
    }
}
    

