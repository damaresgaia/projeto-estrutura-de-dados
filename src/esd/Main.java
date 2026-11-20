package esd;

public class Main {

    public static void main(String[] args) {
        // 1. Teste na arvore 
        System.out.println("=== 1. TESTE COM ARVORE BINARIA ===");
        ArvoreBinaria.No raiz = new ArvoreBinaria.No(4);
        raiz.esquerda = new ArvoreBinaria.No(7);
        raiz.direita = new ArvoreBinaria.No(2);
        raiz.direita.esquerda = new ArvoreBinaria.No(3);
        raiz.direita.direita = new ArvoreBinaria.No(1);

        System.out.print("DFS na arvore: ");
        ArvoreBinaria.dfs(raiz);
        System.out.println();

        System.out.print("BFS na arvore: ");
        ArvoreBinaria.bfs(raiz);
        System.out.println();

        // 2. Grafo principal da apresentacao (tem caminhos fechados / ciclos)
        System.out.println("=== 2. GRAFO PRINCIPAL (COM CICLOS) ===");
        Grafo grafo = new Grafo();
        grafo.adicionarAresta("A", "B");
        grafo.adicionarAresta("A", "C");
        grafo.adicionarAresta("B", "D");
        grafo.adicionarAresta("B", "E");
        grafo.adicionarAresta("C", "E");
        grafo.adicionarAresta("C", "F");
        grafo.adicionarAresta("D", "E");

        grafo.imprimir();
        System.out.println();

        BuscaLargura.bfs(grafo, "A");
        BuscaProfundidade.dfs(grafo, "A");

        // 3. Grafo que vamos passar no exercicio pra turma resolver
        System.out.println("=== 3. GRAFO DO EXERCICIO DA TURMA ===");
        Grafo grafoExercicio = new Grafo();
        grafoExercicio.adicionarAresta("A", "B");
        grafoExercicio.adicionarAresta("A", "C");
        grafoExercicio.adicionarAresta("B", "D");
        grafoExercicio.adicionarAresta("C", "D");
        grafoExercicio.adicionarAresta("C", "E");
        grafoExercicio.adicionarAresta("D", "F");
        grafoExercicio.adicionarAresta("E", "F");

        BuscaLargura.bfs(grafoExercicio, "A");
        BuscaProfundidade.dfs(grafoExercicio, "A");

        // 4. Teste limite: grafo com duas partes separadas que nao se conectam
        System.out.println("=== 4. TESTE DE CASO LIMITE: GRAFO DESCONEXO ===");
        Grafo desconexo = new Grafo();
        desconexo.adicionarAresta("A", "B");
        desconexo.adicionarAresta("C", "D");
        BuscaLargura.bfs(desconexo, "A");

        // 5. Teste limite: vertice isolado (sem conexao nenhuma)
        System.out.println("=== 5. TESTE DE CASO LIMITE: VERTICE ISOLADO ===");
        Grafo grafoIsolado = new Grafo();
        grafoIsolado.adicionarAresta("A", "B");
        grafoIsolado.adicionarVertice("Z"); // Z existe no grafo, mas nao tem vizinho nenhum
        BuscaLargura.bfs(grafoIsolado, "Z");

        // 6. Teste limite: grafo vazio
        System.out.println("=== 6. TESTE DE CASO LIMITE: GRAFO VAZIO ===");
        Grafo grafoVazio = new Grafo();
        BuscaLargura.bfs(grafoVazio, "A"); // Tenta buscar vertice em grafo sem nada
    }
}
