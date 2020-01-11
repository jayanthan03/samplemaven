package org.excel;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws Throwable {
File loc=new File("C:\\Users\\Jayanthan\\eclipse-workspace\\SampleMaven\\TestData\\excelwrite.xlsx");
Workbook w=new XSSFWorkbook();
Sheet s=w.createSheet("Greens");
Row r=s.createRow(5);
Cell c = r.createCell(2);
c.setCellValue("Jayanthan");
FileOutputStream o=new FileOutputStream(loc);
w.write(o);
System.out.println("Wrote Sucessfully");
	}

}
