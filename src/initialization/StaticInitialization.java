package initialization;

/**
 * Created by zdk on 17-1-31.
 */

class Bowl {
    Bowl(int marker) {
        System.out.println("Bowl(" + marker + ")");
    }

    void f1(int marker) {
        System.out.println("f1(" + marker + ")");
    }
}

class Table {
    static Bowl bowl1 = new Bowl(1);

    Table() {
        System.out.println("Table()");
        bowl2.f1(1);
    }

    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }

    static Bowl bowl2 = new Bowl(2);
}

class Cupborad {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    Cupborad() {
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }

    void f3(int marker) {
        System.out.println("f3(" + marker + ")");
    }

    static Bowl bowl5=new Bowl(5);
}

public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println("Creating new Cupborad() in main");
        new Cupborad();
        System.out.println("Creating new Cupboard() in main");
        new Cupborad();
        table.f2(1);
        cupborad.f3(1);
    }

    static Table table = new Table();
    static Cupborad cupborad = new Cupborad();
}

