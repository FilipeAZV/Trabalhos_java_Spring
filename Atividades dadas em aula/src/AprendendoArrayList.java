import java.util.ArrayList;

public class AprendendoArrayList {

	public static void main(String[] args) {
		
		//ArrayList<Tipo> -> tipo pode ser o tipo de variável (int, double, String...)
		//ou até mesmo classes (Pessoa, Carro...)
		ArrayList<String> listaDeNomes = new ArrayList<String>();
		//size() -> tamanho
		System.out.println("Quantidade (tamanho) de nomes na lista: " + listaDeNomes.size());
		//add(elemento) -> adicionar na lista um elemento
		listaDeNomes.add("Ana");
		listaDeNomes.add("Bernardo");
		listaDeNomes.add("Carlos");
		listaDeNomes.add("Daiane");
		listaDeNomes.add("Érica");
		listaDeNomes.add("Fabiano");
		System.out.println("Quantidade (tamanho) de nomes na lista: " + listaDeNomes.size());
		
		//get(posicao) -> consultar, buscar
		//pega a posicao especificada da lista e retorna aquele elemento
		System.out.println("Primeiro nome da lista: " + listaDeNomes.get(0));
		
		//remove(posicao) -> remover uma posicao da lista
		listaDeNomes.remove(0);
		System.out.println("Primeiro nome da lista: " + listaDeNomes.get(0));
		
		//add(posicao, elemento) -> adicionar um elemento na lista na posição especificada
		listaDeNomes.add(0, "Andréia");
		System.out.println("Primeiro nome da lista: " + listaDeNomes.get(0));
		
		//clear -> limpar, liberar... apaga todos os itens da lista
		listaDeNomes.clear();
		System.out.println("Quantidade (tamanho) de nomes na lista: " + listaDeNomes.size());
		
		//isEmpty -> estáVazia - retorna true se a lista está vazia ou false se a lista não está vazia
		if (listaDeNomes.isEmpty()) {
			System.out.println("A lista de nomes está vazia!");
		} else {
			System.out.println("A lista de nomes não está vazia!");
		}
		
		
	}
	
}
