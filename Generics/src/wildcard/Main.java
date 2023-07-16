package wildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void drawShapes(List<? extends Shape> shapes) {
        for(Shape shape : shapes) {
            shape.draw();
        }
    }
    public static void main(String[] args) {
        List<Square> list1 = new ArrayList<Square>();
        list1.add(new Square());
        drawShapes(list1);

        List<Circle> list2 = new ArrayList<Circle>();
        list2.add(new Circle());
        list2.add(new Circle());
        drawShapes(list2);
    }
}
