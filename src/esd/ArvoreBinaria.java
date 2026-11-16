package esd;

import java.util.*;

public class ArvoreBinaria {

    public static class No {
        int valor;
        No esquerda;
        No direita;

        public No(int valor) {
            this.valor = valor;
        }
    }

    // DFS: desce tudo pela esquerda ate acabar e depois desce pela direita
    public static void dfs(No no) {
        if (no == null) {
            return;
        }

        System.out.print(no.valor + " ");
        dfs(no.esquerda);
        dfs(no.direita);
    }

    // BFS: visita linha por linha usando uma fila
    public static void bfs(No raiz) {
        if (raiz == null) {
            return;
        }

        Queue<No> fila = new LinkedList<>();
        fila.add(raiz);

        while (!fila.isEmpty()) {
            No atual = fila.poll();
            System.out.print(atual.valor + " ");

            // Coloca os filhos na fila pra olhar no proximo nivel
            if (atual.esquerda != null) {
                fila.add(atual.esquerda);
            }
            if (atual.direita != null) {
                fila.add(atual.direita);
            }
        }
        System.out.println();
    }
}
