package Lesson1.Figures;

public class Square extends Figure {
    public Square(String type){
        super(type);
    }
    @Override
    public void info(){
        System.out.println("Я квадрат. Мой тип: " + type);
    }
}
