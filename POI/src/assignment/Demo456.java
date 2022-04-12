package assignment;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


	

public class Demo456 {

	public static void main(String[] args) {
		display();
	}
	public static void display()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			fin=new FileInputStream("E:\\Demoworkspace\\POI\\DataFiles\\dataRunner.xlsx");
		wb=new XSSFWorkbook(fin);
		sh=wb.getSheet("Sheet1");
		int r=sh.getPhysicalNumberOfRows();
		for(int i=1;i<r;i++)
		{
			row=sh.getRow(i);
			cell=row.getCell(0);
			String Methodname=cell.getStringCellValue();
			cell=row.getCell(1);
			String packagename=cell.getStringCellValue();
			Class obj1=Class.forName(packagename);
			Object obj22=obj1.newInstance();
			Method method=obj22.getClass().getMethod(Methodname, null);
			method.invoke(obj22, null);
		}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}


}

