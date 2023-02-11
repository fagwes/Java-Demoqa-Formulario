package metodos;

import org.openqa.selenium.By;

import drivers.DriversFactory;

public class Metodos extends DriversFactory {
	
	public void clicar(By elemento) {
		  driver.findElement(elemento).click();
		 }
		 public void clicarPorTexto(String atributo, String texto) {
		  driver.findElement(By.xpath("//"+atributo+"[text()='"+texto+"']")).click();
		 }
		 public void dataNascimento(String ano, String mes, String dia) throws InterruptedException {
		  By calendario = By.id("dateOfBirthInput");
		  By anoElemento = By.xpath("//*[@class='react-datepicker__year-select']");
		  Thread.sleep(2000);
		  clicar(calendario); 
		  clicar(anoElemento); 
		  clicarPorTexto("option", ano);
		 }


}
