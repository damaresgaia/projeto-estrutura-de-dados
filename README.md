# Primeira Versão do Projeto Final — Estrutura de Dados (IFSC São José)
## Equipe 7: Busca em Largura (BFS) e Busca em Profundidade (DFS)

* **Instituição:** Instituto Federal de Santa Catarina — Câmpus São José  
* **Disciplina:** Estrutura de Dados (Semestre 2026/2)  
* **Professor:** Fábio Guimarães  
* **Data da Entrega (Primeira Versão):** 17/11/2026  
* **Data da Apresentação:** 26/11/2026 (50 minutos)  
* **Apresentação Oficial de Slides:** [BFS & DFS — Equipe 7 (Google Slides)](https://docs.google.com/presentation/d/1I1fc_UjVvt7B8vXShD90AEjg9EPcqPhi-tANT0t6k2w/edit?usp=sharing)  

---

## 1. Identificação da Equipe e Divisão de Papéis

A equipe é composta por 5 integrantes. A divisão foi estruturada de forma equilibrada para cobrir os 15 slides da apresentação oficial ao longo dos 50 minutos exigidos pelo professor Fábio Guimarães:

| Integrante | Slides | Papel e Responsabilidades na Apresentação |
| :--- | :---: | :--- |
| **Kaléu Borges Augusto** | **1 a 4** (6 min) | **Abertura e Transição Árvores → Grafos:**<br>• Contextualização da apresentação e objetivos gerais.<br>• Árvores binárias como base (nós, raiz, filhos e folhas).<br>• Travessias simples em árvores (BFS por níveis vs DFS pré-ordem).<br>• O salto para Grafos reais: o perigo dos ciclos e a necessidade do conjunto de `visitados`. |
| **Damares do Socorro Gonçalves Gaia** | **5 a 9** (6 min) | **Teoria Central de BFS e DFS:**<br>• Busca em Largura: analogia da pedra na água, expansão em ondas concêntricas e garantia do caminho mais curto.<br>• Estrutura de Fila (`Queue` - FIFO) e a regra de ouro de marcar na inserção.<br>• Busca em Profundidade: analogia do labirinto com barbante e *backtracking*.<br>• Estrutura de Pilha (`Stack` - LIFO) vs Recursão.<br>• Comparativo direto lado a lado e análise de complexidade $O(V + E)$ e $O(V)$. |
| **Letícia Vieira Vieira** | **10** (5 min) | **Demonstração Interativa no Simulador:**<br>• Projeção do aplicativo visual (`simulador/index.html`) no telão.<br>• Demonstração da dinâmica de cores dos nós: Amarelo (espera), Rosa (visita) e Verde (concluído).<br>• Execução passo a passo mostrando a Fila horizontal do BFS e a Pilha vertical do DFS funcionando em tempo real. |
| **Michel Pereira Claudino** | **11** (5 min) | **Código em Java e Testes de Casos Limite:**<br>• Explicação didática do código em Java em 4 partes (`Queue<String>`, `Set<String>`, `poll` e laço de vizinhos).<br>• Demonstração da execução no terminal (`java -cp bin esd.Main`).<br>• Análise técnica dos casos limite implementados na classe `Main`: grafo desconexo (duas componentes) e nó isolado. |
| **Gabriel Ferreira de Souza da Silva** | **12 a 15** (28 min) | **Dinâmica Prática, Gabarito e Fechamento:**<br>• **20 min:** Condução e mediação da Atividade Prática em sala (Grafo de 6 nós e 7 arestas valendo 0,5 ponto).<br>• **8 min:** Apresentação do Gabarito Comentado (tabela completa passo a passo da Fila do BFS) e discussão do erro clássico de prova.<br>• Abertura do espaço para dúvidas (Slide 14) e considerações finais com referências e declaração de transparência de IA (Slide 15). |

---

## 2. Ficha da Proposta Oficial (Slide 31 do PDF)

| Campo | Descrição da Equipe 7 (BFS e DFS) |
| :--- | :--- |
| **Objetivo** | Demonstrar como percorrer grafos gerais explorando por níveis concêntricos (**BFS**) e por mergulho com retrocesso (**DFS**), enfatizando o papel da **Fila** e da **Pilha**, o controle de **visitados** contra ciclos e a complexidade $O(V + E)$. |
| **Código** | Implementação modular em Java (console) com classes `Grafo` (lista de adjacência), `BuscaLargura` e `BuscaProfundidade`. Acompanha um simulador visual complementar em HTML/SVG. |
| **Exemplo Central** | Grafo não-direcionado com 6 vértices ($A, B, C, D, E, F$) e múltiplos ciclos (triângulo e quadrado cruzado), partindo da origem $A$ com desempate em ordem alfabética. |
| **Exercício** | Grafo inédito com 6 vértices. A turma preenche a tabela de estados da Fila/Pilha, identifica a ordem de descoberta e analisa o impacto do erro clássico de marcação tardia. |
| **Testes** | 1. Árvore Binária (intuição didática); 2. Grafo com ciclos; 3. Vértice isolado; 4. Grafo desconexo; 5. Grafo vazio. |

---

## 3. Estrutura dos Arquivos da Entrega

O repositório está organizado exatamente nos pilares exigidos pelo professor (Slide 11):

```
projeto-estrutura-de-dados/
│
├── [PILAR 01: Apresentação de Slides]
│   └── Link Oficial (15 slides): https://docs.google.com/presentation/d/1I1fc_UjVvt7B8vXShD90AEjg9EPcqPhi-tANT0t6k2w/edit?usp=sharing
│
├── src/esd/                      # [PILAR 02: Código Java e Execução]
│   ├── ArvoreBinaria.java        # Intuição didática inicial (árvore binária e travessias)
│   ├── Grafo.java                # Grafo por listas de adjacência (u -> vizinhos ordenados)
│   ├── BuscaLargura.java         # BFS com Queue, níveis de distância e logs didáticos
│   ├── BuscaProfundidade.java    # DFS recursivo (mergulho/backtracking) e iterativo (Stack)
│   └── Main.java                 # Suíte integrada de testes e casos limites
│
├── simulador/                    # [APOIO VISUAL: Para Projeção no Telão]
│   └── index.html                # Simulador visual interativo (Árvore, Grafos, Fila/Pilha animadas)
│
├── EXERCICIO_E_GABARITO.md       # [PILAR 03: Atividade] Enunciado de 20 min + Gabarito comentado
├── .gitignore                    # Regras para ignorar binários e IDEs
└── README.md                     # Documento mestre da entrega
```

---

## 4. Como Compilar e Executar o Código Java (Linux / Laboratórios IFSC)

Requisitos: Java JDK 11 ou superior instalado.

No terminal do Linux (Bash), execute a partir da raiz do projeto:

```bash
# 1. Compilar as classes com suporte a UTF-8
mkdir -p bin
javac -encoding UTF-8 -d bin src/esd/*.java

# 2. Executar a demonstração completa
java -cp bin esd.Main
```

### O que o programa executa no console:
1. **Etapa 1:** Demonstração didática em Árvore Binária (DFS pré-ordem e BFS por níveis).
2. **Etapa 2:** Grafo central da apresentação (6 nós com ciclos) executando BFS e DFS com detalhamento da Fila e da Pilha.
3. **Etapa 3:** Grafo da atividade da turma (comprovando os resultados do gabarito).
4. **Etapa 4:** Caso limite: Grafo desconexo (duas componentes separadas).
5. **Etapa 5:** Caso limite: Vértice isolado (nó sem arestas).
6. **Etapa 6:** Caso limite: Grafo vazio (busca segura sem quebrar o programa).

---

## 5. Como Abrir o Simulador Visual Interativo

Durante o seminário presencial, a equipe projetará no telão o simulador visual para facilitar a explicação:
* **No Linux (Laboratório IFSC):**
  Basta abrir o arquivo `simulador/index.html` em qualquer navegador (Google Chrome ou Firefox), ou executar no terminal:
  ```bash
  xdg-open simulador/index.html
  ```
* Permite executar passo a passo, pausar e ver a animação da Fila (FIFO) e da Pilha (LIFO) em tempo real.

---

## 6. Declaração de Fontes, Adaptações e IA (Slide 28 do PDF)

Em conformidade com as diretrizes do Prof. Fábio Guimarães sobre transparência:

* **Bibliografia de Referência:**
  1. **CORMEN, T. H. et al.** *Algoritmos: Teoria e Prática*. 3. ed. Elsevier, 2012. (Capítulo 22: Algoritmos Elementares para Grafos — convenção de cores e timestamps $d[u]/f[u]$).
  2. **GOODRICH, M. T.; TAMASSIA, R.** *Estruturas de Dados e Algoritmos em Java*. 5. ed. Bookman, 2013. (Capítulo 13: Grafos e listas de adjacência).
  3. **SEDGEWICK, R.; WAYNE, K.** *Algorithms*. 4th ed. Addison-Wesley, 2011. (Seção 4.1).
* **Fontes Didáticas Complementares:**
  * **Visualize DSA** (`visualizedsa.com`): Referência interativa para visualização de travessia em árvores e grafos.
  * Augusto Galego (YouTube): Exemplo didático de DFS em árvore binária (LeetCode 129 - *Sum Root to Leaf Numbers*).
* **Adaptações Realizadas pela Equipe:**
  * O algoritmo de árvore foi estendido para **Grafos Gerais com múltiplos ciclos**, implementando proteção com `Set<String> visitados` para impedir loops infinitos e estouro de memória/pilha.
  * Inclusão de critério determinístico de desempate por **ordem alfabética** dos vizinhos para fins pedagógicos e reprodutibilidade do exercício.
  * Implementação tanto da versão recursiva quanto da versão iterativa (com `Stack`) do DFS para espelhar a `Queue` do BFS.
* **Uso de Inteligência Artificial (Transparência conforme Slide 28):**
  * A IA generativa (Gemini) foi utilizada como ferramenta de suporte no brainstorming, na estilização visual dos slides e na estruturação do simulador web em HTML/SVG. Todo o código Java, a suíte de testes de casos limites, as tabelas de estado e os exercícios foram integralmente revisados, testados, compreendidos e validados pelos integrantes da equipe.
