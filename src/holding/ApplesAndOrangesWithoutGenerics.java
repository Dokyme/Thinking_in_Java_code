package holding;

import interfaces.interfaceprocessor.Apply;

import java.util.ArrayList;

/**
 * Created by zdk on 17-2-11.
 */

class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}

class Orange {
}

public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apple = new ArrayList();
        for (int i = 0; i < 3; i++)
            apple.add(new Apple());
        apple.add(new Orange());
        for (int i = 0; i < apple.size(); i++)
            ((Apple) apple.get(i)).id();
    }
}
