package Topic3;

import java.io.File;  
import java.io.FileInputStream;  
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;  
import org.apache.poi.hssf.usermodel.HSSFWorkbook;  
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;  
import org.apache.poi.ss.usermodel.Row;  

public class stockePrices {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		 
		//Path of the excel file
		FileInputStream fs = new FileInputStream("D:\\StockFile.xls");
		//Creating a workbook
		HSSFWorkbook workbook = new HSSFWorkbook(fs);
		HSSFSheet sheet = workbook.getSheetAt(0);

		DataFormatter formatter = new DataFormatter();
	
		//Find number of rows in excel file

	  // int rowCount = sheet.getLastRowNum()- sheet.getFirstRowNum();
		//int rowCount = sheet.getLastRowNum();
	  // Row row = sheet.getRow(0);
		int firstRow = sheet.getFirstRowNum();
		System.out.print(firstRow);
       int coutn = sheet.getLastRowNum();
       System.out.print(coutn);
       int total = sheet.getLastRowNum()-sheet.getFirstRowNum();
       System.out.print(total);
	    //Create a loop over all the rows of excel file to read it

	   for (int i = 1; i <= coutn; i++) {
	   

	        Row row = sheet.getRow(i);
	        
	        //Create a loop to print cell values in a row

	        for (int j = 0; j < row.getLastCellNum(); j++) {
	        	Cell cell = row.getCell(j);

	            //Print Excel data in console

	            System.out.print((formatter.formatCellValue(sheet.getRow(i).getCell(j))) + "  ||  ");
	           
	        
	        }

	        System.out.println();
	    } 

	    }  

	
		  
	
}