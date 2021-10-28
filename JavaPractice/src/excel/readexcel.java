package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class readexcel {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		
		//open the excel file
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/book1.xlsx"));
       
	//reasd the data	
		//Sheet s = wb.getSheet("Sheet1");
       //Row r = s.getRow(0);
       //Cell c = r.getCell(0);
		//System.out.println(c);
       
     String s=  wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
              
       System.out.println(s);
       //Write the data to excel
       wb.getSheet("Sheet1").getRow(0).getCell(0).setCellValue("Laxmi1");
       // wb.write(new FileOutputStream("./data/book1.xlsx")); // Overrides the value in the same excel
       
       wb.write(new FileOutputStream("./data/book2.xlsx")); //Save as new value in new excel value
       
       Workbook wb = WorkbookFactory.create(new FileInputStream("./data/book1.xlsx"));
       
   	//reads the data	
   		          
        String str=  wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
                 
          System.out.println(str);
       wb.close();
	}

}
