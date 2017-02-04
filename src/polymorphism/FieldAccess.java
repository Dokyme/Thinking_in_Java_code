package polymorphism;

/**
 * Created by zdk on 17-2-4.
 */

class Super {
    public int field = 0;

    public int getField() {
        return field;
    }
}

class Sub extends Super {
    public int field = 3;

    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }

    public int invokeSuperGetField(){
        return super.getField();
    }
}

public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println("sup.filed = " + sup.field + ", sup.getField() = " + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field = " + sub.field + ", sub.getField() = " + sub.getField() + ", sub.getSuperField() = " + sub.getSuperField()+", sub.invokeSuperGetField() = "+sub.invokeSuperGetField());
    }
}
