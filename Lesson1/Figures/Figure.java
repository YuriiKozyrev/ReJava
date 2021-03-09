package Lesson1.Figures;

public class Figure {
    protected String type;

    public Figure(String type){
        this.type = type;
    }

    public Figure() {
    }

    public void info(){
        System.out.println("Я абстрактная фигура");
    }
}
