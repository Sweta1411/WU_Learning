package Topic3;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class StockValidation {
    private String filePath;
    private int sheetIndex;
    StockValidation(String filePath, int sheetIndex) {
        this.filePath = filePath;
        this.sheetIndex = sheetIndex;
    }
    private HSSFSheet getSheet() throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        HSSFWorkbook workbook = new HSSFWorkbook(fis);
        HSSFSheet sheet = workbook.getSheetAt(sheetIndex);
        return sheet;
    }
    public Map<String, Map<String, String>> getExcelAsMap() throws IOException {
        HSSFSheet sheet = getSheet();
     
      //  Map<String, Map<String, String>> completeSheetData = new HashMap<String, Map<String, String>>();
        Map<String, Map<String, String>> completeSheetData = new LinkedHashMap<String, Map<String, String>>();
        List<String> columnHeader = new ArrayList<String>();
        Row row = sheet.getRow(0);
        int coutn = sheet.getLastRowNum();
        System.out.println("row coutn: "+coutn);
        Iterator<Cell> cellIterator = row.cellIterator();
        while (cellIterator.hasNext()) {
            columnHeader.add(cellIterator.next().getStringCellValue());
        }
        
        int columnCount = row.getLastCellNum();
        //for (int i = 1; i <= rowCount; i++) {
        for (int i = 1; i <= coutn; i++) {
        	
           // Map<String, String> singleRowData = new HashMap<String, String>();
        	Map<String, String> singleRowData = new LinkedHashMap<String, String>();
            Row row1 = sheet.getRow(i);
            for (int j = 0; j < columnCount; j++) {
                Cell cell = row1.getCell(j);
                singleRowData.put(columnHeader.get(j), getCellValueAsString(cell));
            }
            completeSheetData.put(String.valueOf(i), singleRowData);
        }
        return completeSheetData;
    }
    public String getCellValueAsString(Cell cell) {
        String cellValue = null;
        switch (cell.getCellType()) {
            case NUMERIC:
                cellValue = String.valueOf(cell.getNumericCellValue());
                break;
            case STRING:
                cellValue = cell.getStringCellValue();
                break;
            case BOOLEAN:
                cellValue = String.valueOf(cell.getBooleanCellValue());
                break;
            case FORMULA:
                cellValue= cell.getCellFormula();
            case BLANK:
                cellValue="BLANK";
            default:
                cellValue ="DEFAULT";
        }
        return cellValue;
    }
	
	  public static void main(String[] args) throws IOException {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\61073018\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  StockValidation ex = new StockValidation("D:\\StockSheet.xls", 0);
		  Map<String, Map<String, String>> excelData =ex.getExcelAsMap();
		  
		  //Read the data using Selenium Webdriver 
		  String baseurl="https://money.rediff.com/losers/bse/daily/groupall";							 
	  	   	driver.get(baseurl); 
	  	    Map<String,Map<String,String>> elementMap = new LinkedHashMap<>();
	  	    for(int i =1; i<=10;i++)
	  	    {
	  	    	Map<String,String> elementRowMap = new LinkedHashMap<>();
	  		  	   
	  		  	      WebElement CName = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[1]/a")); 	
	  		          elementRowMap.put("Company", CName.getText());
	  		          WebElement Group0=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[2]")); 
	  		          elementRowMap.put("Group", Group0.getText());
	  		          WebElement PrevClose0=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[3]")); 
	  		          elementRowMap.put("Prev Close (Rs)", String.valueOf(Double.valueOf(PrevClose0.getText().replace(",", ""))));
	  		          WebElement CurrentPrice0=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[4]"));
	  		          elementRowMap.put("Current Price (Rs)", String.valueOf(Double.valueOf(CurrentPrice0.getText().replace(",", ""))));
	  		          WebElement Change0 =driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[5]/font"));
	  		        // elementRowMap.put("% Change", String.valueOf(Double.valueOf(Change0.getText().replace(",", ""))));
	  		          elementRowMap.put("% Change", String.valueOf(Double.valueOf(Change0.getText())));
	  		          elementMap.put(String.valueOf(i),elementRowMap);
	  	    } 
	          //  Data of the XLS file.
	          System.out.println("excelData  : "+excelData);
	          // data using Selenium Webdriver.
	          System.out.println("elementMap : "+elementMap);
	          
	          //Compare the values stored in the two HashMaps
	          System.out.println("map1 == map2: " + excelData.equals(elementMap)); 
	          
	          
	          //Store the data in the XLS in rows and columns 
	          HSSFWorkbook workbook1 = new HSSFWorkbook();
	          HSSFSheet sheet1 = workbook1.createSheet("Sheet1");
	          String[] header = {"Company","Group","Prev Close(Rs)","Current price(Rs)" , "% Changes"};
	          
	          Row headerRow = sheet1.createRow(0);
	          for(int i=0; i<header.length; i++) {
	        	  Cell cell =headerRow.createCell(i);
	        	  cell.setCellValue(header[i]);
	          }
	          
	          int rowno=1; 
              
	            for(HashMap.Entry entry:elementMap.entrySet()) {
	                HSSFRow row=sheet1.createRow(rowno++); 
	                int cellCount = 0;
	                	 for(HashMap.Entry entry1:(( Map<String, String>) entry.getValue()).entrySet()) {
	                			 row.createCell(cellCount++).setCellValue((String)entry1.getValue()); 
	                	 }
	            }
	          
	       // Write the data back in the Excel file
	            FileOutputStream outputStream = new FileOutputStream("D:\\WriteintoExcel.xls");
	            workbook1.write(outputStream);
	            
	            
	           System.out.println("Data entered");

	       // Close the WebDriver
	          driver.quit(); 

	      }
}
