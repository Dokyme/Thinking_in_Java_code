package initialization;

/**
 * Created by zdk on 17-1-31.
 */

class Other {
    public static void main(String[] args) {
        for (String s : args)
            System.out.print(s + " ");
    }
}

public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[]{"fiddle", "de", "dum"});
    }
}
