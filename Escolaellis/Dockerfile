# Imagem base que já contém o Java Development Kit (JDK)
FROM openjdk:17-jdk-slim AS build

# Diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia o arquivo pom.xml e os arquivos de configuração do Maven para o contêiner
COPY pom.xml .
COPY src ./src

# Baixa as dependências do Maven e compila o projeto
# O -Dmaven.test.skip=true é usado para pular os testes durante a construção
RUN mvn clean install -Dmaven.test.skip=true

# Imagem base menor para a execução, que contém apenas o Java Runtime Environment (JRE)
FROM openjdk:17-jre-slim

# Define o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia o arquivo JAR compilado do estágio de construção para o estágio de execução
COPY --from=build /app/target/*.jar app.jar

# Expõe a porta em que a aplicação Spring Boot será executada (padrão é 8080)
EXPOSE 8080

# Comando para executar a aplicação Spring Boot quando o contêiner for iniciado
ENTRYPOINT ["java", "-jar", "app.jar"]