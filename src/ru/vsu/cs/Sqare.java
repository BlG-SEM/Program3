package ru.vsu.cs

public class Square {
    public boolean isPointInside(double x, double y, double a) {
        return (x >= -a) && (x <= a - 2) && (y >= a - 4) && (y <= a);
    }
}
