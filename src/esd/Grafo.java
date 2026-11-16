package esd;

import java.util.*;

public class Grafo {

    // Guarda cada no e a listinha de quem sao os vizinhos dele
    Map<String, List<String>> adj = new HashMap<>();

    public void adicionarVertice(String v) {
        if (!adj.containsKey(v)) {
            adj.put(v, new ArrayList<>());
        }
    }

    public void adicionarAresta(String u, String v) {
        adicionarVertice(u);
        adicionarVertice(v);

        // Como a ligacao tem mao dupla, adiciona a ida e a volta
        adj.get(u).add(v);
        adj.get(v).add(u);

        // Deixa em ordem alfabetica pra ficar facil de entender a ordem
        Collections.sort(adj.get(u));
        Collections.sort(adj.get(v));
    }

    public boolean contemVertice(String v) {
        return adj.containsKey(v);
    }

    public List<String> getVizinhos(String v) {
        return adj.getOrDefault(v, new ArrayList<>());
    }

    public void imprimir() {
        for (String vertice : adj.keySet()) {
            System.out.println(vertice + " -> " + adj.get(vertice));
        }
    }
}
