package topic1;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingParallerStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\61073018\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
		
			driver.get("https://www.flipkart.com");
			System.out.println("Link opened");
			
			//Get list of web-elements with tagName  - a
			List<WebElement> allLinks = driver.findElements(By.tagName("a"));
					 	 
			 //Parallel Stream
			 System.out.println("-----Parallel Stream------");
			 allLinks.parallelStream()
			 .map(link -> link.getText()+ " - " + link.getAttribute("href"))
			 .collect(Collectors.toList()).forEach(System.out::println);
			 	
			 driver.quit();
	}

}
