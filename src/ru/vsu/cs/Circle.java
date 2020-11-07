package ru.vsu.cs;

public class Circle {
    public double a;
    public double b;
    public double r;

    public Circle(double a, double b, double r) {
        this.a = a;
        this.b = b;
        this.r = r;
    }

    public boolean isPointInside(Point point) {
        return Math.pow(r, 2) > Math.pow((point.getX() - a), 2) + Math.pow((point.getY() - b), 2);
    }
}
