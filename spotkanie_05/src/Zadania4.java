import java.util.Random;

/**
 * Powtorzenie
 * Praca domowa z 5.11.2015r na 19.11
 * Za tydzien (12.11) dokładka!
 */
public class Zadania4 {

    /**
     * Zadanie
     *
     * Zaimplementuj metodę sprawdzającą czy dostarczona jako argument tablica znaków
     * typu char jest palindromem. Rezultat operacji zwróć jako wartość typu logicznego
     * boolean. Poprawność działania przetestuj na przykładach.
     */
    public static void zad4_1() {
        char[] jestPalindrom1 = "kajak".toCharArray();
        char[] jestPalindrom2 = "zakopanenapokaz".toCharArray();
        char[] nieJestPalindrom1 = "kajk".toCharArray();
        char[] nieJestPalindrom2 = "ikarlapieraki".toCharArray();

        System.out.println("jestPalindrom1: " + isPalindrome(jestPalindrom1));
        System.out.println("jestPalindrom2: " + isPalindrome(jestPalindrom2));
        System.out.println("nieJestPalindrom1: " + isPalindrome(nieJestPalindrom1));
        System.out.println("nieJestPalindrom2: " + isPalindrome(nieJestPalindrom2));
    }

    private static boolean isPalindrome(char[] s) {
        if (s.length % 2 == 0)
            return false;

        for (int i = 0; i < s.length / 2; i++) {
            if (s[i] != s[s.length - i - 1])
                return false;
        }
        return true;
    }

    /**
     * Zadanie
     *
     * Napisz funkcję która na wejściu bierze liczbę n
     * i wyswietli słowo Wo...ow z n 'o' między W a w.
     *
     * np. dla n = 1 będzie 'Wow'
     * dla n = 3, 'Wooow'
     */
    public static void zad4_2() {
        System.out.println("dla n=1 powinno być Wow: " + wow(1));
        System.out.println("dla n=3 powinno być Wooow: " + wow(3));
    }

    private static String wow(int n){
        StringBuffer sb = new StringBuffer("W");
        for (int i=0; i<n; i++)
            sb.append('o');
        sb.append("w");
        return sb.toString();
    }

    /**
     * Zadanie
     *
     * Jaki będzie rezultat poniższego poprawnie kompilującego się programu? (zadanie
     * rozwiąż na kartce)
     *
     * To zadanie jest dla was i dla waszego zrozumienia kodu!
     * Odpalcie je tylko po to aby sprawdzic.
     */
    public static void zad4_3() {
        fun ('n') ;
    }

    public static void fun (char znak) {
        System.out.println(znak);
        if (znak > 'a' && znak < 'z')
            fun ((char)(znak-1));
    }

    /**
     * Zadanie
     *
     * Przygotuj jednowymiarową tablicę zmiennych typu char zawierającą wylosowane znaki
     * z przedziału ’a’ do ’z’. Następnie napisz program liczący ile wyrazów “ala” wystąpiło w tej tablicy.
     *
     * Do pseudolosowsci uzyjcie klasy Random lub Math.random.
     * W jaki sposob wylosowac chary? Do wygooglania :)
     * Przypominamy, ze znaki sa zapisane w kodzie ASCII
     * Googlamy czym jest kod ascii!
     *
     * Probujcie z roznymi rozmiarami tablicy.
     */
    public static void zad4_4() {
        char[] tab = randomChars(5);
        int count = new String(tab).split("ala").length -1;
        System.out.println("" + new String(tab) + ", " + count);
    }

    private static char[] randomChars(int size){
        char[] tab = new char[size];
        Random r = new Random();
        for (int i=0; i<size; i++)
            tab[i] = (char)(97 + r.nextInt(26));
        return tab;
    }

    public static void main(String[] args) {

        //zad4_1();

        //-------------------------------------

        //zad4_2();

        //-------------------------------------

        //zad4_3();

        //-------------------------------------

        //zad4_4();
    }

}