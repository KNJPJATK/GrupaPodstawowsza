/**
 * Created by Kamil on 2015-11-19.
 */
public class Spotkanie05 {

    public static void main(String[] args){

        // Zmienne instancyjne przechowują stan obiektu.
        // Metody umożliwiają zmienianie stanu.

        // Enkapsulacja danych, hermetyzacja:
        // * zmienne instancyjne powinny być oznaczone jako private
        // * jeśli potrzebny jest dostęp do tych zmiennych, możemy udostępnić gettery/settery.

        // przykład gettera:
        public double getSaldo(){
            return saldo;
        };

        // setter:
        public double setSaldo(double saldo){
            this.saldo = saldo;
        }

        // W klasie konto nie mamy settera, ponieważ:
        // zgodnie z zasadą enkapsulacji, wszelkie operacje na zmiennej 'saldo' powinna wykonywać klasa Konto
        // (to jest jej odpowiedzialność)

        // Aby zaimplementować wpłaty/wypłaty
        // nie powinnno się tego robić w jakimś zewnętrznym kodzie, który: pobiera saldo z settera, dodaje/zmniejsza saldo, a następnie ustawia nowe saldo.
        // Powwinno się tę funkcjonalność umieścić w klasie Konto, np. w dwóch metodach: wplac(double kwota) oraz wyplac(double kwota)




        // Obiekt niemutowalny - nie zmienia stanu:
        // - Wartość ustalamy w konstruktorze, i tylko tam.
        // - żadnej z metod obiektu nie wolno zmieniać jego stanu. W szczególności: obiekt nie może mieć setterów.



        // Override
        // Pisząc własną implementację metody equals() musimy przeimplementować także hashCode

    }
}
