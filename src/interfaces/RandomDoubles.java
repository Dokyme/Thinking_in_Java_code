package interfaces;

import java.util.Random;

/**
 * Created by zdk on 17-2-6.
 */
public class RandomDoubles {
    private static Random rand = new Random(47);

    public double next() {
        return rand.nextDouble();
    }

    public static void main(String[] args) {
        RandomDoubles rd = new RandomDoubles();
        for (int i = 0; i < 7; i++)
            System.out.print(rd.next() + " ");
    }
}
