package esd;

import java.util.*;

public class BuscaProfundidade {

    // Funcao que a gente chama pra iniciar a busca
    public static void dfs(Grafo grafo, String origem) {
        System.out.println("--- Executando DFS a partir de " + origem + " ---");

        if (!grafo.contemVertice(origem)) {
            System.out.println("Aviso: O vertice '" + origem + "' nao existe no grafo.\n");
            return;
        }

        Set<String> visitados = new HashSet<>();
        dfsRecursivo(grafo, origem, visitados);
        System.out.println("\n");
    }

    // Funcao que vai descendo fundo no caminho
    private static void dfsRecursivo(Grafo grafo, String atual, Set<String> visitados) {
        visitados.add(atual);
        System.out.print(atual + " ");

        for (String vizinho : grafo.getVizinhos(atual)) {
            if (!visitados.contains(vizinho)) {
                dfsRecursivo(grafo, vizinho, visitados); // Chama de novo pro vizinho (mergulha)
            }
        }
        // Quando nao tem mais vizinho novo, ele volta sozinho pro no anterior (backtracking)
    }

    // Mesmo DFS, mas usando pilha em vez de recursao
    public static void dfsIterativo(Grafo grafo, String origem) {
        System.out.println("--- Executando DFS com Pilha ---");
        Stack<String> pilha = new Stack<>();
        Set<String> visitados = new HashSet<>();

        pilha.push(origem);

        while (!pilha.isEmpty()) {
            String atual = pilha.pop(); // Tira do topo da pilha

            if (!visitados.contains(atual)) {
                visitados.add(atual);
                System.out.print(atual + " ");

                for (String vizinho : grafo.getVizinhos(atual)) {
                    if (!visitados.contains(vizinho)) {
                        pilha.push(vizinho);
                    }
                }
            }
        }
        System.out.println("\n");
    }
}
