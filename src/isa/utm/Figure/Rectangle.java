package isa.utm.Figure;

public class Rectangle extends Figure {
    public Rectangle(double length, double width) {
        super.perimeter = 2 * (length + width);
        super.area = length * width;
    }
}
