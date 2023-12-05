package com.example.calculator.bmi;

public class BMI {
    private float weight;
    private float height;
    public BMI() {
        this.height = 0;
        this.weight = 0;
    }
    public BMI(float BodyHeight, float BodyMass) {
        this.height = BodyHeight;
        this.weight = BodyMass;
    }
    public float calculate()
    {
        return this.weight/this.height/this.height*10000;
    }
    public String diagnosis(){
        if (18.5 <= calculate() &&  calculate() < 25)
        {
            return "Вывод: Ваш ИМТ в норме";
        }
        else if (calculate() < 25) {
            return "Вывод: У Вас нехватка веса";
        }
        else if (18.5 <= calculate()) {
            return "Вывод: У Вас избыток веса";
        }
        return null;
    }

    @Override
    public String toString() {
        return "BMI{" +
                "weight=" + this.weight +
                ", height=" + this.height +
                '}';
    }
}
