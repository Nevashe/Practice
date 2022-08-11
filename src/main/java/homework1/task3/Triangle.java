package homework1.task3;

public class Triangle extends Figure implements Flatable {
    int firstSide;
    int secondSide;
    int thirdSide;

    @Override
    public double getArea() {
        double p = getLengthCircuit() / 2;
    return Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
    }

    @Override
    public double getLengthCircuit() {
    return firstSide + secondSide + thirdSide;
    }
}
