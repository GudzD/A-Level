package ua.gudz.hw9.task1;

public class Saturn implements Planet {
    double mass;
    double radius;
    boolean atmosphere;
    int averageTemp;

    public Saturn(double mass, double radius, boolean atmosphere, int averageTemp) {
        this.mass = mass;
        this.radius = radius;
        this.atmosphere = atmosphere;
        this.averageTemp = averageTemp;
    }

    @Override
    public String toString() {
        return "Saturn ";
    }

    @Override
    public double accelerationOfGravity() {
        return G * (mass / Math.pow(radius, 2));
    }

    @Override
    public boolean existsOfAtmosphere() {
        return atmosphere;
    }

    @Override
    public int whatAverageTemp() {
        return averageTemp;
    }
}