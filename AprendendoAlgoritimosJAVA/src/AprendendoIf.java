import java.util.Scanner;

public class AprendendoIf {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a sua idade");

		int idade = ler.nextInt();

		// if � Se
		// S� executa os c�digos do bloco do if se a condi��o foir verdadeira!
		// Express�o que queremos validar
		if (idade >= 18) {
			System.out.println("Voce � maior de idade.");
			System.out.println("Voce pode fazer carteira de motorista, ai sim em!!");

			// else � sen�o
			// s� executa os c�digos do bloco do else se a condi��o for falsa!
		} else {
			System.out.println("Voce � menor de idade!");
			System.out.println("Voce s� pode dirigir no videogame!");
		}
		// Ex de igual igual (==)
		System.out.println("Qual a idade do Ronaldo?");
		int idadeRonaldo = ler.nextInt();
		if (idadeRonaldo == 43) {
			System.out.println("Acertou mizeravi!");
		} else {
			System.out.println("errou meuu!");

		}
		System.out.println("Digite o nome da sua escola t�cnica:");
		String escola = ler.next();

		// equals � igual em ingles
		// M�todo das strings para comparar uma String com outra!
		// equalsIgnoreCase -> igualIgnorandoCaixa (caixa seria a letra mai�scula ou
		// min�scula)
		// m�todo das Strings para comparar uma String com outra ignorando diferen�as de
		// caixa alta ou baixa
		// OBS: digite CRTL + SHIFT + F para identar o c�digo (Organizar)

		if (escola.equalsIgnoreCase("QI")) {
			System.out.println("Voce est� na aula certa!");
		} else {
			System.out.println("Voce est� na aula errada! vaza daqui");

		}

	}

}
