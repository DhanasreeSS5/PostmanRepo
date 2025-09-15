package demoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Table extends Base {
	public void verifyElementsinTable()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	//WebElement firstrow=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
	//System.out.println(firstrow.getText());
	WebElement secondsection=driver.findElement(By.xpath("//a[@data-dt-idx='2']"));
	WebElement contents=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr"));
	System.out.println(contents.getText());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table table=new Table();
		table.initializeBrowser();
		table.verifyElementsinTable();

	}

}
