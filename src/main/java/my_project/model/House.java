package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class House extends GraphicalObject {

    public House(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void draw(DrawTool drawTool) {
        //Schornstein
        drawTool.setCurrentColor(Color.darkGray);
        drawTool.drawFilledRectangle(x+10, y-35, 10,20);
        //Haus
        drawTool.setCurrentColor(Color.RED);
        drawTool.drawFilledTriangle(x, y,x+60,y,x+30,y-50);
        drawTool.setCurrentColor(Color.yellow);
        drawTool.drawFilledRectangle(x, y, 60,50);
        //Tür
        drawTool.setCurrentColor(Color.black);
        drawTool.drawFilledRectangle(x+20,y+25, 20, 25);
        drawTool.setCurrentColor(Color.yellow);
        drawTool.drawFilledCircle(x+37, y+32, 2 );
        //Fenster
        drawTool.setCurrentColor(Color.lightGray);
        drawTool.drawFilledRectangle(x+10,y+10, 10,10);
        drawTool.drawFilledRectangle(x+40,y+10, 10,10);

        //Outlines
        drawTool.setCurrentColor(Color.black);
        drawTool.drawRectangle(x+10,y+10, 10,10);
        drawTool.drawRectangle(x+40,y+10, 10,10);
        drawTool.drawRectangle(x+10,y+10, 5,5);
        drawTool.drawRectangle(x+40,y+10, 5,5);
        drawTool.drawRectangle(x+15, y+15,5,5);
        drawTool.drawRectangle(x+45, y+15,5,5);
        drawTool.drawTriangle(x, y,x+60,y,x+30,y-50);




    }


}
