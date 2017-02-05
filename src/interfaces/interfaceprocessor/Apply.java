package interfaces.interfaceprocessor;

/**
 * Created by zdk on 17-2-5.
 */
public class Apply {
    public static void process(Processor p, Object a) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(a));
    }
}
