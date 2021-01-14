public class Circle implements Shape {

    String color;
    double radius;


    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("I am circle");
    }

    @Override
    public double getSquared() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Фигура: круг, " + "площадь: " + getSquared() + ", радиус: " + radius + ", цвет: " + getColor();

    }
}
