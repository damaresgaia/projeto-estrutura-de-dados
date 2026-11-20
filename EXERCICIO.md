# Atividade de Fixação

## 1. O Grafo do Exercício

Considere o seguinte grafo não-direcionado $G = (V, E)$ composto por 6 vértices e 7 arestas:

* **Vértices:** $V = \{A, B, C, D, E, F\}$
* **Arestas:**
  * Entre $A$ e $B$, entre $A$ e $C$
  * Entre $B$ e $D$
  * Entre $C$ e $D$, entre $C$ e $E$
  * Entre $D$ e $F$
  * Entre $E$ e $F$

```
          [B] --------- [D]
         /                \
      [A]                  [F]
         \                /
          [C] --------- [E]
           \_____________/  (Aresta C-D também existe!)
```
*(Adjacências ordenadas: $A \to [B, C]$, $B \to [A, D]$, $C \to [A, D, E]$, $D \to [B, C, F]$, $E \to [C, F]$, $F \to [D, E]$)*.

---

## 2. Questões da Atividade

### Questão 1 — Busca em Largura (BFS) a partir de $A$
Preencha a tabela abaixo registrando o estado da **Fila (Queue - FIFO)** e o conjunto de vértices já marcados como visitados a cada iteração:

| Passo | Vértice Desenfileirado | Vizinhos Avaliados | Ação / O que acontece | Estado da Fila `[Início ... Fim]` | Conjunto de Visitados |
| :---: | :---: | :---: | :---: | :---: | :---: |
| Início | — | — | Enfileira origem $A$ | $[A]$ | $\{A\}$ |
| 1 | $A$ | $B, C$ | Enfileira $B$ e $C$ | | |
| 2 | | | | | |
| 3 | | | | | |
| 4 | | | | | |
| 5 | | | | | |
| 6 | | | | | |

* **Ordem final de visitação do BFS:** `[ ___, ___, ___, ___, ___, ___ ]`
* **Nível/Distância de cada vértice em relação a $A$:**
  * Nível 0: _____
  * Nível 1: _____
  * Nível 2: _____
  * Nível 3: _____

---

### Questão 2 — Busca em Profundidade (DFS) a partir de $A$
Partindo do vértice $A$, determine a sequência de descoberta do DFS e a árvore de chamadas recursivas (respeitando o desempate alfabético):

* **Sequência de Descoberta do DFS:** `[ ___, ___, ___, ___, ___, ___ ]`
* **Identifique um momento em que ocorre Backtracking (retrocesso):**  
  *Qual vértice atinge um beco sem saída primeiro e para qual vértice o algoritmo retorna?*

---

### Questão 3 — Análise Conceitual e Erro Comum
No algoritmo de **Busca em Largura (BFS)**, um programador implementou o código marcando o vértice como "visitado" **somente quando ele é retirado (desenfileirado)** da fila, e não quando ele é inserido.  
*O que acontecerá com a Fila e com o consumo de memória ao rodar o BFS nesse grafo com ciclos? Justifique.*
