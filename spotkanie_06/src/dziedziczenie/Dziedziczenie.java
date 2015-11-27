package dziedziczenie;

/**
 * Created by Kamil on 2015-11-27.
 */
public class Dziedziczenie extends Point implements ICircle {
    int r;

    public Point getCenter(){
        return this;
    }
}
