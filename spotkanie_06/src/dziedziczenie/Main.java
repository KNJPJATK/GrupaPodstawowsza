package dziedziczenie;

/**
 * Created by Kamil on 2015-11-27.
 */
public class Main {

    public static void main(String[] args){
        Dziedziczenie d = new Dziedziczenie();
        d.x = 5;

        Kompozycja k = new Kompozycja();
        k.center.x = 5;
    }
}
