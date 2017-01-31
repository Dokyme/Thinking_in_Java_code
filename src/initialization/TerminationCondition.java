package initialization;

/**
 * Created by zdk on 17-1-31.
 */

class Book{
    boolean checkOuted=false;
    Book(boolean checkOut){
        checkOuted=checkOut;
    }
    void checkIn(){
        checkOuted=false;
    }
    protected void finalize(){
        if(checkOuted)
            System.out.println("Error :checked out");
    }
}

public class TerminationCondition {
    public static void main(String[] args){
        Book novel=new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();
    }
}
