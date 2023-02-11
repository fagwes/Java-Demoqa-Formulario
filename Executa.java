package runner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import drivers.DriversFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Executa extends DriversFactory {

	public static void iniciarBrowser() {

		String Navegador = "Chrome";
		String Ambiente = "https://demoqa.com/automation-practice-form";

		if (Navegador.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			// chromeOptions.addArguments("--headless");
			driver = new ChromeDriver(chromeOptions);

		} else if (Navegador.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			// firefoxOptions.addArguments("--headless");
			driver = new FirefoxDriver(firefoxOptions);

		} else if (Navegador.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			EdgeOptions edgeOptions = new EdgeOptions();
			// edgeOptions.addArguments("--headless");
			driver = new EdgeDriver(edgeOptions);

		} else {
			System.err.print("Opção inválida digite chrome|firefox|edge");

		}
		driver.get(Ambiente);
		driver.manage().window().maximize();
	}
}
