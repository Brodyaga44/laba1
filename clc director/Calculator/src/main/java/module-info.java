module com.example.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculator to javafx.fxml;
    exports com.example.calculator;
    exports com.example.calculator.builder;
    opens com.example.calculator.builder to javafx.fxml;
    exports com.example.calculator.bmi;
    opens com.example.calculator.bmi to javafx.fxml;
    exports com.example.calculator.controller;
    opens com.example.calculator.controller to javafx.fxml;
}