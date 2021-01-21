package io.github.superslowjelly.assignment51;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.5, 5.5);
        StringBuilder output = new StringBuilder();
        output.append("Rectangle:")
                .append("\n\tWidth - ").append(rectangle.getWidth()).append("cm.")
                .append("\n\tHeight - ").append(rectangle.getHeight()).append("cm.")
                .append("\n\tPerimeter - ").append(rectangle.getPerimeter()).append("cm.")
                .append("\n\tArea - ").append(rectangle.getArea()).append("cm².");
        System.out.println(output);
    }

}
