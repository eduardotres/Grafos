package Main;

import Algoritmo.Profundidade;
import Grafo.Aresta;
import Grafo.Grafo;
import Grafo.Vertice;

public class Main {

	public static void main(String[] args) {

		Grafo grafo = new Grafo();
		System.out.println("Exemplo de Grafo Completo: ");
		Vertice cacupe = new Vertice("Cacup�");
		Vertice jurere = new Vertice("Jurer�");
		Vertice canasvieiras = new Vertice("Canasvieiras");

		grafo.adicionaVertice(cacupe);
		grafo.adicionaVertice(jurere);
		grafo.adicionaVertice(canasvieiras);

		grafo.conecta(cacupe, jurere, new Aresta(5));
		grafo.conecta(cacupe, canasvieiras, new Aresta(7));
		grafo.conecta(jurere, canasvieiras, new Aresta(4));

		System.out.println(grafo.toString_info());
		Profundidade search = new Profundidade(grafo, jurere);
		System.out.println("Busca em Profundidade: \nOrdem de busca dos v�rtices partindo de Jurere: ");
		for (Vertice v : grafo.vertices()) {
			if (search.marcados(v))
				System.out.println(v + " ");
		}
		
		System.out.println(" ");
		if (search.count() != grafo.ordem())
			System.out.println("Grafo n�o conexo");
		else
			System.out.println("Grafo conexo");
		
		System.out.println("----------------------------------------------------\n");
		System.out.println("Exemplo de Grafo Conexo: ");
		grafo.desconecta(cacupe, jurere);

		System.out.println(grafo.toString_info());
		search = new Profundidade(grafo, jurere);
		System.out.println("Busca em Profundidade: \nOrdem de busca dos v�rtices partindo de Jurere: ");
		for (Vertice v : grafo.vertices()) {
			if (search.marcados(v))
				System.out.println(v + " ");
		}
		
		System.out.println(" ");
		if (search.count() != grafo.ordem())
			System.out.println("Grafo n�o conexo");
		else
			System.out.println("Grafo conexo");
		
		System.out.println("----------------------------------------------------\n");
		System.out.println("Exemplo de Grafo Conexo 2: ");
		grafo.conecta(cacupe, jurere, new Aresta(10));
		Vertice aeroporto = new Vertice("Aeroporto");
		Vertice campeche = new Vertice("Campeche");
		Vertice costeira = new Vertice("Costeira");
		Vertice sacodoslimoes = new Vertice("Saco dos Lim�es");
		Vertice centro = new Vertice("Centro");
		Vertice trindade = new Vertice("Trindade");
		Vertice agronomica = new Vertice("Agron�mica");
		Vertice sambaqui = new Vertice("Sambaqui");
	    Vertice ingleses = new Vertice("Ingleses");
		Vertice corregogrande = new Vertice("Corrego Grande");

		grafo.adicionaVertice(aeroporto);
		grafo.adicionaVertice(campeche);
		grafo.adicionaVertice(costeira);
		grafo.adicionaVertice(sacodoslimoes);
		grafo.adicionaVertice(centro);
		grafo.adicionaVertice(trindade);
		grafo.adicionaVertice(agronomica);
		grafo.adicionaVertice(sambaqui);
		grafo.adicionaVertice(ingleses);
		grafo.adicionaVertice(corregogrande);
		
		grafo.conecta(aeroporto, costeira, new Aresta(4));
		grafo.conecta(costeira, campeche, new Aresta(5));
		grafo.conecta(costeira, sacodoslimoes, new Aresta(8));
		grafo.conecta(centro, sacodoslimoes, new Aresta(5));
		grafo.conecta(trindade, sacodoslimoes, new Aresta(4));
		grafo.conecta(trindade, corregogrande, new Aresta(2));
		grafo.conecta(centro, agronomica, new Aresta(5));
		grafo.conecta(trindade, agronomica, new Aresta(3));
		grafo.conecta(agronomica, cacupe, new Aresta(8));
		grafo.conecta(cacupe, sambaqui, new Aresta(5));
		grafo.conecta(canasvieiras, ingleses, new Aresta(15));
		
		System.out.println(grafo.toString_info());
		search = new Profundidade(grafo, aeroporto);
		System.out.println("Busca em Profundidade: \n Ordem dos v�rtices partindo de Aeroporto:");
		for (Vertice v : grafo.vertices()) {
			if (search.marcados(v))
				System.out.println(v + " ");
		}
		
		System.out.println(" ");
		if (search.count() != grafo.ordem())
			System.out.println("Grafo n�o conexo");
		else
			System.out.println("Grafo conexo");
		
		System.out.println("----------------------------------------------------\n");
		System.out.println("Exemplo de Grafo Conexo 3: ");
		grafo.desconecta(jurere, canasvieiras);
		grafo.desconecta(trindade, agronomica);
		System.out.println(grafo.toString_info());
		search = new Profundidade(grafo, ingleses);
		System.out.println("Busca em Profundidade: \n Ordem dos v�rtices partindo de Ingleses:");
		for (Vertice v : grafo.vertices()) {
			if (search.marcados(v))
				System.out.println(v + " ");
		}
		
		System.out.println(" ");
		if (search.count() != grafo.ordem())
			System.out.println("Grafo n�o conexo");
		else
			System.out.println("Grafo conexo");
		
		System.out.println("----------------------------------------------------\n");
		System.out.println("Exemplo de Grafo Desconexo: ");
		
		grafo.desconecta(corregogrande, trindade);
		grafo.desconecta(agronomica, cacupe);
		System.out.println(grafo.toString_info());
		search = new Profundidade(grafo, aeroporto);
		System.out.println("Busca em Profundidade: \n Ordem dos v�rtices partindo de Aeroporto:");
		for (Vertice v : grafo.vertices()) {
			if (search.marcados(v))
				System.out.println(v + " ");
		}
		
		System.out.println(" ");
		if (search.count() != grafo.ordem())
			System.out.println("Grafo n�o conexo");
		else
			System.out.println("Grafo conexo");
	}
}
