/**
 * Created by Kamil on 2015-11-08.
 */
public class Person {
    String name;

    Person(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

    public static void main(String[] args){
        System.out.println(new Person("Małgorzata"));
    }
}
