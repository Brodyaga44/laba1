package com.example.calculator.builder;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class BuilderIndicatorMini implements Builder {
    Indicator indicator = new Indicator();
    Pane pane = new Pane();

    @Override
    public void lineBounds(int width, int height, Color color) {
        Rectangle rect = new Rectangle();
        rect.setWidth(width);
        rect.setHeight(height);
        rect.setFill(color);
        rect.setStroke(Color.BLACK);
        rect.setY(23);
        pane.getChildren().add(rect);
    }
    @Override
    public void makeCircle(int num,float cal) {
        Circle circ = new Circle();
        circ.setRadius(num);
        if (18.5 <= cal &&  cal < 25) { //center
            circ.setCenterX(30);
            circ.setCenterY(30);
        }
        else if (cal < 25){ //left
            circ.setCenterX(10);
            circ.setCenterY(30);
        }
        else if (25 <= cal ){ //right
            circ.setCenterX(50);
            circ.setCenterY(30);

        }
        pane.getChildren().add(circ);
    }
    public void textgen(String text){
        Text textuot = new Text(text);
        pane.getChildren().add(textuot);

    }


    @Override
    public Indicator Build() {
        indicator.add(pane);
        return indicator;
    }
    public void remove() {
        indicator.remove(pane);
    }
}
