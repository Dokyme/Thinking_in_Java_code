package access;

/**
 * Created by zdk on 17-2-2.
 */

class Sundae {
    private Sundae() {
    }

    static Sundae makeASundae() {
        return new Sundae();
    }
}

public class IceCream {
    public static void main(String[] args) {
        Sundae x = Sundae.makeASundae();
    }
}
