package Steps;

import Elementos.ElementosDeTela;
import Metodos.MetodosDeTela;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;

public class Teste {

	MetodosDeTela m = new MetodosDeTela();
	ElementosDeTela e = new ElementosDeTela();

	@Dado("Que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String url) {
		m.abrirNavegador(url);

	}

	@Quando("eu pesquisar o produto desejado tablet Ipad")
	public void eu_pesquisar_o_produto_desejado_tablet_ipad() throws InterruptedException {
		
		m.pausar(2000);
		m.preencherTexto(e.getPreecherCampoDeTexto(), "Ipad");
		m.pausar(2000);
		m.clicar(e.getBtnClicarLupa());

	}

	@Quando("Clicar no produto desejado")
	public void clicar_no_produto_desejado() {
		
		m.clicar(e.getBtnAppleIpad());
		

	}

	@Quando("Clicar no botão adicionar ao carrinho")
	public void clicar_no_botão_adicionar_ao_carrinho() {
        m.scrool();
		m.clicar(e.getBtnCarrinho());

	}

	@Então("precisa ser direcionado para solicitação de login.")
	public void precisa_ser_direcionado_para_solicitação_de_login() {
		
	m.fecharNavegador();

	}

}
