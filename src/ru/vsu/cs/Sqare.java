package ru.vsu.cs;

public class Sqare {
    public double a;
    public double b;
    public double c;
    public double d;

    public Sqare(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public boolean isPointInside(Point point) {
        return (point.getX() >= a) && (point.getX() <= b) && (point.getY() >= c) && (point.getY() <= d);
    }
}
