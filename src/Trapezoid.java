public class Trapezoid implements Shape {

    String color;
    double side1, side2;
    double height;
    double s;

    public Trapezoid(String color, double height) {
        this.color = color;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("I am Trapezoid");
    }

    @Override
    public double getSquared() {
        side1 = 5 + (int) (Math.random() * 15);
        side2 = 5 + (int) (Math.random() * 15);
        s = ((side1 + side2) / 2) * height;
        return s;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Фигура: трапеция," + " площадь: " + getSquared() + ", высота: " + height + ", цвет: " + getColor();
    }
}
