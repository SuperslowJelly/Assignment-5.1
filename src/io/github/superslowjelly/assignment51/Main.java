package io.github.superslowjelly.assignment51;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.5, 5.5);
        String output = "Rectangle:" +
                "\n\tWidth - " + rectangle.getWidth() + "cm." +
                "\n\tHeight - " + rectangle.getHeight() + "cm." +
                "\n\tPerimeter - " + rectangle.getPerimeter() + "cm." +
                "\n\tArea - " + rectangle.getArea() + "cm².";
        System.out.println(output);
    }

}
