package excel;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;



	public class ReadExcelEx {

		public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
			
			//open the excel file
			Workbook wb = WorkbookFactory.create(new FileInputStream("./data/book1.xlsx"));
	       Sheet s = wb.getSheet("Sheet1");
	       Row r = s.getRow(0);
	       Cell c = r.getCell(0);
	       
	       
	       System.out.println(c);
	       wb.close();
		}

	}



