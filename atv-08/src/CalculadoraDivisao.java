import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculadoraDivisao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int primeiroNumero = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int segundoNumero = scanner.nextInt();

            if (segundoNumero == 0) {
                System.out.println("Não é possível dividir por zero.");
            } else {
                int resultado = primeiroNumero / segundoNumero;
                System.out.println("Resultado: " + resultado);
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu um erro aritmético.");
        } finally {
            scanner.close();
        }
    }
}
