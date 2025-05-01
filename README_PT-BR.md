# PH-Lang

PH-Lang é um interpretador para um subconjunto de Kotlin, desenvolvido como um projeto de aprendizado para entender os princípios de design de compiladores e interpretadores.

## Visão Geral do Projeto

Este projeto visa implementar um interpretador simples que pode analisar e executar um subconjunto limitado da linguagem de programação Kotlin. Serve como uma ferramenta educacional para aprender sobre várias fases de compilação e interpretação, como:

- Análise léxica
- Análise sintática
- Construção de árvore de sintaxe abstrata (AST)
- Análise semântica
- Interpretação/execução

## Propósito

O principal propósito deste projeto é educacional. Ao construir um interpretador simplificado para um subconjunto de Kotlin, ele proporciona experiência prática com teoria de compiladores e técnicas de implementação. Este projeto não é destinado para uso em produção, mas sim como um recurso de aprendizado para aqueles interessados em entender como as linguagens de programação são processadas e executadas.

## Status Atual

O projeto está em seus estágios iniciais de desenvolvimento. A estrutura básica do projeto foi configurada com Maven, mas a implementação do interpretador ainda não foi iniciada.

## Detalhes Técnicos

- **Linguagem**: Java 17
- **Sistema de Build**: Maven
- **Group ID**: com.pedrodev
- **Artifact ID**: phlang

## Começando

Para construir e executar o projeto:

1. Certifique-se de ter Java 17 e Maven instalados
2. Clone o repositório
3. Execute `mvn clean install` para construir o projeto
4. Execute a classe principal com `java -cp target/phlang-1.0-SNAPSHOT.jar com.pedrodev.Ph`

## Desenvolvimento Futuro

O desenvolvimento futuro se concentrará na implementação dos componentes principais do interpretador:
- Lexer para tokenização de código Kotlin
- Parser para criar uma árvore de sintaxe abstrata
- Avaliador para executar o código analisado

## Licença

Este projeto é de código aberto e disponível para fins educacionais.