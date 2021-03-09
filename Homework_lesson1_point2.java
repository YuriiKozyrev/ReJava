// не указан package
// нет разбиения по package
// нет точки входа
// одинаковое поведение в наследниках при использовании интерфеса Stopable


interface Moveable { /*нет модификатора доступа, а составляющие должны быть public*/
    void move();
}

interface Stopable { /*нет модификатора доступа, а составляющие должны быть public*/
    void stop();
}

abstract class Car { /*нет модификатора доступа*/
    public Engine engine; /* абстрактный класс не может содержать какие-либо объекты */

    /*переменные в абстрактном классе делают private, а методы public */
    private String color;
    private String name;
    
    
    protected void start() { /*этот метод нигде не используется, надо сделать public*/
        System.out.println("Car starting");
    }
    
    abstract void open(); 

    public Engine getEngine() { /*лишнее, т.к. абстрактный класс не может содеражть какие-либо объекты */
        return engine;
    }

    public void setEngine(Engine engine) { /*лишнее, т.к. абстрактный класс не может содеражть какие-либо объекты */
        this.engine = engine;
    }

    public String getColor() { 
        return color;
    }

    public void setColor(String color) { 
        this.color = color;
    }

    public String getName() { 
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class LightWeightCar extends Car implements Moveable{

    @Override
    void open() {
        System.out.println("Car is open");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
    
}

class Lorry extends Car, Moveable, Stopable{ /*множественное наследование запрещено, нет implements*/

    /*нет переопределения методов абстрактного класса*/

    public void move(){
        System.out.println("Car is moving");
    }

    public void stop(){
        System.out.println("Car is stop");
    }
}
