/**
 * Exemplare dieser Klasse veranlassen Turtles dazu,
 * Spuren auf einer Zeichenfläche zu hinterlassen.
 *
 * @author Prateek kalra
 * @version 2022
 */
class Dompteur
{
    private Turtle turtle;
    public Dompteur()
    {
        turtle = new Turtle();
    }
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

    public void zeichneNEck(double ecke, double kantenLaenge){
        for (double x = 0; x <= ecke; x++){
            double winkel = 360 / ecke;
            turtle.geheVor(kantenLaenge);
            turtle.drehe(winkel);
        }
    }

    public void zeichneNEck(double ecke, double kantenLaenge,double xPosition, double yPosition, String farbe){
        turtle.setzeFarbe(farbe);
        turtle.geheZu(xPosition,yPosition);
        zeichneNEck(ecke,kantenLaenge);
    }

    public void zeichneNEck(double ecke){
        turtle.setzeFarbe ( "rot");
        zeichneNEck(ecke,20);
    }
    
    public void zeichneRosette(double ecke, double kantenLaenge, double winkel){
        for (int x = 0; x <= 180; x++){
            zeichneNEck(ecke,kantenLaenge);
            turtle.drehe(winkel);
        }
    }
  
}
