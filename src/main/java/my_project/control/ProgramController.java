package my_project.control;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.abitur.datenstrukturen.Queue;
import my_project.model.*;
import my_project.view.InputManager;

import java.awt.event.MouseEvent;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController {

    //Attribute


    // Referenzen
    private ViewController viewController;  // diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.

    /**
     * Konstruktor
     * Dieser legt das Objekt der Klasse ProgramController an, das den Programmfluss steuert.
     * Damit der ProgramController auf das Fenster zugreifen kann, benötigt er eine Referenz auf das Objekt
     * der Klasse viewController. Diese wird als Parameter übergeben.
     * @param viewController das viewController-Objekt des Programms
     */
    public ProgramController(ViewController viewController){
        this.viewController = viewController;
    }

    /**
     * Diese Methode wird genau ein mal nach Programmstart aufgerufen.
     * Sie erstellt die leeren Datenstrukturen, zu Beginn nur eine Queue
     */
    public void startProgram() {
        // Erstelle ein Objekt der Klasse Ball und lasse es zeichnen
        Himmel himmel1= new Himmel(150,150);
        viewController.draw(himmel1);
        Boden boden1=new Boden(0,400);
        viewController.draw(boden1);
        House haus1= new House(100,500);
        viewController.draw(haus1);
        Baum baum1= new Baum(200, 480 );
        viewController.draw(baum1);
        Zaun zaun1=new Zaun(90,525);
        viewController.draw(zaun1);
        Wolke wolke1=new Wolke(500,300);
        viewController.draw(wolke1);
        House haus2= new House(300,500);
        viewController.draw(haus2);
        Baum baum2= new Baum(400, 480 );
        viewController.draw(baum2);
        Zaun zaun2=new Zaun(290,525);
        viewController.draw(zaun2);
        Wolke wolke2=new Wolke(300,300);
        viewController.draw(wolke2);
        Wolke wolke3=new Wolke(100,300);
        viewController.draw(wolke3);



    }

    /**
     * Aufruf mit jeder Frame
     * @param dt Zeit seit letzter Frame
     */
    public void updateProgram(double dt){

    }
}
