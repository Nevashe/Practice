package homework1.task3;

public class Square extends Figure implements Flatable {
    double side;

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getLengthCircuit() {
        return side * 4;
    }
}
