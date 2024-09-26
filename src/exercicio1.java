import java.util.Scanner;

public class exercicio1 {

    // Função para verificar se o número informado pertence à sequência de Fibonacci
    public static boolean isFibonacci(int n) {
        // Inicializando os dois primeiros números da sequência
        int a = 0, b = 1, c = 0;

        // Gerando a sequência até que o valor seja maior ou igual a 'n'
        while (c < n) {
            c = a + b;
            a = b;
            b = c;
        }

        // Verifica se o número informado é igual ao último valor calculado
        return c == n || n == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Como o número poderia ser obtido através de qualquer entrada, decidi solicitar ao usuário
        // e usar o Scanner para ler o número fornecido.
        System.out.print("Informe um número: ");
        int number = scanner.nextInt();

        // Verificando se o número pertence à sequência de Fibonacci
        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
