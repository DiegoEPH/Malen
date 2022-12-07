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
        //Krone
        drawTool.setCurrentColor(Color.green);
        drawTool.drawFilledCircle(x+10,y, 30);
    }
}
