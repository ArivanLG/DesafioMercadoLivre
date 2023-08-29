#language: pt

@tag
Funcionalidade: Validar o carrinho no mercado livre

  @tag1
  Cenario: Validar o carrinho
  
 Dado Que eu esteja no site "https://www.mercadolivre.com.br/"
 Quando eu pesquisar o produto desejado tablet Ipad
 E Clicar no produto desejado
 E Clicar no botão adicionar ao carrinho
 Então precisa ser direcionado para solicitação de login.

 