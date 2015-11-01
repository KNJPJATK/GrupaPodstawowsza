
/**
 * Created by Kamil on 2015-10-22.
 */
public class Dates {

    static int[] days = {31, 28, 31, 30};

    public static void main(String[] args){
        if (args.length==0){
            System.out.println("Podaj miesiąc i dzień");
            return;
        }
        int dzien = Integer.parseInt(args[1]);
        int miesiac = Integer.parseInt(args[0]);

        System.out.println(
                "Liczba dni od początku roku: " + getTotalDays(miesiac, dzien)
        ); //TDD
    }

    public static int getTotalDays(int miesiac, int dzien){

        int suma = 0;
        for (int a=1; a<miesiac; a++){
            suma += days[a-1];
        }
        return suma + dzien;
    }
}
