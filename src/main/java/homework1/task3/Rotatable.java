package homework1.task3;

public interface Rotatable {
    double getRadius();

    default double getDiameter(){
        return getRadius() * 2;
    }
}
