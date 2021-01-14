public class Square implements Shape {

    String color;
    double side;

    public Square(String color, double side) {
        this.color = color;
        this.side = side;

    }

    @Override
    public void draw() {
        System.out.println("I am square");
    }

    @Override
    public double getSquared() {
        return side * side;
    }


    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Фигура: квадрат, " + "площадь: " + getSquared() + ", длина стороны: " + side + ", цвет: " + getColor();
    }
}
