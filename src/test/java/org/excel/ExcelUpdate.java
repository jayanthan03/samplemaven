package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdate {

	public static void main(String[] args) throws Throwable {
File loc=new File("C:\\Users\\Jayanthan\\eclipse-workspace\\SampleMaven\\TestData\\excelwrite.xlsx");
FileInputStream stream=new FileInputStream(loc);
Workbook w=new XSSFWorkbook(stream);
Sheet s = w.getSheet("Greens");
Row r = s.getRow(5);
Cell c = r.getCell(2);
String s1 = c.getStringCellValue();
if(s1.equals("Jayanthan")) {
	c.setCellValue("Jayanth");

}
FileOutputStream o=new FileOutputStream(loc);
w.write(o);
System.out.println("Excel updated Successfully");
	}

}
