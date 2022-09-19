#language:pt 
#Author:nilosdan8@gmail.com


Funcionalidade: efetuar cadastro no site de entregas
  Como prestador de servicos
  Quero realizar o meu cadastro
  Para realizar entregas

  Contexto: Acessar a tela de cadastro
  Dado que eu esteja na tela de cadastro
   
   @positivo 
  Cenario: Realizar cadastro metodo moto
   E preencha dados pessoais validos 
   E preencha endereco valido
   E selecione tipo de veiculo
   Quando envie a foto da cnh valida
   Entao clicar em cadastre-se para fazer entregas 
   E valido as informacoes
   
   
   
   @negativo
   Cenario: Realizar cadastro com dados pessoais em branco
   E Nao preencha os dados pessoais
    E preencha endereco valido
   E selecione tipo de veiculo
   Quando envie a foto da cnh valida
   Entao clicar em cadastre-se para fazer entregas 
   E valido a falha no envio de informacoes
   
   
   
   
   

   