package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		// Listas
		// � Lista � uma estrutura de dados:
		// � Homog�nea (dados do mesmo tipo)
		// �Ordenada (elementos acessados por meio de posi��es)
		// � Inicia vazia, e seu elementos s�o alocados sob demanda
		// � Cada elemento ocupa um "n�" (ou nodo) da lista
		// � Tipo (interface): List
		// � Classes que implementam: ArrayList,LinkedList, etc.
		// � Vantagens:
		// � Tamanho vari�vel
		// � Facilidade para se realizar inser��es e dele��es
		// � Desvantagens:
		// � Acesso sequencial aos elementos

		// � Tamanho da lista: size()
		// � Obter o elemento de uma posi��o: get(position)
		// � Inserir elemento na lista: add(obj), add(int, obj)
		// � Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
		// � Encontrar posi��o de elemento: indexOf(obj), lastIndexOf(obj)
		// � Filtrar lista com base em predicado:List<Integer> result =
		// list.stream().filter(x -> x >4).collect(Collectors.toList());
		// � Encontrar primeira ocorr�ncia com base em predicado:Integer result =
		// list.stream().filter(x -> x > 4).findFirst().orElse(null);

		// Lista n�o aceita tipos primitivos
		// List <Integer> list = new ArrayList<>();

		List<String> lista = new ArrayList<String>();
		lista.add("Maria");
		lista.add("Alex");
		lista.add("Bob");
		lista.add("Anna");

		lista.add(1, "Poli"); // Adicionar entre
		lista.remove("Anna"); // Remover
		lista.remove(0); // remove por indice
		lista.removeIf(stringX -> stringX.charAt(0) == 'B'); // Remover na lista todo mundoque come�a com b

		for (String obj : lista) {
			System.out.println(obj);
		}

		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("---------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}