# GABARITO COMENTADO: 

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
