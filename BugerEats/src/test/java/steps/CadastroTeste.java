package steps;

import java.io.IOException;

import Pages.CadastroPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.Metodos;

public class CadastroTeste {
	CadastroPage cadpage = new CadastroPage();
	@Before
	public void iniciarTeste() {
		Metodos.abrirNavegador();	
	}
	
	
	@After
	public void finalizarTeste() {
		Metodos.FecharNavegador();

	}

	
	@Dado("que eu esteja na tela de cadastro")
	public void queEuEstejaNaTelaDeCadastro() {
		
		cadpage.btnCadastro();
	}

	@Dado("preencha dados pessoais validos")
	public void preenchaDadosPessoaisValidos() {
		cadpage.dadosPessoais();
	}

	@Dado("preencha endereco valido")
	public void preenchaEnderecoValido() {
		cadpage.dadosEndereco();
	}

	@Dado("selecione tipo de veiculo")
	public void selecioneTipoDeVeiculo() {
		cadpage.metodoEntrega();
	}

	@Quando("envie a foto da cnh valida")
	public void envieAFotoDaCnhValida() {
		cadpage.imgcnh();
	}

	@Entao("clicar em cadastre-se para fazer entregas")
	public void clicarEmCadastreSeParaFazerEntregas() {
		cadpage.btnCadastro();
	}

	@Entao("valido as informacoes")
	public void validoAsInformacoes() throws IOException {
		cadpage.validacao();
	}

	@Dado("Nao preencha os dados pessoais")
	public void naoPreenchaOsDadosPessoais() {
		cadpage.dadosPessoaisEmBranco();
	}

	@Entao("valido a falha no envio de informacoes")
	public void validoAFalhaNoEnvioDeInformacoes() throws IOException {
		cadpage.validacaoNegativa();
	}

}
