
# Sistema de Barbearia - Java MVC

Este projeto é um exemplo de aplicação Java para gerenciamento de uma barbearia, seguindo os princípios SOLID, coesão e arquitetura MVC, com as classes organizadas em packages.

## Estrutura do Projeto

- `src/model`: Contém as classes de domínio (Cliente, Barbeiro, Servico, Agendamento, Pagamento).
- `src/repository`: Camada de acesso a dados (CRUD em memória para cada entidade).
- `src/service`: Camada de regras de negócio, intermediando controllers e repositories.
- `src/controller`: Camada de controle, responsável por orquestrar as operações das entidades.
- `src/main`: Classe principal para execução do sistema.

## Processo de Desenvolvimento

1. **Modelos (Model):**
	- Criação das entidades principais da barbearia.
2. **Controllers:**
	- Gerenciam as operações básicas (adicionar, remover, listar) de cada entidade.
3. **Repositories:**
	- Responsáveis pelo armazenamento e recuperação dos dados (simulação em memória).
4. **Services:**
	- Implementam regras de negócio e utilizam os repositories.
5. **Main:**
	- Classe de entrada do sistema, demonstrando o uso das camadas.

## Como Executar

1. Certifique-se de ter o JDK instalado (Java 17+ recomendado).
2. Compile o projeto (pode ser pelo VS Code ou terminal):
	```sh
	javac -d bin src/model/*.java src/repository/*.java src/service/*.java src/controller/*.java src/main/Main.java
	```
3. Execute a classe principal:
	```sh
	java -cp bin main.Main
	```

## Observações
- O projeto utiliza armazenamento em memória (não persiste dados em disco).
- O código é modularizado para facilitar manutenção e evolução.
- Sinta-se à vontade para expandir funcionalidades, adicionar persistência real ou interface gráfica.

## Diagrama de Atividades
<img width="951" height="808" alt="diagrama_sistema_barbearia drawio" src="https://github.com/user-attachments/assets/11e85d14-6a90-4eef-8b8d-7a4720ffd390" />

---

Desenvolvido para fins didáticos, seguindo boas práticas de arquitetura de software.
