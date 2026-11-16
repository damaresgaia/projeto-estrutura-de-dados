# Atividade de Fixação: Busca em Largura (BFS) e Busca em Profundidade (DFS)
## Disciplina de Estrutura de Dados — IFSC São José
### Professor: Fábio Guimarães | Equipe 7: BFS e DFS
**Tempo para Resolução em Sala:** 20 minutos | **Valor Individual:** 0,5 ponto na média

---

### Instruções e Convenções
1. **Convenção de Desempate (Obrigatória):** Se um vértice possuir mais de um vizinho não visitado a ser explorado, a ordem de avaliação e inserção na Fila / Pilha **deve seguir rigorosamente a ordem alfabética crescente**.
2. **Registro das Etapas:** Para ter a nota integral (0,25 pelo desenvolvimento + 0,25 pela justificativa), preencha todos os estados intermediários da estrutura de dados auxiliar.

---

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

### Questão 1 (0,25 pt) — Busca em Largura (BFS) a partir de $A$
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

### Questão 2 (0,15 pt) — Busca em Profundidade (DFS) a partir de $A$
Partindo do vértice $A$, determine a sequência de descoberta do DFS e a árvore de chamadas recursivas (respeitando o desempate alfabético):

* **Sequência de Descoberta do DFS:** `[ ___, ___, ___, ___, ___, ___ ]`
* **Identifique um momento em que ocorre Backtracking (retrocesso):**  
  *Qual vértice atinge um beco sem saída primeiro e para qual vértice o algoritmo retorna?*

---

### Questão 3 (0,10 pt) — Análise Conceitual e Erro Comum
No algoritmo de **Busca em Largura (BFS)**, um programador implementou o código marcando o vértice como "visitado" **somente quando ele é retirado (desenfileirado)** da fila, e não quando ele é inserido.  
*O que acontecerá com a Fila e com o consumo de memória ao rodar o BFS nesse grafo com ciclos? Justifique.*

---
---

# GABARITO COMENTADO (Uso exclusivo da Equipe 7 para Correção nos 8 min finais)

### Gabarito da Questão 1 — Tabela de Estados do BFS
*Origem: $A$*

| Passo | Vértice Retirado | Vizinhos Analisados | Ação / Explicação | Estado da Fila (FIFO) | Visitados |
| :---: | :---: | :---: | :--- | :---: | :--- |
| **0** | — | — | Inicialização | $[A]$ | $\{A\}$ |
| **1** | **$A$** | $B, C$ | Ambos não visitados $\to$ enfileira $B$ e $C$ | $[B, C]$ | $\{A, B, C\}$ |
| **2** | **$B$** | $A, D$ | $A$ já visitado (ignora). $D$ não visitado $\to$ enfileira $D$ | $[C, D]$ | $\{A, B, C, D\}$ |
| **3** | **$C$** | $A, D, E$ | $A$ já visitado (ignora). $D$ já visitado (ignora!). $E$ enfileirado | $[D, E]$ | $\{A, B, C, D, E\}$ |
| **4** | **$D$** | $B, C, F$ | $B$ e $C$ já visitados. $F$ não visitado $\to$ enfileira $F$ | $[E, F]$ | $\{A, B, C, D, E, F\}$ |
| **5** | **$E$** | $C, F$ | $C$ e $F$ já visitados (ignora ambos) | $[F]$ | $\{A, B, C, D, E, F\}$ |
| **6** | **$F$** | $D, E$ | $D$ e $E$ já visitados (ignora ambos) | $[ \ ]$ *(vazia)* | $\{A, B, C, D, E, F\}$ |

* **Ordem final de visitação do BFS:** `[A, B, C, D, E, F]`
* **Níveis (Distâncias da origem):**
  * **Nível 0:** $A$
  * **Nível 1:** $B, C$
  * **Nível 2:** $D, E$
  * **Nível 3:** $F$

---

### Gabarito da Questão 2 — Busca em Profundidade (DFS)
* **Sequência de Descoberta:** `[A, B, D, C, E, F]`
  * **Passo a passo do mergulho:**
    1. De $A$, vai para o primeiro vizinho alfabético: **$B$**.
    2. De $B$, vizinho $A$ já visitado $\to$ mergulha para **$D$**.
    3. De $D$, vizinhos são $B, C, F$. $B$ já visitado $\to$ mergulha para **$C$**.
    4. De $C$, vizinhos são $A, D, E$. $A$ e $D$ já visitados $\to$ mergulha para **$E$**.
    5. De $E$, vizinho $C$ já visitado $\to$ mergulha para **$F$**.
    6. De $F$, vizinhos são $D$ e $E$. **Ambos já foram visitados!**
* **Momento do Backtracking:**
  * O vértice **$F$** é o primeiro a atingir um "beco sem saída" (todos os seus vizinhos $D$ e $E$ já estão visitados).
  * O algoritmo desempilha $F$ e retorna para **$E$**, depois desempilha $E$ e retorna para **$C$**, até desempilhar completamente de volta para $A$.

---

### Gabarito da Questão 3 — Análise do Erro Clássico
* **Resposta esperada:**  
  Se o nó for marcado como visitado apenas no momento de **desenfileirar** (`poll`), **múltiplas cópias do mesmo nó serão inseridas na fila**.
* **Demonstração no grafo do exercício:**  
  No Passo 1, $A$ desenfileira e insere $B$ e $C$.  
  No Passo 2, $B$ desenfileira e insere $D$. Como $D$ ainda não foi desenfileirado, ele não estaria marcado como visitado.  
  No Passo 3, quando $C$ desenfileira, ele também tem $D$ como vizinho. Como $D$ não consta como visitado, $C$ **insere $D$ novamente na fila**!
* **Consequência:** A fila passa a conter nós repetidos ($[..., D, ..., D]$), aumentando desnecessariamente o uso de memória e processamento, podendo levar a explosão de consumo de memória em grafos densos.

