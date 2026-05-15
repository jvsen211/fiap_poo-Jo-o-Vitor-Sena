# Projeto FiapRide - João Vitor Angeloti Sena

## Informações do Aluno

- **Nome:** João Vitor Angeloti Sena
- **RM:** 563473
- **Turma:** 2CCPC
- **Curso:** Ciências da Computação
- **GitHub:** @jvsen211

---

## Descrição do Projeto

Este projeto é o resultado do aprendizado nas aulas 1-9 de Programação Orientada a Objetos, onde desenvolvemos o sistema **FiapRide** (aplicativo de mobilidade urbana). O objetivo é aplicar conceitos fundamentais de POO como classes, objetos, encapsulamento, herança, polimorfismo, abstração e interfaces em um sistema prático.

---

## Checklist de Implementação

- [x] Aula 1 - Classes e Objetos
- [x] Aula 2 - Métodos
- [x] Aula 3 - Encapsulamento
- [x] Aula 4 - Construtores
- [x] Aula 5 - Associação
- [x] Aula 6 - Herança
- [x] Aula 7 - Polimorfismo
- [x] Aula 8 - Classes Abstratas
- [x] Aula 9 - Interfaces

---

## Perguntas de Reflexão

### Aula 1 - Classes e Objetos

Criar classes como `Passageiro` ou `Veiculo` é essencial para organizar o sistema em entidades reais do mundo. Se usássemos apenas variáveis soltas no `main`, o código ficaria desorganizado e impossível de escalar. Com classes, conseguimos representar múltiplos usuários e veículos de forma estruturada e reutilizável, facilitando manutenção e expansão do sistema.

---

### Aula 2 - Métodos

Criar métodos como `adicionarSaldo()` é importante para controlar regras de negócio. Se qualquer parte do sistema puder alterar o saldo diretamente, isso pode gerar erros e fraudes. Com métodos, conseguimos validar regras antes de alterar os dados, garantindo segurança e consistência no sistema.

---

### Aula 3 - Encapsulamento

Deixar atributos como `private` protege os dados do sistema. O uso de getters permite leitura segura, enquanto setters controlam alterações. Isso evita que qualquer parte do código modifique valores importantes sem validação, garantindo integridade e segurança dos dados.

---

### Aula 4 - Construtores

Construtores ajudam a garantir que os objetos sejam criados de forma válida. O uso de `this()` permite reutilizar construtores, evitando repetição de código e deixando a inicialização mais organizada. Isso melhora a manutenção e reduz erros de duplicação de lógica.

---

### Aula 5 - Associação

Usar objetos completos (como `Passageiro` dentro de `Viagem`) inicialmente foi um pouco confuso, pois parecia mais simples utilizar apenas Strings. Porém, com o desenvolvimento do projeto, entendi que a associação permite representar melhor as relações reais entre as entidades e facilita o acesso a dados completos e regras de negócio mais consistentes.
---

### Aula 6 - Herança

A herança permite reutilizar atributos e métodos comuns em uma classe base. O Java restringe acesso a atributos `private` para manter encapsulamento e forçar o uso de métodos controlados como getters e setters. Isso protege a integridade dos dados e evita alterações diretas indevidas.

---

### Aula 7 - Polimorfismo

O polimorfismo foi um dos conceitos que tive mais dificuldade para entender no início, principalmente em relação ao uso de tipos genéricos e sobrescrita de métodos. Com a prática no projeto, consegui entender melhor como diferentes classes podem ser tratadas de forma uniforme através de uma classe ou interface base, facilitando a organização e reutilização do código.
---

### Aula 8 - Classes Abstratas

Classes abstratas representam conceitos que não devem ser instanciados diretamente. No meu projeto, percebi que a interface `FichaTecnica` já cumpria o papel de definir comportamento obrigatório, então a abstração foi simplificada para evitar redundância e manter o código mais limpo.

---

### Aula 9 - Interfaces

A parte de interfaces também foi um pouco difícil no começo, pois não estava claro a diferença entre interface e herança. Com o desenvolvimento do projeto, entendi que a interface funciona como um contrato que obriga as classes a implementarem determinados métodos, permitindo mais flexibilidade e organização no sistema.

---

## Desafios Técnicos Implementados

### Projeto

Sistema de instrumentos musicais (Guitarra, Bateria e Amplificador).

### Classes criadas

- Especificacao
- Guitarra
- Bateria
- Amplificador
- FichaTecnica (interface)

---

### Maior desafio técnico

O maior desafio foi entender a diferença entre herança e interfaces e quando usar cada uma. No início tentei usar uma classe abstrata para tudo, mas percebi que a interface era mais adequada para definir comportamentos obrigatórios. Também foi desafiador organizar a relação entre os instrumentos e o amplificador, garantindo que a associação fizesse sentido dentro da lógica do sistema.

---

## Conclusão

### O que aprendi

Aprendi a estruturar um sistema usando POO de forma organizada, aplicando conceitos como encapsulamento, herança, polimorfismo e interfaces. Também entendi a importância de pensar na modelagem do sistema antes de escrever o código.

### Conceito mais difícil

O mais difícil foi entender a diferença entre herança e interface, e quando cada uma deve ser usada. Isso ficou mais claro durante a implementação prática do projeto.

### Melhorias futuras
