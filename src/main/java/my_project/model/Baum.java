package my_project.model;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Baum extends GraphicalObject {

    public Baum(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void draw(DrawTool drawTool) {
        //Stamm
        drawTool.setCurrentColor(new Color(78, 52, 23, 255));
        drawTool.drawFilledRectangle(x,y,25,70);
        //Outlines
        drawTool.setCurrentColor(Color.black);
        drawTool.drawRectangle(x,y,25,70);
        drawTool.drawCircle(x+10,y, 30);
        //Krone
        drawTool.setCurrentColor(new Color(6, 49, 5));
        drawTool.drawFilledCircle(x+10,y, 30);

    }
}
