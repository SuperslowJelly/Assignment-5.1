package io.github.superslowjelly.assignment51;

public class Rectangle {

    public Rectangle(double width, double height) {
        this.WIDTH = width;
        this.HEIGHT = height;
    }

    private final double WIDTH;

    private final double HEIGHT;

    public double getWidth() {
        return WIDTH;
    }

    public double getHeight() {
        return HEIGHT;
    }

    public double getArea() {
        return WIDTH * HEIGHT;
    }

    public double getPerimeter() {
        return (2 * WIDTH) + (2 * HEIGHT);
    }

}
