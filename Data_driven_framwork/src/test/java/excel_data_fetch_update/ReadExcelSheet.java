package excel_data_fetch_update;

import java.io.File; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.util.ArrayList; 
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell; 
import org.apache.poi.ss.usermodel.Row; 
import utility.Constant;

public class ReadExcelSheet<XSSFWorkbook, XSSFSheet> {
	
	public ArrayList readExcelData(int colNo) throws IOException,NullPointerException
	{ 
	
	   String filePath = Constant.filePath; 
	   File file = new File(filePath); 
	   FileInputStream fis = new FileInputStream(file); 
	   
	   HSSFWorkbook wb=new HSSFWorkbook(fis);   
	   HSSFSheet sheet=wb.getSheetAt(0);
	 
	  Iterator<Row> row = sheet.rowIterator(); 
	   row.next(); 
	
	   ArrayList<String> ar = new ArrayList<String>(); 
	
	   while(row.hasNext()) 
	   { 
	    Row r = row.next(); 

	    Cell c = r.getCell(colNo); 
	    String data = c.getStringCellValue(); 
	
	     ar.add(data); 
	     ar.add(row.next().getCell(colNo).getStringCellValue()); 
	   } 
	   System.out.println("List: " +ar); 
	    return ar; 
	  }

}
