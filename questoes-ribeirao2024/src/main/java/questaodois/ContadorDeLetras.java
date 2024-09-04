package questaodois;

public class ContadorDeLetras {

    public static void main(String[] args) {
        String palavrasParaContar = "Pera e banana";
        int contador = contadorLetraA(palavrasParaContar);
        System.out.println("A letra -=A=- aparece " + contador + " vezes no texto informado.");
    }

    public static int contadorLetraA(String cnt) {
        int contador = 0;
        for (int i = 0; i < cnt.length(); i++) {
            char c = cnt.charAt(i);
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }
        return contador;
    }
}
