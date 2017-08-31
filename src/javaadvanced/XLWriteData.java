package javaadvanced;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLWriteData {	
public static void main(String[] args) throws IOException {
 XSSFWorkbook workbook = new XSSFWorkbook(); 
 XSSFSheet spreadsheet = workbook.createSheet("cell types");
 XSSFRow row = spreadsheet.createRow((short) 2);
 row.createCell(0).setCellValue("Type of Cell");
 row.createCell(1).setCellValue("cell value");
 row = spreadsheet.createRow((short) 3);
 row.createCell(0).setCellValue("set cell type BLANK");
 row.createCell(1);
 row = spreadsheet.createRow((short) 4);
 row.createCell(0).setCellValue("set cell type BOOLEAN");
 row.createCell(1).setCellValue(true);
 row = spreadsheet.createRow((short) 5);
 row.createCell(0).setCellValue("set cell type ERROR");
 row.createCell(1).setCellValue(XSSFCell.CELL_TYPE_ERROR );
 row = spreadsheet.createRow((short) 6);
 row.createCell(0).setCellValue("set cell type date");
 row.createCell(1).setCellValue(new Date());   
	      
 FileOutputStream out = new FileOutputStream(
 new File("C:\\Users\\chaitanya\\Desktop\\writedata.xlsx"));
 workbook.write(out);
 out.close();
 System.out.println("writedata.xlsx written successfully");
	}
}

