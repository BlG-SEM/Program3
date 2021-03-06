package ru.vsu.cs;

public class Picture {
    private final Circle circle1;
    private final Circle circle2;
    private final VerticalParabola parabola1;
    private final HorizontalParabola parabola2;
    private final Square square;

    public Picture(Circle circle1, Circle circle2, VerticalParabola parabola1, HorizontalParabola parabola2, Square square) {
        this.circle1 = circle1;
        this.circle2 = circle2;
        this.parabola1 = parabola1;
        this.parabola2 = parabola2;
        this.square = square;
    }

    public SimpleColor getColor(Point point) {
        
        if (circle2.isPointInside(point) && parabola1.isPointInside(point)) {
            return SimpleColor.YELLOW;
        }
        if (square.isPointInside(point) && parabola1.isPointInside(point) || circle1.isPointInside(point) || circle2.isPointInside(point)) {
            return SimpleColor.ORANGE;
        } 
        if (square.isPointInside(point)) {
            return SimpleColor.GREEN;
        }  
        if (parabola1.isPointInside(point)) {
            return SimpleColor.BLUE;
        }
        return SimpleColor.YELLOW;        
    }
}
