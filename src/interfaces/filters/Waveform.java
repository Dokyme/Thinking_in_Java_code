package interfaces.filters;

/**
 * Created by zdk on 17-2-5.
 */
public class Waveform {
    private static long counter;
    private final long id=counter++;
    public String toString(){
        return "Waveform "+id;
    }
}


