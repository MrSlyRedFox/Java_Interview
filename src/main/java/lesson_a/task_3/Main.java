package lesson_a.task_3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        Figure figure;

        figure = circle;
        figure.show();

        figure = square;
        figure.show();

        figure = triangle;
        figure.show();
    }
}
