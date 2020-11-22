package isa.utm.Figure;

public class Square extends Figure {
    public Square(double size) {
        super.perimeter = 4 * size;
        super.area = size * size;
    }
}
