public class Main {
    public static void main(String[] args) {
        System.out.println("Regressao com for:");
        regressaoComFor(10);

        System.out.println("Regressao com recursao:");
        regressaoComRecursao(10);
    }

    private static void regressaoComFor(int valor) {
        for (int i = valor; i > 0; i--) {
            System.out.println(i);
        }
    }

    private static void regressaoComRecursao(int valor) {
        System.out.println(valor);

        if (valor > 0)
            regressaoComRecursao(valor - 1);
    }
}