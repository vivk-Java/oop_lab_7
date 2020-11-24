package isa.utm;

import isa.utm.Figure.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<Figure>();
        FigureController figureController = new FigureController();

        figures.add(new Square(4));
        figures.add(new Rectangle(2.5f, 6));
        figures.add(new Triangle(5, 5, 3));

        Figure biggestPerimeter = figureController.getBiggestPerimeter(figures);
        Figure biggestArea = figureController.getBiggestArea(figures);

        println("Biggest Area : " +
                biggestArea.getClass().getSimpleName() + " : " +
                biggestArea.getArea());
        println("Biggest Perimeter : " +
                biggestPerimeter.getClass().getSimpleName() + " : " +
                biggestPerimeter.getPerimeter());



        /*
        class Circle extends Figure {
            public Circle(double radius) {
                super.perimeter = 2 * Math.PI * radius;
                super.area = Math.PI * radius * radius;
            }
        }
        */

        double circleRadius = 10;

        figures.add(new Figure() {
            @Override
            public double getArea() {
                return Math.PI * circleRadius * circleRadius;
            }

            @Override
            public double getPerimeter() {
                return 2 * Math.PI * circleRadius;
            }
        });

        biggestArea = figureController.getBiggestArea(figures);
        println("Biggest Area after Circle add : " +
                biggestArea.getClass().getSimpleName() + " : " +
                biggestArea.getArea());

    }

    private static void println(Object o) {
        System.out.println(o.toString());
    }
}
