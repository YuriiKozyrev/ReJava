package Lesson1.Figures;

public class Circle extends Figure {
    public Circle(String type){
        super(type);
    }
    @Override
    public void info(){
        System.out.println("Я круг. Мой тип: " + type);
    }
}
