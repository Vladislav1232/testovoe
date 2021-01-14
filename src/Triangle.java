public class Triangle implements Shape {

    String color;
    double side1, side2, side3;
    double semiPerimeter;
    double square;

    public Triangle(String color, double semiPerimeter) {
        this.color = color;
        this.semiPerimeter = semiPerimeter;

    }

    @Override
    public void draw() {
        System.out.println("I am triangle");
    }

    @Override
    public double getSquared() {
        side1 = 5 + (int) (Math.random() * 15);
        side2 = 5 + (int) (Math.random() * 15);
        side3 = 5 + (int) (Math.random() * 15);

        semiPerimeter = (side1 + side2 + side3) / 2;
        square = semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3);
        return Math.sqrt(square);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Фигура: треугольник," + " площадь: " + getSquared() + ", полумериметр: " + semiPerimeter +
                ", цвет: " + getColor();
    }
}
