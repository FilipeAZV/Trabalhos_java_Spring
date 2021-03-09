import java.util.Scanner;

public class AprendendoIf {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a sua idade");

		int idade = ler.nextInt();

		// if é Se
		// Só executa os códigos do bloco do if se a condição foir verdadeira!
		// Expressão que queremos validar
		if (idade >= 18) {
			System.out.println("Voce é maior de idade.");
			System.out.println("Voce pode fazer carteira de motorista, ai sim em!!");

			// else é senão
			// só executa os códigos do bloco do else se a condição for falsa!
		} else {
			System.out.println("Voce é menor de idade!");
			System.out.println("Voce só pode dirigir no videogame!");
		}
		// Ex de igual igual (==)
		System.out.println("Qual a idade do Ronaldo?");
		int idadeRonaldo = ler.nextInt();
		if (idadeRonaldo == 43) {
			System.out.println("Acertou mizeravi!");
		} else {
			System.out.println("errou meuu!");

		}
		System.out.println("Digite o nome da sua escola técnica:");
		String escola = ler.next();

		// equals é igual em ingles
		// Método das strings para comparar uma String com outra!
		// equalsIgnoreCase -> igualIgnorandoCaixa (caixa seria a letra maiúscula ou
		// minúscula)
		// método das Strings para comparar uma String com outra ignorando diferenças de
		// caixa alta ou baixa
		// OBS: digite CRTL + SHIFT + F para identar o código (Organizar)

		if (escola.equalsIgnoreCase("QI")) {
			System.out.println("Voce está na aula certa!");
		} else {
			System.out.println("Voce está na aula errada! vaza daqui");

		}

	}

}
