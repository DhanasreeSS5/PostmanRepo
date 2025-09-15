package demoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Inputform extends Base{
	public void verifytheuserisabletoentervaluesinTextField()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement entermessage=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		entermessage.sendKeys("Hello");
		WebElement submit=driver.findElement(By.xpath("//button[@id='button-one']"));
		submit.click();
		WebElement entervalueA=driver.findElement(By.xpath("//input[@id='value-a']"));
		entervalueA.sendKeys("5");
		WebElement entervalueB=driver.findElement(By.xpath("//input[@id='value-b']"));
		entervalueB.sendKeys("10");
		WebElement gettotal=driver.findElement(By.xpath("//button[@id='button-two']"));
		gettotal.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inputform inputform=new Inputform();
		inputform.initializeBrowser();
		inputform.verifytheuserisabletoentervaluesinTextField();

	}

}
