import java.util.Scanner;

public class UsandoWhileESwitch {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("Menu:");
            System.out.println("1- Verificar maioridade");
            System.out.println("2- Verificar salário");
            System.out.println("3- Sair do programa");
            System.out.println("Escolha uma opção:");
            opcao = ler.nextInt();
            switch (opcao) {
            case 1:
                System.out.println("Digite a idade:");
                int idade = ler.nextInt();
                if (idade >= 18) {
                    System.out.println("Maior de idade");
                } else {
                    System.out.println("Menor de idade");
                }
                break;
            case 2:
                System.out.println("Digite o salário:");
                double salario = ler.nextDouble();
                if (salario < 1045) {
                    System.out.println("Salário menor que o mínimo");
                } else if (salario == 1045) {
                    System.out.println("Salário igual ao mínimo");
                } else {
                    System.out.println("Salário maior que o mínimo");
                }
                break;
            case 3:
                System.out.println("Volte sempre, até mais!");
                break;
            default:
                System.out.println("Opção inválida - escolha novamente.");
            }
        }

    }

}