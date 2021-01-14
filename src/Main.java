import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {


    public static void main(String[] args) {


        int a = 0; // диапазон рандомных чисел
        int b = 4; // для добавления объектов в список

        int c = 0; // диапазон рандомных чисел для
        int d = 10;// параметров фигур


        String[] array = {"чёрный", "белый", "зелёный", "жёлтый"};


        List<Shape> shapeList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int random = a + (int) (Math.random() * b);
            int random1 = c + (int) (Math.random() * d);
            int random3 = (int) (Math.random() * 4);
            switch (random) {
                case 0:
                    shapeList.add(new Square(array[random3], random1));
                    break;
                case 1:
                    shapeList.add(new Circle(array[random3], random1));
                    break;
                case 2:
                    shapeList.add(new Trapezoid(array[random3], random1));
                    break;
                case 3:
                    shapeList.add(new Triangle(array[random3], random1));
                    break;
            }
        }
        for (Object o : shapeList) {
            System.out.println(o);
        }
    }
}
