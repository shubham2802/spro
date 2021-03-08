package com.dps.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils {


public static FileInputStream fi;
public static FileOutputStream fo;
public static XSSFWorkbook wb;
public static XSSFSheet ws;
public static XSSFRow row;
public static XSSFCell cell;


public static int getrow(String xlfile,String xlsheet) throws IOException {

	fi=new FileInputStream(xlfile);
	wb=new XSSFWorkbook(fi);
	ws=wb.getSheet(xlsheet);
	int getrow=ws.getLastRowNum();
	wb.close();
	fi.close();
	return getrow;

}

public static int getcell(String xlfile,String xlsheet,int rownum) throws IOException {
	
	fi=new FileInputStream(xlfile);
	wb=new XSSFWorkbook(fi);
	ws=wb.getSheet(xlsheet);
	row=ws.getRow(rownum);
	int getcell=row.getLastCellNum();
	wb.close();
	fi.close();
	return getcell;

	}


public static String getcelldata(String xlfile,String xlsheet,int rownum,int colnum) throws IOException {


	fi=new FileInputStream(xlfile);
	wb=new XSSFWorkbook(fi);
	ws=wb.getSheet(xlsheet);
	row=ws.getRow(rownum);
	cell=row.getCell(colnum);
	String data;
	try {
	      DataFormatter formatter=new DataFormatter();
	      String celldata=formatter.formatCellValue(cell);
	      return celldata;
	}
	

	catch (Exception e) {
		data ="";
	}

wb.close();
fi.close();
return data;

}

public static void setcelldata(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException {
	
	
	fi=new FileInputStream(xlfile);
	wb=new XSSFWorkbook(fi);
	ws=wb.getSheet(xlsheet);
	row=ws.getRow(rownum);
	cell=row.createCell(colnum);
	cell.setCellValue(data);
	fo=new FileOutputStream(xlfile);
	wb.write(fo);
	fo.close();wb.close();
	fi.close();
	
	
	
	
	
}










}
