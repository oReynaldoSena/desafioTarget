import java.util.Scanner;

public class VerificaLetraA {

    public static void main(String[] args) {
        // inicio o Scanner para receber a String que o usuário irá informar
       Scanner scanner = new Scanner(System.in);

       System.out.println("Informe uma String: ");
       String input = scanner.nextLine();

       //Inicializando o contador (ele irá computar o aparecimento de As)
       int contador = 0;

       //iteração com cada caractere da string
        for (int i = 0; i < input.length(); i++ ){
            char caractere = input.charAt(i);
            // a variável caractere armazena cada um dos itens da string para que se verifique se é ou não um A

            // verificando se é ou não um A (maiúsculo ou minúsculo)
            if (caractere == 'a' || caractere == 'A'){
                contador++;

            }
        }

        if (contador > 0){
            System.out.println("A letra a aparece exatamente " + contador + " vezes");
        }
        else {
            System.out.println("A letra A não aparece na String");
        }
        scanner.close();

    }
}
