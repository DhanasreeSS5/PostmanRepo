package demoProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Radiobutton extends Base {
	public void validateRadioButton()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radio=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		radio.click();
		WebElement button=driver.findElement(By.xpath("//button[@id='button-one']"));
		button.click();
		List<WebElement>radioButton=driver.findElements(By.xpath("//h4[text()='Pateints Gender']"));
		for(WebElement button1:radioButton)
		{
			if(button1.getAttribute("value").equals("female"))
			{
				button1.click();
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Radiobutton radiobutton=new Radiobutton();
		radiobutton.initializeBrowser();
		radiobutton.validateRadioButton();

	}

}
