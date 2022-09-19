package metodos;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import drivers.Drivers;

public class Metodos extends Drivers {

	public static void abrirNavegador() {
		String navegador = "Chrome";
		if (navegador.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (navegador.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("https://buger-eats.vercel.app/");
		driver.manage().window().maximize();
	}

	public static void FecharNavegador() {
		driver.quit();
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void clicarTexto(String texto) {

		driver.findElement(By.xpath("//*[text()='" + texto + "']")).click();
	}

	public void escrever(String texto, By elemento) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void foto(By elemento) {

		File file = new File("./Cnh/CNH.jpg");
		driver.findElement(elemento).sendKeys(file.getAbsolutePath());
	}

	public void scrShot(String evidencia, String falhaNoPasso) {
		try {
			TakesScreenshot scrShot = (TakesScreenshot) driver;
			File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./evidencias/" + evidencia + ".png");
			FileUtils.copyFile(scrFile, destFile);

		} catch (Exception e) {
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
		System.out.println("***erro no step "+ falhaNoPasso +"***");
		}
		
		
	}

	public void validatext(By elemento, String resultEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertTrue(textoCapturado.contains(resultEsperado));
	}
}
