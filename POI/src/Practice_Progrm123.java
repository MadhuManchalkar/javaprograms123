import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class ram
{
	static void display()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			fin=new FileInputStream("E:\\Demoworkspace\\POI\\DataFiles\\DataRuneer123.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet1");
			int r=sh.getPhysicalNumberOfRows();
			for(int i=1;i<r;i++)
			{
				
				row=sh.getRow(i);
				cell=row.getCell(0);
				String Methodname=cell.getStringCellValue();
				cell=row.getCell(1);
				String Packagename=cell.getStringCellValue();
				Class obj1=Class.forName(Packagename);
				Object     obj22=obj1.newInstance();
			    Method     method=obj22.getClass().getMethod(Methodname, null);
			    method.invoke(obj22, null);
				
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class Practice_Progrm123 {

	public static void main(String[] args) {
		ram.display();

	}

}
