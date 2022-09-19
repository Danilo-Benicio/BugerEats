package Pages;

import elementosweb.Elementos;
import metodos.Metodos;

public class CadastroPage {
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	public void btnCadastro() {
		metodos.clicar(el.btnEnviar);
	}

	public void dadosPessoais() {
		metodos.escrever("jose", el.name);
		metodos.escrever("12345678912", el.cpf);
		metodos.escrever("jose@test.com", el.email);
		metodos.escrever("11912345678", el.whatsapp);

	}
	public void dadosPessoaisEmBranco() {
		metodos.escrever("", el.name);
		metodos.escrever("", el.cpf);
		metodos.escrever("", el.email);
		metodos.escrever("11912345678", el.whatsapp);

	}

	public void dadosEndereco() {
		metodos.escrever("06515010", el.cep);
		metodos.clicar(el.buscacep);
		metodos.escrever("12", el.numero);
		metodos.escrever("A", el.complemento);

	}
	public void metodoEntrega() {
		metodos.clicarTexto("Moto");
	}
	public void imgcnh() {
		metodos.foto(el.cnh);
	}
public void validacao()  {
	metodos.scrShot("Solicitação cadastro enviado", "foto do cenario positivo");
	metodos.validatext(el.aiSim, "Aí Sim...");
}
public void validacaoNegativa()  {
	metodos.scrShot("Dados em branco", "foto do cenario negativo");
	metodos.validatext(el.dadosBranco, "É necessário informar o nome");
}
}
