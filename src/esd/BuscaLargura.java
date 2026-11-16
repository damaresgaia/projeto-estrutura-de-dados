package esd;

import java.util.*;

public class BuscaLargura {

    public static void bfs(Grafo grafo, String origem) {
        System.out.println("--- Executando BFS a partir de " + origem + " ---");

        if (!grafo.contemVertice(origem)) {
            System.out.println("Aviso: O vertice '" + origem + "' nao existe no grafo.\n");
            return;
        }

        // Fila comum: quem chega primeiro, sai primeiro
        Queue<String> fila = new LinkedList<>();

        // Guarda quem ja visitamos pra nao ficar rodando em circulos
        Set<String> visitados = new HashSet<>();

        fila.add(origem);
        visitados.add(origem); // Ja marca aqui pra nao colocar o mesmo no repetido na fila

        while (!fila.isEmpty()) {
            String atual = fila.poll(); // Tira o primeiro da fila
            System.out.println("Visitando: " + atual + " | Fila atual: " + fila);

            // Olha todos os vizinhos do no atual
            for (String vizinho : grafo.getVizinhos(atual)) {
                if (!visitados.contains(vizinho)) {
                    visitados.add(vizinho);
                    fila.add(vizinho);
                }
            }
        }
        System.out.println();
    }
}
