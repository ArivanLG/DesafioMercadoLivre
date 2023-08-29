package Elementos;

import org.openqa.selenium.By;

public class ElementosDeTela {
	
	
	private By preecherCampoDeTexto = By.id("cb1-edit");
	
	private By btnClicarLupa = By.xpath("/html/body/header/div/div[2]/form/button/div");
	
	private By btnAppleIpad = By.xpath("//*[@id=\":Rj8akpp:\"]/div[2]/div/div/div[1]/a/img");
	
	private By btnCarrinho = By.xpath("//*[@id=\":R1j9ahil7k:\"]/span");
	
	

	public By getPreecherCampoDeTexto() {
		return preecherCampoDeTexto;
	}

	public By getBtnClicarLupa() {
		return btnClicarLupa;
	}

	public By getBtnAppleIpad() {
		return btnAppleIpad;
	}

	public By getBtnCarrinho() {
		return btnCarrinho;
	}
	
	

}
