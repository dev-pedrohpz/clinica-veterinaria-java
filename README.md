# Clínica Veterinária - Java (POO)

Projeto desenvolvido como parte de uma avaliação prática da disciplina de Programação Orientada a Objetos (ADS – 3º semestre).

## Descrição
Aplicação simples em Java para simular o funcionamento básico de uma clínica veterinária, com cadastro de profissionais e clientes, além da simulação de atendimentos.

O sistema foi estruturado utilizando conceitos fundamentais de POO, como herança e sobrescrita de métodos.

## Funcionalidades
- Cadastro de veterinário
- Cadastro de cliente
- Exibição de dados cadastrados
- Simulação de atendimento
- Cálculo do valor da consulta com adicional para urgência

## Estrutura do projeto
- `Pessoa`: classe base com atributos comuns
- `Veterinario`: herda de Pessoa e possui dados específicos e cálculo da consulta
- `Cliente`: herda de Pessoa e possui informações do animal
- `Main`: responsável pela interação com o usuário

## Tecnologias e conceitos utilizados
- Java
- Programação Orientada a Objetos
- Herança
- Sobrescrita de métodos
- Encapsulamento
- Construtores
- Entrada de dados com Scanner

## Aprendizados
- Estruturação de hierarquia de classes
- Separação de responsabilidades entre classes
- Implementação de comportamento específico em subclasses
- Organização da lógica de negócio dentro das classes

## Melhorias futuras
- Implementar validação de dados de entrada
- Permitir cadastro de múltiplos clientes e veterinários
- Melhorar a modelagem do sistema (ex: atendimentos como entidade própria)
