package ru.vsu.cs;

public class Picture {
    private final Circle circle1;
    private final Circle circle2;
    private final VerticalParabola parabola1;
    private final HorizontalParabola parabola2;
    private final Sqare sqare;

    public Picture(Circle circle1, Circle circle2, VerticalParabola parabola1, HorizontalParabola parabola2, Sqare sqare) {
        this.circle1 = circle1;
        this.circle2 = circle2;
        this.parabola1 = parabola1;
        this.parabola2 = parabola2;
        this.sqare = sqare;
    }

    public SimpleColor getColor(Point point) {

    
    }
}
