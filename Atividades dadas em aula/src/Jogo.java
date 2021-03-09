
public class Jogo {
	
	public static void main(String[] args) {
		
		Personagem jogador1 = new Personagem("Conan", 200);
		Personagem jogador2 = new Personagem("Veromus", 150);
		
		Equipamento espadaDeDuasMaos = new Equipamento("Espada do Conan", 20, 2);
		Equipamento tanguinha = new Equipamento("Tanga do Conan", 0, 1);
		jogador1.addEquipamento(espadaDeDuasMaos);
		jogador1.addEquipamento(tanguinha);
		
		Equipamento garrasDeDemonio = new Equipamento("Garras de Demônio", 15, 0);
		Equipamento bestaQuadradaExplosiva = new Equipamento("Besta Quadrada Explosiva", 20, 1);
		Equipamento armaduraDeCouro = new Equipamento("Armadura de Couro", 0, 5);
		jogador2.addEquipamento(garrasDeDemonio);
		jogador2.addEquipamento(bestaQuadradaExplosiva);
		jogador2.addEquipamento(armaduraDeCouro);
		
		System.out.println("VAI COMEÇA A TRETA:");
		System.out.println("De um lado, temos " + jogador1.getNome());
		System.out.println("De outro, temos " + jogador2.getNome());
		System.out.println("FIGHT!!!!");
		
		while (jogador1.getVida() > 0 && jogador2.getVida() > 0) {
			System.out.println(jogador1.getNome() + " ataca com " + jogador1.poderDeAtaque());
			System.out.println(jogador2.getNome() + " defende-se com " + jogador2.poderDeDefesa());
			jogador2.setVida(jogador2.getVida() - (jogador1.poderDeAtaque() - jogador2.poderDeDefesa()));
			
			System.out.println(jogador2.getNome() + " ataca com " + jogador2.poderDeAtaque());
			System.out.println(jogador1.getNome() + " defende-se com " + jogador1.poderDeDefesa());
			jogador1.setVida(jogador1.getVida() - (jogador2.poderDeAtaque() - jogador1.poderDeDefesa()));
			
			System.out.println("Vidas: " + jogador1.getNome() + ": " + jogador1.getVida() + " - " 
			                             + jogador2.getNome() + ": " + jogador2.getVida());
		}
		
		System.out.println("ACABOU!!!!!!");
		if (jogador1.getVida() > jogador2.getVida()) {
			System.out.println(jogador1.getNome() + " Venceu!");
		} else if (jogador2.getVida() > jogador1.getVida()) {
			System.out.println(jogador2.getNome() + " Venceu!");
		} else {
			System.out.println("Ih caramba, morreram os dois!");
		}
		
	}

}
