package com.qa.PracticeSession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MaddoTest {
	static WebDriver driver;

	static void dynamicTable()

	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahz\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/index.html");
		WebElement table = driver.findElement(By.xpath("//div[@class='hmmtctable']"));
		if (table.isDisplayed()) {
			System.out.println("table is ready");
		}
		// List<WebElement> list =
		// driver.findElements(By.xpath(("//div[@class='hmmtctable']//ul[position()>1]")));
		// System.out.println("Number of rows ===> " +list.size());
		// for(WebElement rowName: list)
		// {
		// System.out.println(rowName.getText());
		// }
		// WebElement row3=
		// driver.findElement(By.xpath("//div[@class='hmmtctable']//ul[3]"));
		// List<WebElement> colList=row3.findElements(By.xpath(".//li"));
		// System.out.println("Number of Columns ===>"+colList.size());
		// for(WebElement colName: colList)
		// {
		// System.out.println(colName.getText());
		// }

		List<WebElement> list = driver.findElements(By.xpath(("//div[@class='hmmtctable']//ul")));
		for (WebElement colname : list) {
			System.out.println(colname.getText());
		}
System.out.println("****************************");
		// WebElement specrow =
		// driver.findElement(By.xpath(("//div[@class='hmmtctable']//ul[5]")));
		// List<WebElement> colName = specrow.findElements(By.xpath(".//li"));
		// System.out.println(colName.size());

		// WebElement value =
		// specrow.findElement(By.xpath(("//div[@class='hmmtctable']//ul[5]//li[2]")));
		// System.out.println(value.getText());

		List<WebElement> listLessThanSix = driver
				.findElements(By.xpath("//div[@class='hmmtctable']//ul[position()<6]"));

		for (WebElement list2 : listLessThanSix) {
			System.out.println(list2.getText());
		}
//	System.out.println(list2.findElement(By.xpath(".//li[3]")).getText());
//}
//	}*/
	}

	static void tearDown() {
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {

		dynamicTable();

	}

}
