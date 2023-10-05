# Projeto de Programação - Gerenciamento de Equipamentos

Este é um projeto de programação orientada a objetos em Java, que visa criar um sistema para gerenciar o uso de equipamentos em uma empresa de TI (Tecnologia da Informação).

## Primeira Avaliação

Nesta etapa parcial, você deve realizar as seguintes tarefas:

### Tarefas a serem realizadas

A) **Classe Equipamento.java**: Programar uma classe `Equipamento.java`, que representa um equipamento na empresa de TI. Esta classe deve conter os seguintes atributos: `codigo` (número de patrimônio do equipamento) e `descricao`.

B) **Classe Usuario.java**: Programar uma classe `Usuario.java`, que representa um usuário que possui o equipamento. Esta classe deve conter os atributos `nome` e `setor`.

C) **Associação entre Equipamento e Usuário**: Programar a associação entre as classes `Equipamento.java` e `Usuario.java`.

D) **Método Main**: Programar um método `main` em uma classe criada apenas para contê-lo. O método `main` deve instanciar 2 equipamentos com seus respectivos usuários, um com dados atribuídos em código e outro com dados inseridos pelo usuário por entrada de teclado.

E) **Exibição dos Equipamentos**: No método `main`, exibir os equipamentos criados no seguinte formato:

Usuário: <nome do usuário> alocado em <setor>

Equipamento: <descrição do equipamento> (<código do equipamento>)


### Aspectos de Implementação

- Todos os atributos devem possuir visibilidade `private`.
- As classes `Equipamento.java` e `Usuario.java` devem oferecer um método construtor que atualize todos os atributos.
- Os nomes de classes, atributos e métodos devem seguir as boas práticas de programação Java.
- Respeitando os itens acima e o paradigma orientado a objetos, você pode incluir qualquer tipo de estrutura que julgar necessária para a solução.

## Segunda Avaliação

Nesta etapa final, continuaremos a construir o sistema de gerenciamento de equipamentos:

### Tarefas a serem realizadas

A) **Classe EquipamentoMovel.java**: Programar uma subclasse de `Equipamento.java`, chamada `EquipamentoMovel.java`. Esta classe representa equipamentos que podem ser deslocados livremente pelos usuários e deve conter os seguintes atributos:
- `peso` (peso do equipamento em quilos).
- `seguro` (um atributo que aceita apenas os valores "S" ou "N" para representar "sim" ou "não" em relação ao seguro do equipamento).

B) **Classe EquipamentoFixo.java**: Programar uma subclasse de `Equipamento.java`, chamada `EquipamentoFixo.java`. Esta classe representa equipamentos mantidos em um determinado local da empresa e deve conter o atributo `local` (sala em que o equipamento está localizado).

C) **Método Main**: Programar um método `main` em uma classe criada apenas para contê-lo. O método `main` deve oferecer um menu para gerenciar um conjunto de equipamentos, permitindo ao usuário realizar as seguintes funcionalidades:
1. Incluir Equipamento: Adicionar todos os dados dos equipamentos, sejam móveis ou fixos, e seus usuários.
2. Pesquisar Equipamento: Visualizar todos os dados de um equipamento e de seu usuário, bem como verificar se ele é móvel ou fixo.
3. Remover Equipamento: Excluir um equipamento do conjunto.
4. Sair: Exibir o total de equipamentos do conjunto e encerrar o programa.

### Aspectos de Implementação

- Todos os atributos devem possuir visibilidade `private`.
- Todas as classes que geram instâncias devem ter um método construtor que atualize todos os atributos.
- Os nomes de classes, atributos e métodos devem seguir as boas práticas de programação Java.
- Respeitando os itens acima e o paradigma orientado a objetos, você pode incluir qualquer tipo de estrutura que julgar necessária para a solução.


