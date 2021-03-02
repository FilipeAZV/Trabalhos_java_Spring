import java.util.ArrayList;

public class AprendendoArrayList {

	public static void main(String[] args) {

		// TAMANHO E ADD ELEMENTOS, VER O TAMANHO.
		// ArrayList<Tipo> -> pode ser o tipo de vari·vel (int, double, String, classes,
		// pessoas...)
		ArrayList<String> listaDeNomes = new ArrayList<String>();
		// Size() -> tamanho
		System.out.println("Quantidade (tamanho_ de nomes na lista:" + listaDeNomes.size());
		// add(elemento)-> adicinonar na lista um elemento
		listaDeNomes.add("Ana");
		listaDeNomes.add("Bernardo");
		listaDeNomes.add("Carlos");
		listaDeNomes.add("Daiane");
		listaDeNomes.add("Erica");
		listaDeNomes.add("Fabiano");
		System.out.println("Quantidade (tamanho_ de nomes na lista:" + listaDeNomes.size());
		// Esse comando mostra quantos nomes ou linhas tem na lista, qual seu tamanho.

		// obs:
		// Para os seres humanos: 0 = nada, 1 = primeiro
		// Para o computador: null = nada, 0 = primeiro

		System.out.println("-------------------------------------------------------");

		System.out.println("Primeiro nome da lista: " + listaDeNomes.get(0));
		// Get (posiÁ„o) -> consultar, buscar
		// pega a posiÁ„o especificada da lista e retorna aquele elemento
		System.out.println("Segundo nome da lista: " + listaDeNomes.get(1));
		// remove (posiÁ„o) -> remover uma posiÁ„o da lista
		listaDeNomes.remove(0);

		System.out.println("Primeiro nome da lista: " + listaDeNomes.get(0));

		System.out.println("-------------------------------------------------------");

		// add (posiÁ„o, elemento) -> adicionar um elemento na lista na posiÁ„o
		// especificada
		listaDeNomes.add(0, "AndrÈia");
		System.out.println("Primeiro nome da lista: " + listaDeNomes.get(0));
		
		System.out.println("-------------------------------------------------------");
		
		// Clear -> apagar, limpar, liberar.. apaga todos os intens da lista
		listaDeNomes.clear();
		System.out.println("Quantidade (tamanho) de nomes na lista: " + listaDeNomes.size());
		
		System.out.println("-------------------------------------------------------");
		
		// isEmpty -> est·Vazia - retorna true se a lista est· vazia ou false se lista
		// n„o est· vazia
		if (listaDeNomes.isEmpty()) {
			System.out.println("A lista de nomes est· vazia!");
		} else {
			System.out.println("lista de nomes n„o est· vazia!");
		}

	}

}
