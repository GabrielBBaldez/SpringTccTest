# API Spring Boot

## Visão Geral

Este projeto é uma API RESTful implementada usando o framework Spring Boot, projetada para comparação de desempenho com o Quarkus. A API fornece operações CRUD e foi implantada na AWS EC2 com conexão a um banco de dados RDS.

## Destaques de Desempenho

Com base na análise de desempenho, esta implementação em Spring Boot se destaca em:

- **Operações de Criação e Atualização**: Desempenho significativamente melhor em operações POST (31% menor latência) e PUT (46% menor latência) em comparação com o Quarkus
- **Taxa de Transferência de Dados**: Maior throughput em operações POST (130% maior), PUT (70% maior) e DELETE (879% maior)
- **Escalabilidade em Operações de Escrita**: Aumento mais gradual da latência sob carga crescente em cenários de escrita

## Detalhes Técnicos

### Ambiente
- **Hospedagem**: AWS EC2
- **Banco de Dados**: AWS RDS
- **Testes**: Aproximadamente 1000 requisições por tipo de operação

### Métricas de Desempenho

| Operação | Latência Média (ms) | Throughput (B/s) | Requisições/seg |
|----------|---------------------|------------------|-----------------|
| GET      | 1748,44             | 146,63           | 0,56            |
| POST     | 1398,68             | 177,04           | 0,65            |
| PUT      | 1574,59             | 303,70           | 0,44            |
| DELETE   | 1241,92             | 98,95            | 0,75            |

### Pré-requisitos
- Java 17
- Maven 
- Conta AWS (para implantação similar)

### Instalação

```bash
# Clone o repositório
git clone [url-do-repositório]

# Navegue até o diretório do projeto
cd [diretório-do-projeto]

# Construa o projeto
./mvnw clean package

# Execute a aplicação
java -jar target/[nome-da-aplicação].jar
```

### Configuração

Edite o arquivo `application.properties` para configurar o banco de dados:
