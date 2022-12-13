package my_project.model;


import KAGO_framework.Config;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Himmel extends GraphicalObject {

    public Himmel(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(Color.blue);
        drawTool.drawFilledRectangle(0, 0, 500000, 500000);
    }

}