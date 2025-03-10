// Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4).

public class exercicio1 {
    public static void main(String[] args) {
        
        int resultado = multiplica(7,90);
        System.out.println(resultado);
    }

    public static int multiplica(int a, int b){
        if (b > 0) {
            return a + multiplica(a, b-1);
        } else return 0;
    }
}