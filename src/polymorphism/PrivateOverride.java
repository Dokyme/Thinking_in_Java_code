package polymorphism;

/**
 * Created by zdk on 17-2-4.
 */
public class PrivateOverride {
    private void f() {
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}

class Derived extends PrivateOverride {

    public void f() {
        System.out.println("public f()");
    }
}
