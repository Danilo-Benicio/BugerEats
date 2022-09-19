package elementosweb;

import org.openqa.selenium.By;

public class Elementos {
	
	// **Dados de contato**
	public By name = By.xpath("//input[@name='name']");
	public By cpf = By.xpath("//input[@name='cpf']");
	public By email = By.xpath("//input[@name='email']");
	public By whatsapp = By.xpath("//input[@name='whatsapp']");
	
	
	// **Dados de endereço**
	public By cep = By.xpath("//input[@name='postalcode']");
	public By buscacep = By.xpath("//input[@value='Buscar CEP']");
	public By numero = By.xpath("//input[@name='address-number']");
	public By complemento = By.xpath("//input[@name='address-details']");
	
	
	// **Metodos de entrega e CNH]**
	public By metodoEntrega = By.xpath("//*[text()='Moto']");
	public By cnh = By.xpath("//input[@type='file']");
	
	
	//** Botão enviar e Elemento de validação**
	public By btnEnviar = By.xpath("//*[text()='Cadastre-se para fazer entregas']");
	public By aiSim = By.xpath("//h2[text()='Aí Sim...']");
	public By dadosBranco = By.xpath("//*[text()='É necessário informar o nome']");
}
