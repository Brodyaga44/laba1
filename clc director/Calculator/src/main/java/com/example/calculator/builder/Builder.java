package com.example.calculator.builder;


import javafx.scene.paint.Color;

public interface Builder{
        public void lineBounds(int width, int height, Color color);
        public void makeCircle(int num, float cal);
        public void textgen(String text);
        public Indicator Build();
    }

