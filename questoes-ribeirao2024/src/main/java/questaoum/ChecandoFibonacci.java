package questaoum;

public class ChecandoFibonacci {

    public static void main(String[] args) {
        int numero = 53;
        if (FibonacciOuNao(numero)) {
            System.out.println("O número " + numero + ", pertence a sequência.");
        } else {
            System.out.println("O número " + numero + ", não Pertence a sequência");
        }
    }

    public static boolean FibonacciOuNao(int n) {
        int x = 0, y = 1;
        while (y < n) {
            int index = y;
            y = x + y;
            x = index;
        }
        return (y == n || n == 0);
    }
}
