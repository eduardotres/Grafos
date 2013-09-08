package Grafo;

import java.util.HashMap;

public class Grafo {
	private boolean direcionado;
	private HashMap<String, Vertice> grafo;
	private HashMap<String, Aresta> arestas;

	public Grafo(boolean direcionado) {
		grafo = new HashMap<String, Vertice>();
		setArestas(new HashMap<String, Aresta>());
		this.setDirecionado(direcionado);
	}

	public void insereVertice(Vertice vertice) {
		if (grafo.containsKey(vertice.getVertice()))
			// Testa se o v�rtice j� possui uma chave igual
			System.out.println("Valor de v�rtice j� existente no grafo! -> "
					+ vertice.toString());
		else { // Caso n�o tenha, adiciona um novo v�rtice ao grafo
			grafo.put(vertice.getVertice(), vertice);
		}
	}

	public void insereAresta(Vertice fonte, Vertice destino, int peso) {
		if (grafo.containsKey(fonte.getVertice())
				&& grafo.containsKey(destino.getVertice())) {
			// Verifica se os v�rtices est�o inseridos no grafo
			if (arestas.containsKey(fonte + "-" + destino))
				// Verifica se a aresta j� existe
				System.out.println(fonte.toString() + " e "
						+ destino.toString() + "j� est�o conectados!");
			else
				// Chave ganha nome dos v�rtices fonte-destino
				arestas.put(fonte + "-" + destino, new Aresta(fonte, destino,
						peso));
		} else {
			// Fonte n�o � v�rtice do grafo
			if (grafo.containsKey(destino.getVertice()))
				System.out.println(fonte + " n�o � v�rtice do grafo!");
			else {
				// Destino n�o � v�rtice do grafo
				if (grafo.containsKey(fonte.getVertice()))
					System.out.println(destino + " n�o � v�rtice do grafo!");
				else
					// Ambos v�rtices n�o pertencem ao grafo
					System.out.println(fonte + " e " + destino
							+ "n�o s�o v�rtices do grafo!");
			}
		}
	}

	public String toString() {
		return grafo.toString();
	}

	public HashMap<String, Vertice> getGrafo() {
		return grafo;
	}

	public boolean isDirecionado() {
		return direcionado;
	}

	public void setDirecionado(boolean direcionado) {
		this.direcionado = direcionado;
	}

	public HashMap<String, Aresta> getArestas() {
		return arestas;
	}

	public void setArestas(HashMap<String, Aresta> arestas) {
		this.arestas = arestas;
	}
}
