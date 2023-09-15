# Collections: Interface List

- Parte teórica

Códigos de exemplo retirados do curso de Fundamentos da Programação Orientada a Objetos com Java da DIO professora ![Camila Cavalcante](https://github.com/cami-la).

## Interface List e Suas Implementações

A interface `List` é uma coleção ordenada que permite a inclusão de elementos duplicados. Os usos mais comuns da classe são o `ArrayList` e o `LinkedList`. A `List` é como uma matriz de **comportamento dinâmico**, ou seja, é possível fazer edições como:

- **Adicionar** elementos em posições expecíficas;
- **Deletar** elementos em posições específicas;
- **Substituir** elementos em posições específicas;
- Montar **sublistas**.
- **Ordenar** a lista (método `sort` do Collections);
- **Embaralhar** a lista (método `shuffle` do Collections);
- **Inversão** de ordem (método `reverse` do Collections);
- **Busca binária** (método `binarySearch` do Collections);

## Tipos de Listas

### ArrayList

É a implementação da interface `List` que armazena os elementos em uma **estrutura de array redimensionável**, ou seja, pode crescer a medida em que os elementos são adicionados.

**Vantagens:** acesso rápido aos elementos pelo seu índice.

**Desvantagens:** adicionar e remover elementos pode ser um processo longo, já que precisa realocar elementos.

### LinkedList

É a implementação da interface `List` em que os **elementos armazenados** apresentam um vínculo com o elemento que antecedente e com o elemento seguinte, ou seja, é **duplamente vinculado**.

**Vantagens:** agilidade na adição e na remoção de elementos nas posições finais e iniciais.

**Desvantagens:** Para acionar um elemento específico é necessário percorrer toda a lista até aquele elemento, o que torna o processo mais lento.

### Vector

Praticamente em desuso é uma implementação antiga da interface List que é semelhante ao ArrayList, mas é sincronizada, ou seja, é thread-safe. Isso significa que várias threads podem manipular um objeto Vector ao mesmo tempo sem causar problemas de concorrência. No entanto, essa sincronização adiciona uma sobrecarga de desempenho, tornando o Vector menos eficiente do que o ArrayList em cenários em que a concorrência não é um problema. Por esse motivo, o uso do Vector é menos comum em aplicações modernas.

## Operações Básicas com o List (exemplificadas)

![Link exemplo de código dos itens abaixo](link meu github)

### Lista de tarefas

- `adicionarTarefa(String descricao)`: Adiciona uma nova tarefa à lista com a descrição fornecida;
- `removerTarefa (String descricao)`: Remove uma nova tarefa à lista com a descrição fornecida;
- `obterNumeroTotalTarefas()`: Retorna o número total de tarefas;
- `obterDescricaoTarefas()`: Retorna uma lista com a descrição de cada tarefa.

### Carrinho de Compras

- `adicionarItem(String nome, double preco, int quantidade)`: Adiciona um item ao carrinho com seus atributos;
- `removerItem(String nome)`: Remove do carrinho um item com base no seu atributo nome;
- `calcularValorTotal()`: Retorna o valor total do carrinho considerando os valor dos itens e suas quantidades;
- `exibirItens()`: Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.

### Pesquisa em List

- `pesquisarItem(String nome)`: Pesquisa itens com base no nome e retorna as opções encontradas;
- `pesquisarIntervaloValor(double precoInicial, double precoFinal)`: Pesquisa os itens dentro do intervalo estabelicido e retorna uma lista com opções encontradas;

### Comparações

- `encontrarMaiorValor()`: Retorna o item de maior valor;
- `encontrarMenorValor()`: Retona o numero com menor valor;
- exibirValores(): retorna uma lista com os valores dos itens;

### Ordenação

- `ordenarValor()`: Ordena os itens de acordo com o valor usando o Comparable;
- `ordenarQuantidade()`: Ordena de acordo com a quantidade usando o Comparator;
- `ordenarDecrescenteValor()`: Ordena de acordo com o valor usando o Comparable.
