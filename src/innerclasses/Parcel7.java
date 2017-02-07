package innerclasses;

/**
 * Created by zdk on 17-2-7.
 */
public class Parcel7 {
    public Contents contents() {
        return new Contents() {
            private int i;

            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
    }
}
