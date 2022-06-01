#language:pt
Funcionalidade: Testar página web
  Como candidato a funcionário Accenture
  Eu preciso realizar o teste
  Para que eu possa obter exito

  Cenario: Preencher formulário
    Dado que eu esteja na página do formulário Enter Vehicle Data
    Quando eu preencher o formulário Enter Vehicle Data
    E clicar o botão Next Enter Insurant Data
    E preencher o formulário Enter Insurant Data
    E clicar o botão Next Enter Product Data
    E preencher o formulário Enter Product Data
    E clicar o botão Next Select Price Option
    E preencher o formulário Select Price Option
    E clicar o botão Next Send Quote
    E preencher o formulário Send Quote
    E clicar o botão Send
    Então eu receberei a mensagem Sending e-mail success