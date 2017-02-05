package interfaces.filters;

/**
 * Created by zdk on 17-2-5.
 */
public class Filter{
    public String name(){
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input){
        return input;
    }
}
