package Topic3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataUsingSele {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\61073018\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
			 
	   	String baseurl="https://money.rediff.com/losers/bse/daily/groupall";							 
	   	driver.get(baseurl);     
	   	
	    Map<String, List<WebElement>> elementMap = new HashMap<>();
	    
	    //Row 1	
	    List<WebElement> CName = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td[1]/a")); 	
        elementMap.put("Campany", CName);
        List<WebElement> Group0=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td[2]")); 
        elementMap.put("Group", Group0);
        List<WebElement> PrevClose0=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td[3]")); 
        elementMap.put("PrevClose", PrevClose0);
        List<WebElement> CurrentPrice0=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td[4]"));
        elementMap.put("CurrentPrice", CurrentPrice0);
        List<WebElement> Change0 =driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td[5]/font"));
        elementMap.put("Change", Change0);
        
        //Row 2	
        List<WebElement> CName1 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[2]/td[1]/a"));
        elementMap.put("Campany1", CName1);
        List<WebElement> Group1 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[2]/td[2]"));
        elementMap.put("Group11", Group1);
        List<WebElement> PrevClose1 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[2]/td[3]"));
        elementMap.put("PrevClose11", PrevClose1);
        List<WebElement> CurrentPrice1 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[2]/td[4]"));
        elementMap.put("CurrentPrice11", CurrentPrice1);
        List<WebElement> Change1 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[2]/td[5]/font"));
        elementMap.put("Change11", Change1);
	   	
	    //Row 3	
        List<WebElement> CName2 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[1]/a"));
        elementMap.put("Campany2", CName2);
        List<WebElement> Group2 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
        elementMap.put("Group12", Group2);
        List<WebElement> PrevClose2 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[3]"));
        elementMap.put("PrevClose12", PrevClose2);
        List<WebElement> CurrentPrice2 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[4]"));
        elementMap.put("CurrentPrice12", CurrentPrice2);
        List<WebElement> Change2 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[5]/font"));
        elementMap.put("Change12", Change2);
	   		
	    //Row 4
        List<WebElement> CName3 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[4]/td[1]/a"));
        elementMap.put("Campany3", CName3);
        List<WebElement> Group3 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[4]/td[2]"));
        elementMap.put("Group13", Group3);
        List<WebElement> PrevClose3 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[4]/td[3]"));
        elementMap.put("PrevClose13", PrevClose3);
        List<WebElement> CurrentPrice3 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[4]/td[4]"));
        elementMap.put("CurrentPrice13", CurrentPrice3);
        List<WebElement> Change3 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[4]/td[5]/font"));
        elementMap.put("Change13", Change3);
	   	
	    //Row 5	
        List<WebElement> CName4 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[5]/td[1]/a"));
        elementMap.put("Campany4", CName4);
        List<WebElement> Group4 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[5]/td[2]"));
        elementMap.put("Group14", Group4);
        List<WebElement> PrevClose4 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[5]/td[3]"));
        elementMap.put("PrevClose14", PrevClose4);
        List<WebElement> CurrentPrice4 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[5]/td[4]"));
        elementMap.put("CurrentPrice14", CurrentPrice4);
        List<WebElement> Change4 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[5]/td[5]/font"));
        elementMap.put("Change14", Change4);
	   		
	    //Row 6	
        List<WebElement> CName5 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[6]/td[1]/a"));
        elementMap.put("Campany5", CName5);
        List<WebElement> Group5 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[6]/td[2]"));
        elementMap.put("Group15", Group5);
        List<WebElement> PrevClose5 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[6]/td[3]"));
        elementMap.put("PrevClose15", PrevClose5);
        List<WebElement> CurrentPrice5 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[6]/td[4]"));
        elementMap.put("CurrentPrice15", CurrentPrice5);
        List<WebElement> Change5 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[6]/td[5]/font"));
        elementMap.put("Change15", Change5);
	   		
	    //Row 7	
        List<WebElement> CName6 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[7]/td[1]/a"));
        elementMap.put("Campany6", CName6);
        List<WebElement> Group6 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[7]/td[2]"));
        elementMap.put("Group16", Group6);
        List<WebElement> PrevClose6 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[7]/td[3]"));
        elementMap.put("PrevClose16", PrevClose6);
        List<WebElement> CurrentPrice6 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[7]/td[4]"));
        elementMap.put("CurrentPrice16", CurrentPrice6);
        List<WebElement> Change6 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[7]/td[5]/font"));
        elementMap.put("Change16", Change6);
	   	
	    //Row 8
        List<WebElement> CName7 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[8]/td[1]/a"));
        elementMap.put("Campany7", CName7);
        List<WebElement> Group7 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[8]/td[2]"));
        elementMap.put("Group17", Group7);
        List<WebElement> PrevClose7 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[8]/td[3]"));
        elementMap.put("PrevClose17", PrevClose7);
        List<WebElement> CurrentPrice7 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[8]/td[4]"));
        elementMap.put("CurrentPrice17", CurrentPrice7);
        List<WebElement> Change7 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[8]/td[5]/font"));
        elementMap.put("Change17", Change7);
	   	
	    //Row 9	
        List<WebElement> CName8 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[9]/td[1]/a"));
        elementMap.put("Campany8", CName8);
        List<WebElement> Group8 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[9]/td[2]"));
        elementMap.put("Group18", Group8);
        List<WebElement> PrevClose8 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[9]/td[3]"));
        elementMap.put("PrevClose18", PrevClose8);
        List<WebElement> CurrentPrice8 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[9]/td[4]"));
        elementMap.put("CurrentPrice18", CurrentPrice8);
        List<WebElement> Change8 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[9]/td[5]/font"));
        elementMap.put("Change18", Change8);
	   		
	   	
	    //Row 10
        List<WebElement> CName9 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[10]/td[1]/a"));
        elementMap.put("Campany9", CName9);
        List<WebElement> Group9 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[10]/td[2]"));
        elementMap.put("Group19", Group9);
        List<WebElement> PrevClose9= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[10]/td[3]"));
        elementMap.put("PrevClose19", PrevClose9);
        List<WebElement> CurrentPrice9 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[10]/td[4]"));
        elementMap.put("CurrentPrice19", CurrentPrice9);
        List<WebElement> Change9 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[10]/td[5]/font"));
        elementMap.put("Change19", Change9);
	   	
        // Retrieve and use data from the HashMap
        List<WebElement> Campany = elementMap.get("Campany");
        List<WebElement> Group = elementMap.get("Group");
        List<WebElement> PrevClose = elementMap.get("PrevClose");
        List<WebElement> CurrentPrice = elementMap.get("CurrentPrice");
        List<WebElement> Change = elementMap.get("Change");
        
        List<WebElement> Campany1 = elementMap.get("Campany1");
        List<WebElement> Group11 = elementMap.get("Group11");
        List<WebElement> PrevClose11 = elementMap.get("PrevClose11");
        List<WebElement> CurrentPrice11 = elementMap.get("CurrentPrice11");
        List<WebElement> Change11 = elementMap.get("Change11");
        
        List<WebElement> Campany2 = elementMap.get("Campany2");
        List<WebElement> Group12 = elementMap.get("Group12");
        List<WebElement> PrevClose12 = elementMap.get("PrevClose12");
        List<WebElement> CurrentPrice12 = elementMap.get("CurrentPrice12");
        List<WebElement> Change12 = elementMap.get("Change12");
        
        List<WebElement> Campany3 = elementMap.get("Campany3");
        List<WebElement> Group13 = elementMap.get("Group13");
        List<WebElement> PrevClose13 = elementMap.get("PrevClose13");
        List<WebElement> CurrentPrice13 = elementMap.get("CurrentPrice13");
        List<WebElement> Change13 = elementMap.get("Change13");
        
        List<WebElement> Campany4 = elementMap.get("Campany4");
        List<WebElement> Group14 = elementMap.get("Group14");
        List<WebElement> PrevClose14 = elementMap.get("PrevClose14");
        List<WebElement> CurrentPrice14 = elementMap.get("CurrentPrice14");
        List<WebElement> Change14 = elementMap.get("Change14");
        
        List<WebElement> Campany5 = elementMap.get("Campany5");
        List<WebElement> Group15 = elementMap.get("Group15");
        List<WebElement> PrevClose15 = elementMap.get("PrevClose15");
        List<WebElement> CurrentPrice15 = elementMap.get("CurrentPrice15");
        List<WebElement> Change15 = elementMap.get("Change15");
        
        List<WebElement> Campany6 = elementMap.get("Campany6");
        List<WebElement> Group16 = elementMap.get("Group16");
        List<WebElement> PrevClose16 = elementMap.get("PrevClose16");
        List<WebElement> CurrentPrice16 = elementMap.get("CurrentPrice16");
        List<WebElement> Change16 = elementMap.get("Change16");
        
        List<WebElement> Campany7 = elementMap.get("Campany7");
        List<WebElement> Group17 = elementMap.get("Group17");
        List<WebElement> PrevClose17 = elementMap.get("PrevClose17");
        List<WebElement> CurrentPrice17 = elementMap.get("CurrentPrice17");
        List<WebElement> Change17 = elementMap.get("Change17");
        
        List<WebElement> Campany8 = elementMap.get("Campany8");
        List<WebElement> Group18 = elementMap.get("Group18");
        List<WebElement> PrevClose18 = elementMap.get("PrevClose18");
        List<WebElement> CurrentPrice18 = elementMap.get("CurrentPrice18");
        List<WebElement> Change18 = elementMap.get("Change18");
        
        List<WebElement> Campany9 = elementMap.get("Campany9");
        List<WebElement> Group19 = elementMap.get("Group19");
        List<WebElement> PrevClose19 = elementMap.get("PrevClose19");
        List<WebElement> CurrentPrice19 = elementMap.get("CurrentPrice19");
        List<WebElement> Change19 = elementMap.get("Change19");
        
        for (WebElement CampanyN : Campany) {
            System.out.println("Company: " + CampanyN.getText());
        }
 
        for (WebElement Cgroup : Group) {
            System.out.println("Group: " + Cgroup.getText());
        }
 
        for (WebElement CPrevClose : PrevClose) {
            System.out.println("PrevClose: " + CPrevClose.getText());
        }
 
        for (WebElement CCurrentPrice : CurrentPrice) {
            System.out.println("CurrentPrice: " + CCurrentPrice.getText());
        }
 
        for (WebElement CChange : Change) {
            System.out.println("Change: " + CChange.getText());
        }
        
             
        for (WebElement CampanyN : Campany1) {
            System.out.println("Company: " + CampanyN.getText());
        }
 
        for (WebElement Cgroup : Group11) {
            System.out.println("Group: " + Cgroup.getText());
        }
 
        for (WebElement CPrevClose : PrevClose11) {
            System.out.println("PrevClose: " + CPrevClose.getText());
        }
 
        for (WebElement CCurrentPrice : CurrentPrice11) {
            System.out.println("CurrentPrice: " + CCurrentPrice.getText());
        }
 
        for (WebElement CChange : Change11) {
            System.out.println("Change: " + CChange.getText());
        }
        
        for (WebElement CampanyN : Campany2) {
            System.out.println("Company: " + CampanyN.getText());
        }
 
        for (WebElement Cgroup : Group12) {
            System.out.println("Group: " + Cgroup.getText());
        }
 
        for (WebElement CPrevClose : PrevClose12) {
            System.out.println("PrevClose: " + CPrevClose.getText());
        }
 
        for (WebElement CCurrentPrice : CurrentPrice12) {
            System.out.println("CurrentPrice: " + CCurrentPrice.getText());
        }
 
        for (WebElement CChange : Change12) {
            System.out.println("Change: " + CChange.getText());
        }
        
        for (WebElement CampanyN : Campany3) {
            System.out.println("Company: " + CampanyN.getText());
        }
 
        for (WebElement Cgroup : Group13) {
            System.out.println("Group: " + Cgroup.getText());
        }
 
        for (WebElement CPrevClose : PrevClose13) {
            System.out.println("PrevClose: " + CPrevClose.getText());
        }
 
        for (WebElement CCurrentPrice : CurrentPrice13) {
            System.out.println("CurrentPrice: " + CCurrentPrice.getText());
        }
 
        for (WebElement CChange : Change13) {
            System.out.println("Change: " + CChange.getText());
        }
        
        for (WebElement CampanyN : Campany4) {
            System.out.println("Company: " + CampanyN.getText());
        }
 
        for (WebElement Cgroup : Group14) {
            System.out.println("Group: " + Cgroup.getText());
        }
 
        for (WebElement CPrevClose : PrevClose14) {
            System.out.println("PrevClose: " + CPrevClose.getText());
        }
 
        for (WebElement CCurrentPrice : CurrentPrice14) {
            System.out.println("CurrentPrice: " + CCurrentPrice.getText());
        }
 
        for (WebElement CChange : Change14) {
            System.out.println("Change: " + CChange.getText());
        }
        
        for (WebElement CampanyN : Campany5) {
            System.out.println("Company: " + CampanyN.getText());
        }
 
        for (WebElement Cgroup : Group15) {
            System.out.println("Group: " + Cgroup.getText());
        }
 
        for (WebElement CPrevClose : PrevClose15) {
            System.out.println("PrevClose: " + CPrevClose.getText());
        }
 
        for (WebElement CCurrentPrice : CurrentPrice15) {
            System.out.println("CurrentPrice: " + CCurrentPrice.getText());
        }
 
        for (WebElement CChange : Change15) {
            System.out.println("Change: " + CChange.getText());
        }
        
        
        for (WebElement CampanyN : Campany5) {
            System.out.println("Company: " + CampanyN.getText());
        }
 
        for (WebElement Cgroup : Group15) {
            System.out.println("Group: " + Cgroup.getText());
        }
 
        for (WebElement CPrevClose : PrevClose15) {
            System.out.println("PrevClose: " + CPrevClose.getText());
        }
 
        for (WebElement CCurrentPrice : CurrentPrice15) {
            System.out.println("CurrentPrice: " + CCurrentPrice.getText());
        }
 
        for (WebElement CChange : Change15) {
            System.out.println("Change: " + CChange.getText());
        }
        
        
        for (WebElement CampanyN : Campany6) {
            System.out.println("Company: " + CampanyN.getText());
        }
 
        for (WebElement Cgroup : Group16) {
            System.out.println("Group: " + Cgroup.getText());
        }
 
        for (WebElement CPrevClose : PrevClose16) {
            System.out.println("PrevClose: " + CPrevClose.getText());
        }
 
        for (WebElement CCurrentPrice : CurrentPrice16) {
            System.out.println("CurrentPrice: " + CCurrentPrice.getText());
        }
 
        for (WebElement CChange : Change16) {
            System.out.println("Change: " + CChange.getText());
        }
        
        
        for (WebElement CampanyN : Campany7) {
            System.out.println("Company: " + CampanyN.getText());
        }
 
        for (WebElement Cgroup : Group17) {
            System.out.println("Group: " + Cgroup.getText());
        }
 
        for (WebElement CPrevClose : PrevClose17) {
            System.out.println("PrevClose: " + CPrevClose.getText());
        }
 
        for (WebElement CCurrentPrice : CurrentPrice17) {
            System.out.println("CurrentPrice: " + CCurrentPrice.getText());
        }
 
        for (WebElement CChange : Change17) {
            System.out.println("Change: " + CChange.getText());
        }
        
        
        for (WebElement CampanyN : Campany8) {
            System.out.println("Company: " + CampanyN.getText());
        }
 
        for (WebElement Cgroup : Group18) {
            System.out.println("Group: " + Cgroup.getText());
        }
 
        for (WebElement CPrevClose : PrevClose18) {
            System.out.println("PrevClose: " + CPrevClose.getText());
        }
 
        for (WebElement CCurrentPrice : CurrentPrice18) {
            System.out.println("CurrentPrice: " + CCurrentPrice.getText());
        }
 
        for (WebElement CChange : Change18) {
            System.out.println("Change: " + CChange.getText());
        }
        
        
        for (WebElement CampanyN : Campany9) {
            System.out.println("Company: " + CampanyN.getText());
        }
 
        for (WebElement Cgroup : Group19) {
            System.out.println("Group: " + Cgroup.getText());
        }
 
        for (WebElement CPrevClose : PrevClose19) {
            System.out.println("PrevClose: " + CPrevClose.getText());
        }
 
        for (WebElement CCurrentPrice : CurrentPrice19) {
            System.out.println("CurrentPrice: " + CCurrentPrice.getText());
        }
 
        for (WebElement CChange : Change19) {
            System.out.println("Change: " + CChange.getText());
        }
        
        
         
    // Close the WebDriver
        driver.quit();
	}

}
