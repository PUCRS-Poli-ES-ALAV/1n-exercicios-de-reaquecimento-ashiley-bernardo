// Inversão de uma string.

public class exercicio4 {
    public static void main(String[] args) {
        
        // String resultado = inverteString("abcdefghijklmnopq", 17);
        String resultado = inverteString2("abjhgjc");
        System.out.println(resultado);
    }

    public static String inverteString(String a, int qtd){
        if (qtd > 0) {
            char aux = a.charAt(qtd-1);
            return String.valueOf(aux) + inverteString(a, qtd - 1);
        }
        else return "";
    }

    public static String inverteString2(String a){
        if (a != "") {
            int len = a.length() - 1;
            String aux = a.substring(0, len);
            System.out.println(aux);
            return a.charAt(len) + inverteString2(aux);
        }
        else return "";
    }
}