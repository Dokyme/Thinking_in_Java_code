package polymorphism.music;

/**
 * Created by zdk on 17-2-4.
 */
public class Wind extends Instrument{
    public void play(Note n) {
        System.out.println("Wind.play()" + n);
    }
}
