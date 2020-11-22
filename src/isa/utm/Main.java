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

        class Circle extends Figure {
            public Circle(double radius) {
                super.perimeter = 2 * Math.PI * radius;
                super.area = Math.PI * radius * radius;
            }
        }

        figures.add(new Circle(5));

        biggestArea = figureController.getBiggestArea(figures);
        println("Biggest Area after Circle add : " +
                biggestArea.getClass().getSimpleName() + " : " +
                biggestArea.getArea());

    }

    private static void println(Object o) {
        System.out.println(o.toString());
    }
}
