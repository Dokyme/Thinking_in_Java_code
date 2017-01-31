package initialization;

/**
 * Created by zdk on 17-1-31.
 */

public class VarArgs {
    static void printArray(Object... args) {
        for (Object obj : args)
            System.out.print(obj + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[]{
                new Integer(47),
                new Float(3.14),
                new Double(11.11)
        });
        printArray(47, 3.14F, 11.11);
        printArray(new Object[]{"one", "two", "three"});
        printArray(new Object[]{new A(), new A(), new A()});
        printArray((Object[]) new Integer[]{1, 2, 3, 4});
        printArray();
    }
}

