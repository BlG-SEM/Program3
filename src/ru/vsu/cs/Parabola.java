package ru.vsu.cs;

public class Parabola {
    public double a;
    public double b;
    public double c;

    public Parabola(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isPointInside(Point point) {
        return point.getY() > a * Math.pow(point.getX(), 2) + b * point.getX() + c;
    }
}
