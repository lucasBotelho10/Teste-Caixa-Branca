# Teste de Caixa Branca - ETAPA 2

## Introdução

### O que é grafo de Fluxo
O grafo de fluxo é uma representação visual que descreve como um programa se move de um ponto a outro. Usa nós para representar etapas e linhas para mostrar conexões entre eles. Os nós de decisão indicam escolhas baseadas em condições, como "if" ou "switch". Ajuda a entender o comportamento do software e é crucial para planejar e executar testes de forma eficaz, identificando trajetórias críticas e pontos de falha. Permite uma visão clara do fluxo de execução do código.

### O que é Complexidade Ciclomática
A complexidade ciclomática é uma métrica que avalia a complexidade de um programa. É calculada a partir do número de caminhos independentes no grafo de controle de fluxo. Quanto mais alta, maior a complexidade do código. É útil para planejar testes adequados e entender a extensão da complexidade do programa. Permite avaliar a quantidade de testes necessários para uma cobertura completa. Ajuda a identificar áreas críticas para testes minuciosos. Formula para o calculo: V(G) = (ARESTAs - NóS) + 2

## Exercício Proposto
Na etapa-2 é proposto que seja feito um grafo de fluxo com o código de teste de caixa branca, os cálculos da complexidade ciclomática e a identificação da contidades de caminhos e a montagem de suas sequências.

### Grafo de Fluxo
![grafo](https://github.com/lucasBotelho10/Teste-Caixa-Branca/assets/113216728/719a08a6-27a8-4cf7-935e-6eaa088151e0)


### Calculo complexidade ciclomática
#### o grafo possui 24 arestas e 22 nós, aplicando na formula é encontrato o seguinte resultado:
#### V(G) = (ARESTAS - NÓS) + 2
#### V(G) = (24 -22) + 2 
#### V(G) = 2 + 2
#### V(G) = 4

### Montagem da sequência
#### Como pode ser visto no grafo de fluxo o código possui 8 caminhos, que são: 
#### 1: 1-2-3-4-5-8-9-10-11-12-13-14-15-18-21-22
#### 2: 1-2-3-4-5-6-7-8-9-10-11-12-13-14-15-18-21-22
#### 3: 1-2-3-4-5-6-7-8-9-10-11-12-13-14-15-16-17-18-21-22
#### 4: 1-2-3-4-5-6-7-8-9-10-11-12-13-14-15-18-19-20-21-22
#### 5: 1-2-3-4-5-8-9-10-11-12-13-14-15-16-17-18-21-22
#### 6: 1-2-3-4-5-8-9-10-11-12-13-14-15-16-17-18-19-20-21-21
#### 7: 1-2-3-4-5-8-9-10-11-12-13-14-15-18-19-20-21-22
#### 8: 1-2-3-4-5-6-7-8-9-10-11-12-13-14-15-16-17-18-19-20-21-22




