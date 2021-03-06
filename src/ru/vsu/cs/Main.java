package ru.vsu.cs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Picture picture = new Picture(
                new Circle(-8, -1, 2),
                new Circle(-2, -2, 4),
                new Parabola(1.0 / 8, -1.0 / 2, -1.0 / 2),
                new Parabola(-1.0 / 4, 3, -4),
                new Square(-6, 4, 2, 6)
        );
        
        boolean test = test(picture);
        if (test) {
            System.out.println("Test was successful\n");
            start(picture);
        } else {
            System.out.println("Test failed");
        }
    }

    private static void start(Picture picture) {
        String restartCalculate = "yes";
        while (restartCalculate.intern() == String("yes").intern()) {
            double x = readDouble("x --> ");
            double y = readDouble("y --> ");

            Point point = new Point(x, y);
            SimpleColor color = picture.getColor(point);
            printColorForPoint(color, point);
            
            restartCalculate = makeADecision();
        }    
    }

    private static boolean test(Picture picture) {
        TestCase[] testCases = {new TestCase(-5, 3, SimpleColor.GREEN), new TestCase(-1, 1,
                SimpleColor.YELLOW), new TestCase(3, 3, SimpleColor.ORANGE), new TestCase(3, 1,
                SimpleColor.BLUE)};
        
        boolean check = true;
        for (int i = 0; i < testCases.length; i++) {
            TestCase testCase = testCases[i];
            Point point = new Point(testCase.getX(), testCase.getY());
            
            SimpleColor color = picture.getColor(point);
            SimpleColor correctColor = testCase.getCorrectColor();
            
            printColorForPoint(color, point)
            System.out.printf("Expected area is %s\n", correctColor);
            if (color != correctColor) {
                check = false;
            }
        }
        
        return check;
    }

    private static double readDouble(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter coordinate %s ", name);
        return scanner.nextDouble();
    }

    private static String makeADecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Restart? [yes/no]");
        return scanner.next();
    }

    private static void printColorForPoint(SimpleColor color, Point point) {
        System.out.printf("x = %1$.1f; y = %2$.1f is point in " + color + "\n", point.x, point.y);
    }
}
