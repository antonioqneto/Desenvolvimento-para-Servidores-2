public class Controle {
    public static void main(String[] args) {
        // //Estrutura de controle simples
        // boolean condicao = 10 > 5;
        // if (condicao) {
        // System.out.println("Executou comando condicional.");
        // }
        // //Estrutura de controle composta - Java permite aninhar até 64 ifs
        // boolean condicao1 = 10 > 11;
        // if (condicao1){
        // System.out.println("Executa comando quando condicao verdadeira");
        // } else {
        // System.out.println("Executa comando quando condicao falsa");
        // }
        // // Quando se aninham ifs/elses, quando a primeira condição é concluída já sai
        // do bloco (demais condições não são executadas)
        // Switch Case
        char caracter = 'a';

        switch (caracter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.printf("%s é uma vogal\n", caracter);
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                System.out.printf("%s é um número\n", caracter);
                break;
            default:
                System.out.printf("%s é um caracter especial ou consoante.\n", caracter);
                break;
        }
    }
}
