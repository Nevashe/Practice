package homework1.task2;

public class MistakeCorrect {

}
interface Moveable {
    void move();
}
interface Stopable {
    void stop();
}
abstract class Car implements Stopable, Moveable{
    private Engine engine;
    private String color;
    private String name;
    private int weight;
    protected void start() {
        engine.start();
        System.out.println("Car starting");
    }
    public abstract void open();
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
    public int getWeight() {
        return weight;
    }
    public int setWeight(int weight) {
        this.weight = weight;
    }
}
class LightWeightCar extends Car{
    @Override
    public void open() {
        System.out.println("Car is open");
    }
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
    @Override
    public void stop() {
        System.out.println("Car is stop");
    }
}
class Lorry extends Car {

    @Override
    public void move(){
        System.out.println("Car is moving");
    }
    @Override
    public void stop(){
        System.out.println("Car is stop");
    }

    @Override
    public void open() {
        System.out.println("Car is open");
    }
}
