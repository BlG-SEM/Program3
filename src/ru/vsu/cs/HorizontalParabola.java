package ru.vsu.cs;

public class HorizontalParabola {
    public double a;
    public double b;
    public double c;

    public Parabola(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isPointInside(Point point) {
        return point.getX() > a * Math.pow(point.getY(), 2) + b * point.getY() + c;
    }
}
