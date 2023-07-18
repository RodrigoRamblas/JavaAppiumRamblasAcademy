# Projeto de Automação Java com Appium
#### Este repositório contém um projeto de automação de teste usando Java e Appium, uma ferramenta de automação de teste para aplicativos móveis.

## Pré-requisitos
#### Antes de começar, verifique se você possui os seguintes pré-requisitos instalados:

- Java Development Kit (JDK)
- Apache Maven
- Android SDK
- Appium
- Emulador Android ou dispositivo físico para execução dos testes
#### Certifique-se de configurar corretamente as variáveis de ambiente para que os comandos Java, Maven e Appium sejam executados corretamente a partir do terminal.

## Configuração do Projeto

1. Clone este repositório em sua máquina local:
```
git clone https://github.com/seu-usuario/nome-do-repositorio.git
```

2. Navegue até o diretório do projeto:
```
cd nome-do-repositorio
```

4. Importe o projeto em sua IDE de preferência como um projeto Maven.

5. Configure as dependências necessárias no arquivo pom.xml.

6. Verifique se a configuração do Appium está correta no arquivo config.properties. Forneça as informações necessárias, como a URL do servidor Appium e as capacidades do dispositivo.

## Executando os Testes
#### Antes de executar os testes, certifique-se de que o emulador Android ou o dispositivo físico esteja conectado e pronto para uso.

1. Abra um terminal e navegue até o diretório do projeto.

2. Execute o seguinte comando para iniciar o servidor Appium:
```
appium
```

4. Em outra janela do terminal, execute o seguinte comando para executar os testes:
```
mvn test
```

#### Os testes serão executados no dispositivo ou emulador Android configurado, e você poderá ver os resultados no terminal.

## Contribuindo
#### Contribuições são bem-vindas! Se você quiser contribuir com este projeto, siga as etapas abaixo:

#### Faça um fork deste repositório.

#### Crie uma branch para sua nova funcionalidade ou correção de bug:
```
git checkout -b minha-nova-funcionalidade
```

#### Faça as alterações desejadas e adicione seus arquivos modificados:
```
git add .
```

#### Faça um commit de suas alterações:
```
git commit -m "Adicionando nova funcionalidade"
```

#### Faça um push para o repositório remoto:
```
git push origin minha-nova-funcionalidade
```

#### Abra uma Pull Request neste repositório.

#### Agradecemos antecipadamente suas contribuições!

## Licença
#### Este projeto está licenciado sob a MIT License.
