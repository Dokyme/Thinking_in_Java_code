package initialization;

/**
 * Created by zdk on 17-2-1.
 */
public class OptionalTrailingArguments {
    static void f(int required, String... trailing) {
        System.out.print("required: " + required + " ");
        for (String s : trailing)
            System.out.print(s + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        f(1, "one");
        f(2, "two", "treee");
        f(0);
    }
}
