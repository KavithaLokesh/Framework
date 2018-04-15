package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class Excel {
public static String getdata(String p,String s,int r,int c){
	String V="";
	try{
		Workbook wb=WorkbookFactory.create(new FileInputStream(p));
		V=wb.getSheet(s).getRow(r).getCell(c).toString();
	}
	catch(Exception e){
		
	}
	return V;
}
public static int getRowCount(String p,String s){
	int rc=0;
	try
	{
		Workbook wb=WorkbookFactory.create(new FileInputStream(p));
		rc=wb.getSheet(s).getLastRowNum();
	}
	catch(Exception e){}
	return rc;
	
				
	}
public static int getColumnCount(String p,String s,int r){
	int cc=0;
	try
	{
		Workbook wb=WorkbookFactory.create(new FileInputStream(p));
		cc=wb.getSheet(s).getRow(r).getLastCellNum();
	}
	catch(Exception e){}
	return cc;
	
				
	}

}


