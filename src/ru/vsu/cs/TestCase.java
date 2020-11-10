package ru.vsu.cs;

public class TestCase {
    private final double x;
    private final double y;
    private final SimpleColor correctColor;

    public TestCase(double x, double y, SimpleColor correctColor) {
        this.x = x;
        this.y = y;
        this.correctColor = correctColor;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    SimpleColor getCorrectColor() {
        return correctColor;
    }
}
