Desafio Gazeus

Objetivo
Verificar suas habilidades em definir cenários de testes necessárias para automatização dos testes.

Teste obrigatório
1 - Efetuar a troca de idioma do device para verificar se as labels do jogo estão corretas na tela inicial - Home. A alteração deve ser feita de Português para Inglês.
2 - Perder a conexão no lobby do MultiPlayer (momento do usuário deve escolher o tipo de jogo Aberto, Fechado ou STBL) e verificar se apresentará uma mensagem sobre a sua desconexão da internet ao tentar interagir com os tipos de jogo.  


Resumo
Testes automatizados realizados em JAVA (MAVEN), utilizando APPIUM
Testes manuais realizados na máquina virtual através do Genymotion e pelo dispositivo físico Moto G(4)

Cenários (Escritos em BDD)
1 -  Funcionalidade falha de conexão durante uma partida multiplayer de buraco aberto

  Cenário: Acessar a sala multiplayer dois jogadores na modalidade buraco aberto e ocorrer perda de conexao durante a partida
    Dado que estou na tela VIP
    Quando Eu pressiono o bota sair
    E que estou na tela inicial do aplicativo
    E eu pressiono o botao multiplayer
    E eu entro na sala como visitante
    E eu escolho o tipo de buraco: Buraco aberto
    E eu escolho a sala com dois jogadores
    E eu saio da tela de tutorial
    E ocorre uma queda de conexao da internet durante a partida
    Entao o sistema exibe mensagem informando que houve um problema
    E eu devo confirmar a mensagem
    Entao o sistema retorna para a tela Escolha o tipo de buraco

2 - Funcionalidade: Validar textos traduzidos no aplicativo para o idioma inglês (Americano)

  Cenário: Acessar aplicativo com o dispotivo configurado para o idioma ingles (Americano) e validar traducoes
    Dado que estou na tela VIP
    Quando Eu valido os textos traduzidos na tela vip para o idioma ingles (Americano)
    E eu pressiono o botao sair da tela vip
    E que estou na tela inicial do aplicativo
    E eu pressiono o botao Play Now
    E eu valido o texto do header em ingles (Choose the buraco game mode)
    E eu pressiono o botao Buraco aberto
   Entao eu valido as regras do jogo traduziadas para o idioma ingles (Americano)
   
Pré-Requisito para execução dos testes
1 - Realizar download do Genymotion com Virtual box e realizar sua instalação;
1.1 - Acessar https://www.genymotion.com/;
2 - Realizar download e instalar o JDK 1.8;


3 - Criar a váriável de ambiente JAVA_HOME apontando para o caminho de instalação do JDK, exempo: JAVA_HOME: C:\Program Files\Java\jdk1.8.0_91\bin;


4 - Realizar Download e instalar o Android SDK;


5 - Criar a váriavel de ambiente do ANDROID_HOME;


6 - Acessar o SDK Manager na pasta de instalação do passo 4 e atualizar o Android;
6.1 Abrir o SDK Manager;
6.2 Selecionar as opções 

6.2.1 Ramificação Tools: Android SDK Tool, Android SDK Platform-tools e Android SDK Build-tools (desmarcar todas as outras opções desta ramificação Tools);
6.2.2 Ramificação Android 4.4.2 (API 19) : SDK Platform e ARM EABI v7a System Image;

6.2.3 Selecionar o botão Install packages;
7 - Realizar o download e instalar o Appium (http://appium.io/);


8 - Na pasta de instalação do Android SDK, acessar o AVD Manager;
8.1 Criar o dispostivo virtual do Android com as seguintes configurações


AVD NAME: Nexus
DEVICE: Nexus 4
TARGET: Android 4.4.2 - API Level 19
CPU/ABI:ARM(armeabi-v7a)
Memory RAM: 2048
Internal Storage: 512

