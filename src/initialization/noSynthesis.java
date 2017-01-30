package initialization;

/**
 * Created by zdk on 17-1-30.
 */

class Bird2{
    Bird2(int i){}
    Bird2(double d){}
}
public class noSynthesis {
    public static void main(String[] args){
        Bird2 b2=new Bird2(1);
        Bird2 b3=new Bird2(1.0);
    }
}
