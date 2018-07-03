# language: pt

  Funcionalidade: Testar falha de conexão durante uma partida multiplayer de buraco aberto

  Cenário: Acessar a sala multiplayer dois jogadores na modalidade buraco aberto
    Dado que estou na tela VIP
    Quando Eu pressiono o bota sair
    E que estou na tela inicial do aplicativo
    E eu pressiono o botao multiplayer
    E eu entro na sala como visitante
    E eu escolho a sala com dois jogadores
    E ocorre uma queda de conexao da internet durante a partida
    Entao o sistema exibe mensagem informando que houve um problema
    E eu devo confirmar a mensagem
    Entao o sistema retorna para a tela inicial
