# PalindromeVerification
                
## Atividade Avaliativa

Esta atividade avaliativa é referente à aula 1.
## Introdução

Esta atividade tem por objetivo avaliar o desempenho dos discentes na resolução de problemas de programação referentes ao conteúdo visto em sala.

Devem ser entregues o código-fonte e um relatório, onde deve ser explicado o problema a ser resolvido de maneira geral, os algoritmos e/ou estruturas de dados utilizados para resolver o problema, e como o mesmo foi resolvido.

A linguagem de programação utilizada para a resolução da atividade é de escolha dos discentes. Não devem ser utilizados conceitos fora do escopo da disciplina, como banco de dados, programação paralela, entre outros, nem de fora do conteúdo visto na aula.

O programa não deve fazer acesso a nenhum outro processo do mesmo ou outro computador, nem acesso a APIs, web services ou semelhantes.

O processamento só deve ser iniciado após a entrada de todos os dados de entrada. Os testes de desempenho serão realizados nos PCs do laboratório onde as aulas ocorrem. Considere o hardware e o software destes PCs na resolução do problema.

## Data e local de entrega

A entrega deve ser feita, pelo Moodle, até às 18:59 de 28/set/2023.

## Descrição do problema

Palíndromos são frases ou palavras que possuem a mesma configuração quando lidas do primeiro ao último caractere, e vice-versa. Por exemplo, a palavra **ARARA** é um palíndromo, enquanto a palavra **CAFÉ*** não é um palíndromo.

No entanto, existem palavras que não são palíndromos, mas que, caso suas letras forem reorganizadas, elas podem formar um palíndromo. Por exemplo, a palavra **MORARAM** não é um palíndromo mas, caso a reorganizemos para a palavra **MARORAM**, esta sim será um palíndromo.

Seu programa deve ler um número inteiro positivo N, contendo a quantidade de palavras ou frases a serem lidas. Em seguida, ele deve ler N palavras ou frases, separadas por uma quebra de linha. Ao término da leitura, deve ser exibida a quantidade de palavras lidas que formam palíndromos, com zero ou mais reorganizações de seus caracteres.

As palavras de entrada possuem todos caracteres em caixa alta, sendo que acentos e caracteres especiais não são utilizados.
## Limitação de recursos

**Consumo de memória:** o executável não deve exceder o consumo de 1MB de memória RAM durante sua execução.

**Tempo de processamento:** o problema deve ser solucionado e ter sua saída exibida em, no máximo, 1 segundo.
## Exemplo de entrada e saída

A seguir exibe-se um exemplo de entrada e saída esperada. Outras entradas serão utilizadas na avaliação do problema.

<div style="display: flex;">
  <div style="flex: 50%; padding: 10px;">
    <p>Entrada</p>
    <pre>
ARARA
CAFE
MORARAM
    </pre>
  </div>
  <div style="flex: 50%; padding: 10px;">
    <p>Saída</p>
    <pre>
2
    </pre>
  </div>
</div>	
