package com.metlife.generics;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class FWUtils implements IAutoConstant {
	
	public static String getExcelData(String sheet,int row,int cell)
	{
		String data = null;
		try {
		
			Workbook wb = WorkbookFactory.create(new FileInputStream(pathExcel));
			data = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		}
		catch (Exception e) {
			e.printStackTrace(); 
		}
		return data;
		
	}
	
	public static String getExpectedData(String sheet,int row,int col) {
		String data=getExcelData(sheet,row,col);
		String eData[]=data.split("-");
		return eData[0];
	}
	
	public static void takess(WebDriver driver,String name) {
		try
		{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File desc = new File(pathPhoto+name+".png");
		FileUtils.copyFile(src,desc);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}

}
