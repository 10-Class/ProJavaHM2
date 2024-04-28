package org.example.lesson2.figure;

public class FigureTester {
    public static void main(String[] args) {
        Figure[] figures = {
                new Rectangle(1, 2),
                new Rectangle(2, 3),
                new Circle(1),
                new Triangle(3, 4, 5), // homework
                new Triangle(6, 8, 10) // homework
        };

        System.out.println("area: " + calculateArea(figures));


        // HOMEWORK ----------------------------------
        Triangle first = new Triangle(3, 4, 5);
        Triangle second = new Triangle(6, 8, 10);

        System.out.println("площадь треугольника first: " + first.area());
        System.out.println("площадь треугольника second: " + second.area());

        System.out.println("perimeter: " + calculatePerimeter(figures));

    }

    public static double calculatePerimeter(Figure[] figs) {
        double perimeter = 0;
        for (int i = 0; i < figs.length; i++) {
            perimeter += figs[i].perimeter();
        }
        return perimeter;
    }


    //    ---------------------------------------------------------
    public static double calculateArea(Figure[] figs) {
        double area = 0;
        for (int i = 0; i < figs.length; i++) {
            area += figs[i].area();
        }
        return area;
    }

}
