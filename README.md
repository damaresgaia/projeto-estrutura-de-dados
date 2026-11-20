# Projeto Final — Estrutura de Dados
**Equipe 7:** Busca em Largura (BFS) e Busca em Profundidade (DFS) |   
**Slides:** [BFS & DFS — Equipe 7 (Google Slides)](https://docs.google.com/presentation/d/1I1fc_UjVvt7B8vXShD90AEjg9EPcqPhi-tANT0t6k2w/edit?usp=sharing)

---

## 1. Equipe

* **Kaléu Borges Augusto** (Slides 1–4): Abertura, árvores binárias e transição para grafos.
* **Damares do Socorro Gonçalves Gaia** (Slides 5–9): Teoria de BFS (`Queue`), DFS (`Stack`/recursão) e complexidade $O(V + E)$.
* **Letícia Vieira Vieira** (Slide 10): Demonstração interativa no simulador visual (`index.html`).
* **Michel Pereira Claudino** (Slide 11): Explicação e execução do código Java e casos limite.
* **Gabriel Ferreira de Souza da Silva** (Slides 12–15): Atividade prática, gabarito comentado e fechamento.

---

## 2. Resumo do Projeto

Implementação e demonstração didática de **Busca em Largura (BFS)** e **Busca em Profundidade (DFS)** em grafos não-direcionados com listas de adjacência, controle de vértices `visitados` contra ciclos, desempate em ordem alfabética e complexidade $O(V + E)$.

---

## 3. Estrutura dos Arquivos

* `src/esd/`: Código-fonte Java (`ArvoreBinaria.java`, `Grafo.java`, `BuscaLargura.java`, `BuscaProfundidade.java`, `Main.java`).
* `index.html`: Simulador visual interativo (Árvore, Grafos, Fila/Pilha animadas).
* `EXERCICIO.md` / `EXERCICIO.pdf`: Enunciado da atividade de fixação em sala.
* `GABARITO.md`: Gabarito comentado para correção.

---

## 4. Como Executar o Código Java

Requisito: Java JDK 11+. Na raiz do projeto:

```bash
mkdir -p bin
javac -encoding UTF-8 -d bin src/esd/*.java
java -cp bin esd.Main
```

---

## 5. Simulador Visual

Abra o arquivo `index.html` em qualquer navegador (Chrome ou Firefox) para acompanhar a execução passo a passo da Fila (BFS) e da Pilha (DFS).

---

## 6. Declaração de Fontes e IA 

* **Bibliografia de Referência:**
  1. **CORMEN, T. H. et al.** *Algoritmos: Teoria e Prática*. 3. ed. Elsevier, 2012. (Capítulo 22: Algoritmos Elementares para Grafos — convenção de cores e timestamps $d[u]/f[u]$).
  2. **GOODRICH, M. T.; TAMASSIA, R.** *Estruturas de Dados e Algoritmos em Java*. 5. ed. Bookman, 2013. (Capítulo 13: Grafos e listas de adjacência).
  3. **SEDGEWICK, R.; WAYNE, K.** *Algorithms*. 4th ed. Addison-Wesley, 2011. (Seção 4.1).
* **Fontes Didáticas Complementares:**
  * **Visualize DSA** (`visualizedsa.com`): Referência interativa para visualização de travessia em árvores e grafos.
  * Augusto Galego (YouTube): Exemplo didático de DFS em árvore binária (LeetCode 129 - *Sum Root to Leaf Numbers*).
* **Uso de Inteligência Artificial:**
  * A IA generativa (Gemini) foi utilizada como ferramenta de suporte no brainstorming, na estilização visual dos slides, na estruturação do simulador web em HTML/SVG e na elaboração do exercício. Todo o código Java, a suíte de testes de casos limites, as tabelas de estado e os exercícios foram integralmente revisados, testados, compreendidos e validados pelos integrantes da equipe.
