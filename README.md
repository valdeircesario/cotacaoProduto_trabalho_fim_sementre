# Cotação de Produto

O projeto "Cotação de Produto" foi desenvolvido como uma solução para gerenciamento e cotação de preços de produtos em diversas lojas. O sistema foi elaborado seguindo o padrão de arquitetura MVC (Model-View-Controller), com uma interface construída utilizando JSwing e o back-end integrado com um banco de dados MySQL/MariaDB. Além disso, o sistema inclui tratamento de exceções e validação de entrada de dados para garantir a robustez e a confiabilidade das operações.

## Tecnologias Utilizadas

<div style="display: inline_block"><br>
   <img  align="center" alt="VAL-intelij" height="50" width="60" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/intellij/intellij-original.svg" >
   <img align="center" alt="VAL-Java" height="50" width="60" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg">
  <img align="center" alt="VAL-MySQL" height="50" width="60" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/mysql/mysql-original-wordmark.svg">

</div>
<P></P>

- **MySQL/MariaDB**: Banco de dados para armazenamento das informações dos produtos e cotações.
- **Java**: Linguagem de programação utilizada para desenvolver a lógica do sistema.
- **JSwing**: Biblioteca gráfica para a criação da interface do usuário.
- **IntelliJ IDEA**: Ambiente de desenvolvimento integrado (IDE) utilizado para o desenvolvimento do projeto.
- **Padrão MVC**: Arquitetura escolhida para separação de preocupações, facilitando a manutenção e escalabilidade do sistema.

## Funcionalidades

- **Cadastro de produtos**: Permite inserir novos produtos no sistema com suas respectivas informações.
- **Consulta de cotações**: Oferece a funcionalidade de consultar preços de produtos em diferentes lojas.
- **Validação de dados**: Garante que as entradas fornecidas pelos usuários sejam válidas antes de processá-las.
- **Tratamento de exceções**: Gerencia erros no sistema para evitar falhas durante a execução.

## Contribuições

Este projeto foi desenvolvido em parceria com [Danilo Gabriel](https://github.com/Danilo-Gabriel), cuja contribuição foi essencial para o desenvolvimento das funcionalidades de banco de dados e interface gráfica.

## Configuração do Projeto

### Pré-requisitos

Antes de executar o projeto, você precisa ter o MySQL ou MariaDB instalado e configurado em seu sistema. Além disso, é necessário ter o Java JDK instalado para executar o código Java.

### Configuração do Banco de Dados

1. Crie o banco de dados no MySQL/MariaDB:
   ```sql
   CREATE DATABASE cotacao_produto;
   
## Execução do Projeto
2. Clone o repositório:
 ```bash
git clone https://github.com/seu-usuario/cotacao-produto.git

2.Abra o projeto no IntelliJ IDEA.
3.Configure o arquivo db.properties (ou similar) com as credenciais do seu banco de dados.
4.Execute o projeto através do IntelliJ IDEA, iniciando pela classe principal que contém o método main.

