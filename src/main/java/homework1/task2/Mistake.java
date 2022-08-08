package homework1.task2;

public class Mistake {
    /*
    * Описать ошибки в коде и предложить варианты оптимизации:
    * */
}


// В данной релизации оба потомка класса Car умеют Move, предлагаю имплементить Moveable в Car
// Я бы и Stopable туда перенес, но LightWeightCar не умеет останавливаться
// Если это все-таки ошибка, то оба интерфейса перенести в Car, а в потомках их имплементить не надо
interface Moveable {
    void move();
}
interface Stopable {
    void stop();
}
abstract class Car { // implements Stopable, Moveable
    public Engine engine; // модификатор public не нужен, заменить на private
    private String color;
    private String name;
    protected void start() {
        System.out.println("Car starting"); // Здесь по идеи должна быть какая-то связь с Engine
    }
    abstract void open(); //непонятно почему default открывать машину можно будет только в том же package?
    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
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
class LightWeightCar extends Car implements Moveable { // Почему в наименовании класса указано про легкий вес, а нет параметров Weight в Car?
    @Override
    void open() {
        System.out.println("Car is open");
    }
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
class Lorry extends Car, Moveable, Stopable { // интерфейсы реализуются, а не наследуются, вместо первой запятой написать implements
    public void move(){                     //нехватает аннотации @Override
        System.out.println("Car is moving");
    }                                   // не переопределен абстрактный метод open() из класса Car
    public void stop(){                     //нехватает аннотации @Override
        System.out.println("Car is stop");
    }
}
