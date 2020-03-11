package br.fai.colections02;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main app = new Main();
		app.start();

	}
	
	private  Map<String, String> mapa = new HashMap <String, String >();

	private void start() {
		// TODO Auto-generated method stub
		adicionarItemNoMapa();
		exibirValorDoMapaPelaChave("SRS");
		exibirValorDoMapaPelaChave("VALOR NÃO EXISTE");
		iterarMapa();
		
		System.out.println("");
		
	}
	
	private void adicionarItemNoMapa() {
		try {
			mapa.put("SRS", "Sanat Rita do Sapucai");
			mapa.put("PA", "Pouso Alegre");
			mapa.put("ITA", "Itajuba");
			mapa.put("ZORO", "Conceição dos Ouros");
			mapa.put("CAXU", "Cachoeira de Minas");
			mapa.put("SRS", "Hoje esta quente pra kct");
			mapa.put("SRS", "Segunda tambem estava");
			System.out.println("cheguei no try");
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Ocorreu uma exceção!");
		} finally {
			System.out.println("Cheguei no finally");
		}
    }
	
	private void exibirValorDoMapaPelaChave(String chave) {
		String valorDoItemNoMapa = mapa.get(chave);
		if(valorDoItemNoMapa == null  || valorDoItemNoMapa.isEmpty()) {
			System.out.println("Esta chave não " + "Esta presente no mapa");
		} else {
			System.out.println("O valor desta chave é:" + mapa.get(chave));
		}
		
		System.out.println("O valor dessa chave eh:" + mapa.get(chave));
	}
	
	private void iterarMapa() {
		System.out.println("");
		for(String chave: mapa.keySet()) {
			System.out.println("chave" +chave + "| valor " + mapa.get(chave));
			
		}
	}

}
