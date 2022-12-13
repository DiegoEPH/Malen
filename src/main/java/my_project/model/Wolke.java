package my_project.model;


import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Wolke extends GraphicalObject {

    public Wolke(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(Color.white);
        drawTool.drawFilledCircle(x,y,20);
        drawTool.drawFilledCircle(x+15,y+15,20);
        drawTool.drawFilledCircle(x-15,y+15,20);






    }
}
