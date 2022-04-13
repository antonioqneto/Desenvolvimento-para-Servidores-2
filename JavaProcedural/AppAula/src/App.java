//import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Scanner leitor = new Scanner(System.in);
         * 
         * System.out.println("Digite um valor");
         * double valor = leitor.nextDouble();
         * 
         * System.out.printf("Voce digitou %.2f\n", valor);
         * System.out.println("Finalizou");
         * 
         * leitor.close();
         */

        Integer a = 10, b = 20;

        System.out.println("OPERADORES ARITMÉTICOS\n");
        System.out.printf("A soma de %d e %d é %d\n", a, b, (a + b));
        System.out.printf("A subtração de %d e %d é %d\n", a, b, (a - b));
        System.out.printf("A divisão de %d e %d é %d\n", a, b, (a / b));
        System.out.printf("A multiplicação de %d e %d é %d\n", a, b, (a * b));
        System.out.printf("O resto entre %d e %d é %d\n\n", a, b, (a % b));

        System.out.println("OPERADORES RELACIONAIS - Resultado será Booleano\n");
        System.out.printf("A comparação > entre %d e %d é %B\n", a, b, (a > b));
        System.out.printf("A comparação < entre %d e %d é %B\n", a, b, (a < b));
        System.out.printf("A comparação >= entre %d e %d é %B\n", a, b, (a >= b));
        System.out.printf("A comparação <= entre %d e %d é %B\n", a, b, (a <= b));
        System.out.printf("A comparação == entre %d e %d é %B\n", a, b, (a == b));
        System.out.printf("A comparação != entre %d e %d é %B\n\n", a, b, (a != b));

        System.out.println("OPERADORES LOGICOS - só trabalham com valores lógicos\n");
        Boolean c = true, d = false;
        System.out.printf("A comparação && entre %B e %B é %B\n", c, d, (c && d));
        System.out.printf("A comparação || entre %B e %B é %B\n", c, d, (c || d));
        System.out.printf("A comparação ! entre %B e %B é %B\n", c, d, !(c && d));
        System.out.printf("A comparação ^ entre %B e %B é %B\n\n", c, d, (c ^ d));

        System.out.println("Incrementos e decrementos");// incrementos e decrementos
        System.out.printf("O incremento ++ de %d é %d\n", a, a++);
        System.out.printf("O decremento -- de %d é %d\n", b, b++);
        System.out.printf("O operador += entre %d e %d é %d\n", a, b, (a += b));
        System.out.printf("O operador -= entre %d e %d é %d\n", a, b, (a -= b));
        System.out.printf("O operador *= entre %d e %d é %d\n", a, b, (a *= b));
        System.out.printf("O operador /= entre %d e %d é %d\n", a, b, (a /= b));
        System.out.println("O operador %= entre " + b + " e " + b + " é " + (b %= a));

    };
}
