public class ExercicioIndice {


        public static void main(String[] args) {
            int INDICE = 12, SOMA = 0, K = 1;

            // Enquanto K for menor que INDICE, faça:
            // é um laço de repetição do tipo "WHILE"
            while (K < INDICE) {
                K = K + 1;  // Incrementa K
                SOMA = SOMA + K;  // Soma o valor de K à variável SOMA
            }

            // Imprime o valor da soma
            System.out.println("O valor de SOMA é: " + SOMA);
        }
    }

