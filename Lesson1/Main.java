package Lesson1;

import Lesson1.Figures.Circle;
import Lesson1.Figures.Figure;
import Lesson1.Figures.Square;
import Lesson1.Figures.Triangle;

public class Main {
    public static void main(String[] args) {

        //builder
        Person person = new Person.PersonBuilder()
                .firstName("Алсу")
                .lastName("Абрамова")
                .middleName("Ралифовна")
                .country("Россия")
                .address("Татарстан, г.Бугульма, 3-я ул. Строителей, д.25, кв.17")
                .age(39)
                .phone("+79112222222")
                .gender("Женский")
                .build();

        System.out.println(person.info());

        //polymorphism
        Figure figure = new Figure();
        Figure triangle = new Triangle("111");
        Figure square = new Square("222");
        Figure circle = new Circle("qwerty");

        figure.info();
        triangle.info();
        square.info();
        circle.info();


    }
}
