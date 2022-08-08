package homework1.task3;

public class Circle extends Figure implements Rotatable, Flatable {

    double radius;

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getLengthCircuit() {
        return Math.PI * radius * 2;
    }
}
