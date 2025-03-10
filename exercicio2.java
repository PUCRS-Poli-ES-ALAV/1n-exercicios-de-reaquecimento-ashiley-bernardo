// Soma de dois números naturais, através de incrementos sucessivos (Ex.: 3 + 2 = + + (+ + + 1)).

public class exercicio2 {
    public static void main(String[] args) {
        
        int resultado = soma(7,10);
        System.out.println(resultado);
    }

    public static int soma(int a, int b){
        if (a > 0) {
            return 1 + soma(a - 1, b);
        } else if (b > 0) {
            return 1 + soma(a, b - 1);
        } else return 0;
    }
}