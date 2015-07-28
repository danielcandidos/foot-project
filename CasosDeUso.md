|<a href='http://code.google.com/p/foot-project/'>Início</a>|<a href='http://code.google.com/p/foot-project/wiki/Desenvolvedores'>Desenvolvedores</a>|<a href='http://code.google.com/p/foot-project/wiki/Descricao'>Descrição do Sistema</a>|<a href='http://code.google.com/p/foot-project/wiki/Requisitos'>Requisitos</a>| **Casos de Uso** |<a href='http://code.google.com/p/foot-project/wiki/Diagramas'>Diagramas</a>|<a href='http://code.google.com/p/foot-project/wiki/Videos'>Vídeos</a>|
|:----------------------------------------------------------|:---------------------------------------------------------------------------------------|:--------------------------------------------------------------------------------------|:-----------------------------------------------------------------------------|:-----------------|:---------------------------------------------------------------------------|:---------------------------------------------------------------------|


---


## UC001 - Pesquisa nominal ##

| **Objetivo** | Encontrar o jogador desejado. |
|:-------------|:------------------------------|
| **Descrição** | O usuário digitará o nome do atleta pretendido. |
| **Ator**     | Usuário.                      |
| **Prioridade** | Alta.                         |
| **Pré-condição** | Nenhuma.                      |
| **Pós-condições** | Selecionar jogador.           |

## Cenários principais de sucesso ##

| **Usuário** |
|:------------|
| 1 - Jogador encontrado. |


| **Fluxos alternativos** |
|:------------------------|
| 1.Caso seja digitado um nome de jogador inexistente no campo destinado a busca retorna uma mensagem de erro: '' Jogador não encontrado ''. |


---


## UC002 - Pesquisar por lista ##

| **Objetivo** | Encontrar o jogador desejado. |
|:-------------|:------------------------------|
| **Descrição** | O usuário deverá selecionar em uma lista composta por todos os atletas existentes o jogador pretendido. |
| **Ator**     | Usuário.                      |
| **Prioridade** | Alta.                         |
| **Pré-condição** | Nenhuma.                      |
| **Pós-condições** | Selecionar jogador.           |

## Cenários principais de sucesso ##

| **Usuário** |
|:------------|
| 1 - Jogador encontrado. |

| **Fluxos alternativos** |
|:------------------------|
| 1.1                     |



---


## UC003 - Visualizar jogador ##

| **Objetivo** | Exibição dos dados e estatísticas do atleta. |
|:-------------|:---------------------------------------------|
| **Descrição** | Serão visualizados todos os dados (nome, altura, peso e data de nascimento) e estatísticas principais (jogos, gols, assistências, cartões amarelos, cartões vermelhos, faltas cometidas, faltas sofridas, finalizações e impedimentos). |
| **Ator**     | Usuário.                                     |
| **Prioridade** | Alta.                                        |
| **Pré-condição** | O jogador ser selecionado.                   |
| **Pós-condições** | Comparar jogador, filtrar por período ou voltar. |

## Cenários principais de sucesso ##

| **Usuário** |
|:------------|
| 1 - Os dados e estatísticas do jogador são exibidos.  |

| **Fluxos alternativos** |
|:------------------------|
| 1.1                     |


---


## UC004 - Comparar jogador ##

| **Objetivo** | Comparar dados e estatísticas de dois jogadores. selecionados. |
|:-------------|:---------------------------------------------------------------|
| **Descrição** | Serão visualizados lado a lado todos os dados e estatísticas dos jogadores selecionados pelo usuário. |
| **Ator**     | Usuário.                                                       |
| **Prioridade** | Média.                                                         |
| **Pré-condição** | Visualizar jogador.                                            |
| **Pós-condições** | Comparar jogador, filtrar por período ou voltar.               |

## Cenários principais de sucesso ##

| **Usuário** |
|:------------|
| 1 - As estatísticas dos dois jogadores são exibidas. |


| **Fluxos alternativos** |
|:------------------------|
| 1.1                     |


---


## UC005 - Filtrar estatísticas ##

| **Objetivo** | Exibir estatísticas filtradas por período de cada atleta. |
|:-------------|:----------------------------------------------------------|
| **Descrição** | O usuário selecionara o intervalo de anos desejado e por fim são mostradas as estatísticas filtradas do jogador referentes aquele período. |
| **Ator**     | Usuário.                                                  |
| **Prioridade** | Média.                                                    |
| **Pré-condição** | Visualizar jogador ou comparar jogador.                   |
| **Pós-condições** | Nenhuma.                                                  |

## Cenários principais de sucesso ##

| **Usuário** |
|:------------|
| 1 - As estatísticas pretendidas do(s) jogador(es) são exibidas. |


| **Fluxos alternativos** |
|:------------------------|
| 1.1                     |


---