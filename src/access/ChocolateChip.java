package access;

import access.dessert.Cookie;

/**
 * Created by zdk on 17-2-2.
 */
public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("ChocolateChip constructor");
    }

    public void chomp() {

    }

    public static void main(String[] args) {
        ChocolateChip chocolateChip = new ChocolateChip();
        chocolateChip.chomp();
    }
}
