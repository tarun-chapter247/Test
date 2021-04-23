package excel_data_fetch_update;

import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import utility.Constant; 

public class WriteExcelResult 
{ 
  static HSSFRow row; 
  static HSSFCell cell; 
 public static void setCellData(String Result, int RowNum, int ColNum) throws Exception 
 { 
   File file = new File(Constant.filePath); 
   FileInputStream fis = new FileInputStream(file); 
   HSSFWorkbook wb = new HSSFWorkbook(fis); 
   HSSFSheet sheet = wb.getSheet("Sheet1"); 
   
  int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
  System.out.println(rowCount);
  
  sheet.getRow(RowNum).createCell(ColNum).setCellValue(Result); 
 
  FileOutputStream fos = new FileOutputStream(Constant.filePath); 
   wb.write(fos); 
   fos.flush(); 
   fos.close(); 
  System.out.println("Result: Passed"); 
 } 
}