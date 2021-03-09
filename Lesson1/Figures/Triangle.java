package Lesson1.Figures;

import Lesson1.Figures.Figure;

public class Triangle extends Figure {
    public Triangle(String type){
        super(type);
    }
    @Override
    public void info(){
        System.out.println("Я треугольник. Мой тип: " + type);
    }
}
