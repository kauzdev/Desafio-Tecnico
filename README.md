# Desafio Técnico

Implementação das soluções propostas em um desafio técnico, utilizando Java e Maven.

## Sobre o projeto

Este projeto contém as soluções desenvolvidas para três problemas propostos no desafio técnico.

### 1. Cálculo de comissão de vendedores

O programa realiza a leitura dos registros de vendas e calcula a comissão de cada vendedor de acordo com o valor de cada venda.

Regras de comissão:

- Vendas abaixo de R$ 100,00: não geram comissão.
- Vendas abaixo de R$ 500,00: geram 1% de comissão.
- Vendas a partir de R$ 500,00: geram 5% de comissão.

Os dados das vendas são disponibilizados em formato JSON.

### 2. Movimentação de estoque

O programa permite realizar movimentações de entrada e saída de mercadorias no estoque dos produtos.

Cada movimentação possui:

- Número identificador único.
- Descrição para identificar o tipo da movimentação.
- Quantidade movimentada.

Ao final da movimentação, o programa informa a quantidade final disponível em estoque para o produto movimentado.

### 3. Cálculo de juros por atraso

O programa calcula o valor dos juros com base em um valor informado e em sua data de vencimento.

Para o cálculo, é considerada uma multa de 2,5% ao dia.

## Tecnologias utilizadas

- Java
- Maven
- JSON

## Estrutura do projeto

```text
DesafioTecnico/
├── pom.xml
├── src/
│   ├── Main.java
│   └── main/
│       ├── java/
│       │   ├── desafio1/
│       │   │   ├── CalculadoraComissao.java
│       │   │   ├── DadosVenda.java
│       │   │   ├── Main.java
│       │   │   ├── RelatorioComissao.java
│       │   │   └── Venda.java
│       │   │
│       │   ├── desafio2/
│       │   │   ├── EstoqueService.java
│       │   │   ├── Main.java
│       │   │   ├── Movimentacao.java
│       │   │   ├── Produto.java
│       │   │   └── TipoMovimentacao.java
│       │   │
│       │   └── desafio3/
│       │       ├── CalculadoraJuros.java
│       │       └── Main.java
│       │
│       └── resources/
│           └── vendas.json
│
└── .gitignore
```

## Como executar

### Pré-requisitos

Para executar o projeto, é necessário ter instalado:

- Java
- Maven

### Clonando o repositório

```bash
git clone https://github.com/kauzdev/Desafio-Tecnico.git
```

Acesse a pasta do projeto:

```bash
cd Desafio-Tecnico
```

### Compilando o projeto

Execute:

```bash
mvn compile
```

Após a compilação, os programas de cada desafio podem ser executados a partir de suas respectivas classes `Main`.

## Autor

**Kauã Bernardo**

Projeto desenvolvido como parte de um processo seletivo para uma oportunidade na área de desenvolvimento.
