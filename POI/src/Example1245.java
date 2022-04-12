import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class Demom
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
			fin=new FileInputStream("E:\\Student478.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet1");
			int r=sh.getPhysicalNumberOfRows();
			for(int i=1;i<r;i++)
			{
				
				row=sh.getRow(i);
				int c=row.getPhysicalNumberOfCells();
				for(int j=0;j<c;j++)
				{
					cell=row.getCell(j);
					
					System.out.println(cell.getStringCellValue());
				}
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();;
		}
	}
	
	
}
public class Example1245 {
	

	public static void main(String[] args) {
		Demom.display();
	

	}

}
