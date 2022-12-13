package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Boden extends GraphicalObject {

    public Boden(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(Color.green);
        drawTool.drawFilledRectangle(x,y,5000,5000);


    }
}