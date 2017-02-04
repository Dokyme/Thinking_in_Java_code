package polymorphism;

import polymorphism.Shape.RandomShapeGenerator;
import polymorphism.Shape.Shape;

import java.util.Random;

/**
 * Created by zdk on 17-2-4.
 */
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++)
            s[i] = gen.next();
        for (Shape shp : s)
            shp.draw();
    }
}
