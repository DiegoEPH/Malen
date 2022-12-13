package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

    public class Zaun extends GraphicalObject {

        public Zaun(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public void draw(DrawTool drawTool) {
            drawTool.setCurrentColor(new Color(66, 36, 21));
            drawTool.drawFilledRectangle(x, y, 10, 25);
            drawTool.drawFilledRectangle(x-15, y, 10, 25);
            drawTool.drawFilledRectangle(x-30, y, 10, 25);
            drawTool.setCurrentColor(new Color(62, 40, 22));
            drawTool.drawFilledRectangle(x-30,y+8,40,10);


        }
    }