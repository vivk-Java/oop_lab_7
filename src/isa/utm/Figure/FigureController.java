package isa.utm.Figure;

import java.util.ArrayList;

public class FigureController {
    public Figure getBiggestPerimeter(ArrayList<Figure> figures) {
        if (figures.size() == 0) {
            return null;
        }

        Figure figure = figures.get(0);

        for (Figure value : figures) {
            if (value.perimeter > figure.perimeter) {
                figure = value;
            }
        }

        return figure;
    }

    public Figure getBiggestArea(ArrayList<Figure> figures) {
        if (figures.size() == 0) {
            return null;
        }

        Figure figure = figures.get(0);

        for (Figure value : figures) {
            if (value.area > figure.area) {
                figure = value;
            }
        }

        return figure;
    }
}
