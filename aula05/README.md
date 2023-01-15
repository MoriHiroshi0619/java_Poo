## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

    banco

+numConta
#tipo corrente ou poupanca (cc / cp)
-dono 
-saldo
-status aberta ou fechada

+abrirconta() -> mudar status true
+fechar() -> não pode ter dinheiro e nem debido
+depositar() -> conta tem que tá aberta
+sacar() -> tem que ter saldo o suficiente 
+pagatMensalidade() -> diminui saldo cc 12 reais e cp 20 reais

fazer os getter e os setter dos atributos

*se o cara abrir cc ele já comeca com saldo de 50reais ou se abrir uma conta cp começa com 150 reais
