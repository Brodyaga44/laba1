package com.example.calculator.controller;

import com.example.calculator.builder.Director;
import com.example.calculator.builder.Indicator;
import com.example.calculator.bmi.BMI;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class HelloController {
    @FXML
    private Label Ans;
    @FXML
    private Label Result;
    @FXML
    private TextField BodyMass;
    @FXML
    private TextField BodyHeight;
    public Indicator indicator;
    public Pane panel;

    public void onCount(ActionEvent actionEvent) {
        final BMI bmi = new BMI(Float.valueOf(BodyHeight.getText()),Float.valueOf(BodyMass.getText()));
        float cal = bmi.calculate();
        Director director = new Director();
        Ans.setText(String.valueOf(bmi.calculate()));
        Result.setText(bmi.diagnosis());
        if (18.5 <= bmi.calculate() &&  bmi.calculate() < 25) {
            Result.setStyle("-fx-text-fill: green;");

        }
        else if (bmi.calculate() < 25){
            Result.setStyle("-fx-text-fill: orange;");

        } else if (18.5 <= bmi.calculate()) {
            Result.setStyle("-fx-text-fill: red;");

        }
        indicator = new Indicator();
        indicator = director.Initialize(cal);
        indicator.show(panel);

    }
}