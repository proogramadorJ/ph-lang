# PH-Lang

PH-Lang is an interpreter for a subset of Kotlin, developed as a learning project to understand compiler and interpreter design principles.

## Project Overview

This project aims to implement a simple interpreter that can parse and execute a limited subset of the Kotlin programming language. It serves as an educational tool to learn about various phases of compilation and interpretation, such as:

- Lexical analysis
- Syntax parsing
- Abstract syntax tree (AST) construction
- Semantic analysis
- Interpretation/execution

## Purpose

The main purpose of this project is educational. By building a simplified interpreter for a subset of Kotlin, it provides hands-on experience with compiler theory and implementation techniques. This project is not intended for production use but rather as a learning resource for those interested in understanding how programming languages are processed and executed.

## Current Status

The project is in its early stages of development. The basic project structure has been set up with Maven, but the interpreter implementation is not yet started.

## Technical Details

- **Language**: Java 17
- **Build System**: Maven
- **Group ID**: com.pedrodev
- **Artifact ID**: phlang

## Getting Started

To build and run the project:

1. Ensure you have Java 17 and Maven installed
2. Clone the repository
3. Run `mvn clean install` to build the project
4. Execute the main class with `java -cp target/phlang-1.0-SNAPSHOT.jar com.pedrodev.Main`

## Future Development

Future development will focus on implementing the core components of the interpreter:
- Lexer for tokenizing Kotlin code
- Parser for creating an abstract syntax tree
- Evaluator for executing the parsed code

## License

This project is open source and available for educational purposes.