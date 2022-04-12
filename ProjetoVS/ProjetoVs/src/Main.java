public class Main {
    public static void main(String[] args) throws Exception {
//        System.out.println("Tipos de Dados Java");
//        System.out.println("-------------------");
//        System.out.printf("Byte: %d bytes - %d até %d.\n", Byte.BYTES, Byte.MIN_VALUE, Byte.MAX_VALUE);
//        System.out.printf("Short: %d bytes - %d até %d.\n", Byte.BYTES, Short.MIN_VALUE, Short.MAX_VALUE );
//        System.out.printf("Integer: %d bytes - %d até %d.\n", Integer.BYTES, Integer.MIN_VALUE, Integer.MAX_VALUE );
//        System.out.printf("Long: %d bytes - %d até %d.\n", Long.BYTES, Long.MIN_VALUE, Long.MAX_VALUE);
//        System.out.printf("Float: %d bytes -  %f até %f.\n", Float.BYTES, Float.MIN_VALUE, Float.MAX_VALUE);
//        System.out.printf("Double: %d bytes - De %f até %f.\n", Double.BYTES, Double.MIN_VALUE, Double.MAX_VALUE);
//        System.out.printf("Boolean: %B e %B.\n", Boolean.FALSE, Boolean.TRUE);
//        System.out.printf("Char: %d bytes.\n", Character.BYTES);

        //Saída de dados

//        //print()
//        System.out.print("Linha 1");
//        System.out.print("Linha 2");
//        System.out.print("Linha 3");
//        //println()
//        System.out.println("Linha 4");
//        //printf()
//        System.out.printf("Sou uma String formatada!\nNumero: %d\n", 2 + 2);
//        System.out.printf("%s NUMERO %d\n", "String", 10^2);
//    String frase  = String.format("A linguagem %s é a mais %s de todas!. O %s é um %s", "Ruby", "birosca", "PHP", "birosco");
//        System.out.println(frase);

        //DESAFIO - TABELA VERDADE EM PRINTF
        System.out.println("TABELA VERDADE OPERADOR \"E\"");
        System.out.printf("V e V = %s\n", (true && true ? "V" : "F"));
        System.out.printf("V e F = %s\n", (true && false ? "V" : "F"));
        System.out.printf("F e V = %s\n", (false && true ? "V" : "F"));
        System.out.printf("F e F = %s\n", (false && false ? "V" : "F"));

        System.out.println("TABELA VERDADE OPERADOR \"OU\"");
        System.out.printf("V e V = %s\n", (true || true ? "V" : "F"));
        System.out.printf("V e F = %s\n", (true || false ? "V" : "F"));
        System.out.printf("F e V = %s\n", (false || true ? "V" : "F"));
        System.out.printf("F e F = %s\n", (false || false ? "V" : "F"));
    }
}
