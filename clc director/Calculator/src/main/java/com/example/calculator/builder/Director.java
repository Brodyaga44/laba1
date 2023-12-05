package com.example.calculator.builder;

import javafx.scene.paint.Color;

public class Director {
        BuilderIndicatorMini builder = new BuilderIndicatorMini();
        public Indicator Initialize(float cal){
                builder.lineBounds(60,15, Color.RED);
                builder.lineBounds(40,15, Color.GREEN);
                builder.lineBounds(20,15, Color.ORANGE);
                builder.makeCircle(6,cal);
                builder.textgen("Результат расчетов:");
                return builder.Build();
        }
}
