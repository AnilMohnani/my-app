package com.mycompany.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDrivenTesting {

	

	public ArrayList<String> excelData(String testcasename) throws Exception {
	FileInputStream fis=new FileInputStream("C:\\Users\\AnilY\\my-app\\DataSheet\\Book1.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	ArrayList<String> al =new ArrayList<String>();

	int noOfSheets=workbook.getNumberOfSheets();
	//System.out.println(noOfSheets);
	for(int i=0;i<noOfSheets;i++)
	{
		if(workbook.getSheetName(i).contains("Demo1"))
		{
			XSSFSheet sheet=workbook.getSheetAt(i);
			Iterator<Row> irow=sheet.iterator();
			Row firstRow=irow.next();
			Iterator<Cell> icell=firstRow.cellIterator();
			int k=0;
			int col=0;
			while(icell.hasNext())
			{
				Cell value=icell.next();
				if(value.getStringCellValue().equalsIgnoreCase("testcase"));
				{
					col=k;
				}
				k++;
			}	System.out.println(col);
			
			while(irow.hasNext())
			{
				Row r=irow.next();
				if(r.getCell(col).getStringCellValue().equalsIgnoreCase(testcasename));
				{
					Iterator<Cell> c=r.cellIterator();
					while(c.hasNext())
					{
						Cell cv=c.next();
						if(cv.getCellType()==CellType.STRING)
						{
							al.add(cv.getStringCellValue());
						
					}
						else
						{
							al.add(NumberToTextConverter.toText(cv.getNumericCellValue()));
						}
						}
					
					
				}
			}

		}
		

	}
	return al;
}
}