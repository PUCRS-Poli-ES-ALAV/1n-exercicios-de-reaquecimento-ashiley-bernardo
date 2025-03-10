// Cálculo de 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.

public class exercicio3 {
    public static void main(String[] args) {
        
        double resultado = divideSucessivamente(5);
        System.out.println(resultado);
    }

    public static double divideSucessivamente(double n){
        if (n > 0) {
            return (1 / n) + divideSucessivamente(n - 1);
        } else return 0;
    }
}