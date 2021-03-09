import java.util.ArrayList;

public class AprendendoArrayList {

	public static void main(String[] args) {
		
		//ArrayList<Tipo> -> tipo pode ser o tipo de vari�vel (int, double, String...)
		//ou at� mesmo classes (Pessoa, Carro...)
		ArrayList<String> listaDeNomes = new ArrayList<String>();
		//size() -> tamanho
		System.out.println("Quantidade (tamanho) de nomes na lista: " + listaDeNomes.size());
		//add(elemento) -> adicionar na lista um elemento
		listaDeNomes.add("Ana");
		listaDeNomes.add("Bernardo");
		listaDeNomes.add("Carlos");
		listaDeNomes.add("Daiane");
		listaDeNomes.add("�rica");
		listaDeNomes.add("Fabiano");
		System.out.println("Quantidade (tamanho) de nomes na lista: " + listaDeNomes.size());
		
		//get(posicao) -> consultar, buscar
		//pega a posicao especificada da lista e retorna aquele elemento
		System.out.println("Primeiro nome da lista: " + listaDeNomes.get(0));
		
		//remove(posicao) -> remover uma posicao da lista
		listaDeNomes.remove(0);
		System.out.println("Primeiro nome da lista: " + listaDeNomes.get(0));
		
		//add(posicao, elemento) -> adicionar um elemento na lista na posi��o especificada
		listaDeNomes.add(0, "Andr�ia");
		System.out.println("Primeiro nome da lista: " + listaDeNomes.get(0));
		
		//clear -> limpar, liberar... apaga todos os itens da lista
		listaDeNomes.clear();
		System.out.println("Quantidade (tamanho) de nomes na lista: " + listaDeNomes.size());
		
		//isEmpty -> est�Vazia - retorna true se a lista est� vazia ou false se a lista n�o est� vazia
		if (listaDeNomes.isEmpty()) {
			System.out.println("A lista de nomes est� vazia!");
		} else {
			System.out.println("A lista de nomes n�o est� vazia!");
		}
		
		
	}
	
}
